package com.atguigu.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestBCryptPasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String code = bCryptPasswordEncoder.encode("123");
        System.out.println("code = " + code);
        System.out.println("$2a$10$y23SUxPCH1eO5paodC6yQO0iDnKOFxrh2nwtlQKnm6Gw0B/TZwvr.".length() );
    }
}
