package com.srkr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public StudentService studentService() {
        return new StudentService();
    }
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}