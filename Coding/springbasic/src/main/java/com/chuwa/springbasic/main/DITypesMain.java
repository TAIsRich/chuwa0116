package com.chuwa.springbasic.main;

import com.chuwa.springbasic.service.DITypes.DependencyInjectionTypesConstructor;
import com.chuwa.springbasic.service.DITypes.DependencyInjectionTypesField;
import com.chuwa.springbasic.service.DITypes.DependencyInjectionTypesSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.chuwa.springbasic"})
public class DITypesMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DITypesMain.class);

        DependencyInjectionTypesField field = context.getBean("dependencyInjectionTypesField", DependencyInjectionTypesField.class);
        DependencyInjectionTypesConstructor constructor = context.getBean("dependencyInjectionTypesConstructor", DependencyInjectionTypesConstructor.class);
        DependencyInjectionTypesSetter setter = context.getBean("dependencyInjectionTypesSetter", DependencyInjectionTypesSetter.class);
        System.out.println("");
        field.printMessage();
        constructor.printMessage();
        setter.printMessage();
    }
}
