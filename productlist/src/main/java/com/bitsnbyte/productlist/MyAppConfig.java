package com.bitsnbyte.productlist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// when we dont write component at thet time this operation automatically call and thet will return a class
@Configuration
public class MyAppConfig {
    @Bean
    public MyComponent myComponent(){
        return new MyComponent();
    }
}
