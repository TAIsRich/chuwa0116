package com.chuwa.springbasic.main;

import com.chuwa.springbasic.components.impl.EclipseLinkChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;
import com.chuwa.springbasic.service.coupling.DependencyInjection;
import com.chuwa.springbasic.service.coupling.LooseCoupling;
import com.chuwa.springbasic.service.coupling.TightCoupling;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.chuwa.springbasic"})
public class CouplingMain {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(CouplingMain.class);

        System.out.println("\n****  Tight Coupling *******");
        TightCoupling tightCoupling = new TightCoupling();
        tightCoupling.printMessage();
        System.out.println("要去改TightCoupling代码才能换成EclipseLinkChuwa");

        /**
         * 我们想用哪个impl，就在构造器里放哪个。
         */
        System.out.println("\n****  Loose Coupling *******");
        LooseCoupling looseCoupling = new LooseCoupling(new HibernateChuwa());
        looseCoupling.printMessage();
        LooseCoupling looseCoupling2 = new LooseCoupling(new EclipseLinkChuwa());
        looseCoupling2.printMessage();

        /**
         * IOC inject the bean
         */
        System.out.println("\n**** Dependency Injection *******");
        DependencyInjection dependencyInjection = context.getBean("dependencyInjection", DependencyInjection.class);
        dependencyInjection.printMessage();
        System.out.println("我们不new，IOC容器new, 我们从IOC容器中取object");

    }
}
