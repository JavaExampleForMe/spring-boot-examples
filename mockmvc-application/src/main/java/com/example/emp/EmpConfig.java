package com.example.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    @Bean
    public Employees getEmployees(){
        Employees employees = new Employees();
        Employee employee = new Employee(1, "Ida", "Ammit", "IDa.Amit@nice.com");
        employees.addEmployee(employee);
        employee = new Employee(2, "Saar", "Avraham", "Saara@nice.com");
        employees.addEmployee(employee);
        return employees;
    };
}
