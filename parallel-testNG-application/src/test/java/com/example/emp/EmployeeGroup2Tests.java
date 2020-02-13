package com.example.emp;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.jcip.annotations.NotThreadSafe;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features/parralel2"},
        plugin= {"timeline:target/reports/EmployeeGroup2Tests"})
public class EmployeeGroup2Tests  extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
