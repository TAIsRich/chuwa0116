package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionByTypeByName {

    @Autowired
    private HibernateChuwa hibernate;

    @Autowired
    private JpaChuwa hibernateChuwa;

    @Autowired
    private JpaChuwa eclipseLinkChuwa;

    @Autowired
    private JpaChuwa myDataNucleus;

    @Autowired
    @Qualifier("hibernateChuwa")
    private JpaChuwa jpaChuwaQualifier;

    public void printFirstMessage() {
        System.out.print("By Type(HibernateChuwa hibernate)         : ");
        hibernate.printMessage();

        System.out.print("By Name(JpaChuwa hibernateChuwa)          : ");
        hibernateChuwa.printMessage();
        System.out.print("By Name(JpaChuwa eclipsedLinkChuwa)       : ");
        eclipseLinkChuwa.printMessage();

        System.out.print("By Name and @Bean:(myDataNucleus())       : ");
        myDataNucleus.printMessage();

        System.out.print("By @Qualifier(\"hibernateChuwa\")         : ");
        jpaChuwaQualifier.printMessage();
    }
}
