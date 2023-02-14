package com.chuwa.springbasic.service.DITypes;

import com.chuwa.springbasic.service.dependencies.JpaICC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTypesField {

    @Autowired
    private JpaICC jpaICC;

    public void setJpaICC(JpaICC jpaICC) {
        this.jpaICC = jpaICC;
    }

    public void printMessage() {
        jpaICC.printMessage();
    }
}
