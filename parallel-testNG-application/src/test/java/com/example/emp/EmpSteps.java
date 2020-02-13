package com.example.emp;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;

@ContextConfiguration(classes = {EmpConfig.class})
public class EmpSteps {


    @Autowired
    private EmployeeService employeeService;



    @Given("The following given data")
    public void theFollowingGivenData() {
    }

    @When("I sleep for the following time {int}")
    public void i_have_entered_the_parking_lot_at(int timeInMillis) throws InterruptedException {
        System.out.format("Thread ID - %2d - WHEN .\n",
                Thread.currentThread().getId());
        Thread.sleep(timeInMillis);
    }

    @When("test should be returning {string}")
    public void i_exit_the_parking_lot_at(String result) throws Exception {
        Assert.assertNotNull(employeeService);
        Assert.assertTrue(result.equals("true"));
    }
}
