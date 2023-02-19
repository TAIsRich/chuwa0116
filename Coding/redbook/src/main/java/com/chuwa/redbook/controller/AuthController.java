package com.chuwa.redbook.controller;


import com.chuwa.redbook.dao.security.RoleRepository;
import com.chuwa.redbook.dao.security.UserRepository;
import com.chuwa.redbook.entity.security.User;
import com.chuwa.redbook.payload.security.LoginDto;
import com.chuwa.redbook.payload.security.SignUpDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    private ModelMapper modelMapper;
    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getAccountOrEmail(),loginDto.getPassword()
        ));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new ResponseEntity<>("User sign-in successfully!", HttpStatus.OK);
    }


    @PostMapping("/signup")
    public ResponseEntity<?> resigterUser(@RequestBody SignUpDto signUpDto){
        if(userRepository.existsByAccount(signUpDto.getAccount())){
            return new ResponseEntity<>("Username is already taken!",HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        User user=modelMapper.map(signUpDto,User.class);
        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);

    }
}
