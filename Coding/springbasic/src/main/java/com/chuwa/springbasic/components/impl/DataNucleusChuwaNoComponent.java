package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;

public class DataNucleusChuwaNoComponent implements JpaChuwa {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName() + " - No @Component. By @Bean!");
    }
}
