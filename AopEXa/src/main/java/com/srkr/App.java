package com.srkr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service =
                context.getBean(StudentService.class);

        System.out.println("Bean class: " + service.getClass());

        service.addStudent();

        System.out.println();

        service.deleteStudent();
    }
}