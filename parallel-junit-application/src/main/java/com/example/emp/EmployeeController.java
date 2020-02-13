package com.example.emp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("employees")
@Slf4j
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //http://localhost:8090/employees
    @GetMapping(value = "")
    public Employees getAllEmployees() {
        return employeeService.getEmployees();
    }

    //http://localhost:8090/employees/1
    @GetMapping(value = "/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    // POST http://localhost:8090/employees
//    {
//        "employeeId": 4,
//            "firstName": "Ida",
//            "lastName": "Ammit",
//            "email": "IDa.Amit@nice.com"
//    }
    @PostMapping(value = "")
    public ResponseEntity<Employee> addEmployee (@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }
}
