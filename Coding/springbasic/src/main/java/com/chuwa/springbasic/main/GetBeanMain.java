package com.chuwa.springbasic.main;

import com.chuwa.springbasic.config.BeanConfig;
import com.chuwa.springbasic.service.DependencyInjectionByTypeByName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetBeanMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        /**
         * 1. Retrieving Bean by Name and Type
         * 2. Retrieving Bean by Name
         * 3. Retrieving Bean by Type
         */

        System.out.println("\n ******  1. Retrieving Bean by Name and Type *****");
        // 1. Retrieving Bean by Name and Type
        context.getBean("dependencyInjectionByTypeByName", DependencyInjectionByTypeByName.class).printFirstMessage();

        System.out.println("\n ******  2. Retrieving Bean by Name *****");
        // 2. Retrieving Bean by Name
        Object o = context.getBean("dependencyInjectionByTypeByName");
        DependencyInjectionByTypeByName di = (DependencyInjectionByTypeByName) o;
        di.printFirstMessage();

        System.out.println("\n ******  or *****");
        // or
        ((DependencyInjectionByTypeByName) context.getBean("dependencyInjectionByTypeByName")).printFirstMessage();

        // 3. Retrieving Bean by Type
        System.out.println("\n ******  3. Retrieving Bean by Type *****");
        context.getBean(DependencyInjectionByTypeByName.class).printFirstMessage();
    }
}
