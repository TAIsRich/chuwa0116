package com.chuwa.springbasic.main;

import com.chuwa.springbasic.config.BeanConfig;
import com.chuwa.springbasic.service.DependencyInjectionByTypeByName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocContainerApplication {

    public static void main(String[] args) {
        // 容器1
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.getBean("dependencyInjectionByTypeByName", DependencyInjectionByTypeByName.class).printFirstMessage();

        // 容器2
        ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);
        context2.getBean("dependencyInjectionByTypeByName", DependencyInjectionByTypeByName.class).printFirstMessage();

        //  容器3
        ApplicationContext context3 = new ClassPathXmlApplicationContext("bean2.xml");
    }

}