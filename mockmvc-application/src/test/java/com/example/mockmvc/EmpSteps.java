package com.example.mockmvc;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes = {EmpTestConfig.class})
public class EmpSteps {

    @Autowired
    private MockMvc mvc;
    private ResultActions perform;

    @Given("you have the controller")
    public void youHaveTheController() {

    }

    @When("I execute the get command")
    public void iExecuteTheGetCommand() throws Exception {
        perform = mvc.perform(MockMvcRequestBuilders
                .get("/employees")
                .accept(MediaType.APPLICATION_JSON));
    }

    @Then("following {int} employees {int}")
    public void followingEmployeesEmpId(int totalEmp, int empId) throws Exception {
        perform.andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.employees").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$.employees", hasSize(2)));
//                .andExpect(MockMvcResultMatchers.jsonPath("$.employees", hasItem(empId)));
    }

    @When("I execute the get command on employeeId {int}")
    public void iExecuteTheGetCommandOnEmployeeId(int empId) throws Exception {
        perform = mvc.perform(MockMvcRequestBuilders
                .get("/employees/"+ empId)
                .accept(MediaType.APPLICATION_JSON));
    }


    @Then("employee have the following name {string}")
    public void employeeHaveTheFollowingName(String empName) throws Exception {
        perform.andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value(empName));
    }
}
