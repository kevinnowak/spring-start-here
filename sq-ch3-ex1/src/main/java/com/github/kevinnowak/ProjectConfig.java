package com.github.kevinnowak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");

        return p;
    }
}
