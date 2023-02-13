package com.chuwa.springbasic.config;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.DataNucleusChuwaNoComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.chuwa.springbasic"})
public class BeanConfig {
    @Bean
    public JpaChuwa myDataNucleus() {
        return new DataNucleusChuwaNoComponent();
    }
}
