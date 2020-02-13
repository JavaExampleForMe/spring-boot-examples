package com.example.emp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.jcip.annotations.NotThreadSafe;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/serial"},
        plugin= {"timeline:target/reports/EmployeeSerialTests"})
@NotThreadSafe
public class EmployeeSerialTests {


}
