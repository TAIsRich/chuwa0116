package com.chuwa.springbasic.service.coupling;

import com.chuwa.springbasic.service.dependencies.JpaICC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjection {
    @Autowired
    private JpaICC jpaICC;

    public void printMessage() {
        jpaICC.printMessage();
    }
}
