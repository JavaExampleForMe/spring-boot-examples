package com.example.emp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/parralel"},
        plugin= {"timeline:target/reports/EmployeeGroup1Tests"})
public class EmployeeGroup1Tests {


}
