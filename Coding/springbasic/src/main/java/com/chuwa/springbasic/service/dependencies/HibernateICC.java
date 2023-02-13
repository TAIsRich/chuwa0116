package com.chuwa.springbasic.service.dependencies;

import org.springframework.stereotype.Component;

@Component
public class HibernateICC implements JpaICC{
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
