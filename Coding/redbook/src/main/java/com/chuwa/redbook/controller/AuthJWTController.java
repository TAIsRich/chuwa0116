package com.chuwa.redbook.controller;

import com.chuwa.redbook.dao.security.RoleRepository;
import com.chuwa.redbook.dao.security.UserRepository;
import com.chuwa.redbook.entity.security.Role;
import com.chuwa.redbook.entity.security.User;
import com.chuwa.redbook.payload.security.JWTAuthResponse;
import com.chuwa.redbook.payload.security.LoginDto;
import com.chuwa.redbook.payload.security.SignUpDto;
import com.chuwa.redbook.security.JwtTokenProvider;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;


@RestController
@RequestMapping("/api/v1/auth/jwt")
public class AuthJWTController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private JwtTokenProvider tokenProvider;
    private ModelMapper modelMapper;
    private static final Logger logger= LoggerFactory.getLogger(AuthJWTController.class);

    @PostMapping("/signin")
    public ResponseEntity<JWTAuthResponse> authenticateUser(@RequestBody LoginDto loginDto){
        logger.info(loginDto.getAccountOrEmail()+"is trying to sign in our application");

        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getAccountOrEmail(),loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token=tokenProvider.generateToken(authentication);
        JWTAuthResponse jwtAuthResponse=new JWTAuthResponse(token);
        jwtAuthResponse.setAccessToken("JWT");
        logger.info(loginDto.getAccountOrEmail()+"sign in successfully");
        return ResponseEntity.ok(jwtAuthResponse);
    }


    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto){
        logger.info("New User is trying to sign up for our application");

        if(userRepository.existsByAccount(signUpDto.getAccount())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);

        }

        if(userRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Email is already taken!",HttpStatus.BAD_REQUEST);

        }
        User user= modelMapper.map(signUpDto,User.class);

        Role roles=null;
        if(signUpDto.getAccount().contains("chuwa")){
            roles=roleRepository.findByName("ROLE_ADMIN").get();
        }else{
            roles=roleRepository.findByName("ROLE_USER").get();
        }
        user.setRoles(Collections.singleton(roles));
        userRepository.save(user);
        logger.info("User registered successfully");

        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }
}
