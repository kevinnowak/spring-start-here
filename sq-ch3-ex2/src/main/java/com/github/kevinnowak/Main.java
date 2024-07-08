package com.github.kevinnowak;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.printf("Person's name: %s\n", person.getName());
        System.out.printf("Parrot's name: %s\n", parrot.getName());
        System.out.printf("Person's parrot: %s\n", person.getParrot().getName());
    }
}