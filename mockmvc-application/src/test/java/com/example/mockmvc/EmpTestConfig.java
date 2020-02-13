package com.example.mockmvc;

import com.example.mockmvc.EmpConfig;
import com.example.mockmvc.EmployeeController;
import com.example.mockmvc.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@Configuration
@Import(EmpConfig.class)
public class EmpTestConfig {

    @Autowired
    private EmployeeService employeeService;
    @Bean
    public EmployeeController getEmployeeController(){
        return new EmployeeController(employeeService);
    };

    @Bean
    public MockMvc getMockMvc(EmployeeController employeeController){
        return MockMvcBuilders.standaloneSetup(employeeController).build();
    }
}
