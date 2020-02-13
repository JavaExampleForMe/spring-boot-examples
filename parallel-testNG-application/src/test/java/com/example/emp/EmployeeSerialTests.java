package com.example.emp;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.jcip.annotations.NotThreadSafe;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features/serial"},
        plugin= {"timeline:target/reports/EmployeeSerialTests"})
public class EmployeeSerialTests  extends AbstractTestNGCucumberTests {


}
