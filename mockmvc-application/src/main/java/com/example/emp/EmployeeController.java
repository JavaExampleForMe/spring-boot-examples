package com.example.emp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("emp")
@Slf4j
public class EmployeeController {

    Employees employees;

    public EmployeeController(Employees employees) {
        this.employees = employees;
    }

    //http://localhost:8090/emp/all
    @GetMapping(path = "all")
    public Employees play(HttpSession session) {
        return employees;
    }



}
