package com.chuwa.redbook.controller;

import com.chuwa.redbook.dao.security.RoleRepository;
import com.chuwa.redbook.dao.security.UserRepository;
import com.chuwa.redbook.entity.security.Role;
import com.chuwa.redbook.entity.security.User;
import com.chuwa.redbook.payload.security.LogInDto;
import com.chuwa.redbook.payload.security.SignUpDto;
import com.chuwa.redbook.service.security.CustomUserDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

import java.util.Collections;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LogInDto logInDto) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(
                        logInDto.getAccountOrEmail(),
                        logInDto.getPassword()
                ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new ResponseEntity<>("User sign-in successfully!", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody SignUpDto signUpDto) {
        if(customUserDetailsService.existsByAccount(signUpDto.getAccount())) {
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }
        if(customUserDetailsService.existsByEmail(signUpDto.getEmail())) {
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }
        customUserDetailsService.createUser(signUpDto);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }
}
