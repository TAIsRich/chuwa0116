package com.chuwa.redbook.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.SQLOutput;

public class PasswordEncoderGenerator {
    public static void main(String [] args){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("chuwa"));
    }
}
