package com.example.emp;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {EmpConfig.class})
public class EmpSteps {

    private Scenario scenario;
    @Autowired
    private EmployeeService employeeService;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("The following given data")
    public void theFollowingGivenData() {
    }

    @When("I sleep for the following time {int}")
    public void i_have_entered_the_parking_lot_at(int timeInMillis) throws InterruptedException {
        System.out.format("Thread ID - %2d - WHEN scenario %s.\n",
                Thread.currentThread().getId(), scenario);
        Thread.sleep(timeInMillis);
    }

    @When("test should be returning {string}")
    public void i_exit_the_parking_lot_at(String result) throws Exception {
        Assert.assertNotNull(employeeService);
        Assert.assertTrue(result.equals("true"));
    }

    @When("throw an exception")
    public void throwAnException() throws Exception {
        Thread.sleep(3000);
        throw new Exception("bla bla");
    }

    @Then("test should be returning")
    public void testShouldBeReturning() {

    }
}
