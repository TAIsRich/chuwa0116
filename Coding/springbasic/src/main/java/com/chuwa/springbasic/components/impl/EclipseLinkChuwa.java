package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.stereotype.Component;

@Component
public class EclipseLinkChuwa implements JpaChuwa {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
