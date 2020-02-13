package com.example.emp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/parralel2"},
        plugin= {"timeline:target/reports/EmployeeGroup2Tests"})
public class EmployeeGroup2Tests {


}
