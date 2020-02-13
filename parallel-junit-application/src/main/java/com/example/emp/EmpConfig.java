package com.example.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    @Bean
    public EmployeeService getEmployees(){
        return new EmployeeService();
    };
}
