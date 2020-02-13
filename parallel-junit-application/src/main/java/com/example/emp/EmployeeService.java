package com.example.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        Employee employee = new Employee(1, "firstName1", "Ammit", "IDa.Amit@nice.com");
        employees.add(employee);
        employee = new Employee(2, "firstName2", "Avraham", "Saara@nice.com");
        employees.add(employee);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee getEmployeeById(int employeeId){
        return employees.stream().filter(emp -> emp.getEmployeeId()== employeeId).findFirst().orElse(new Employee(-1, "not existing", "not existing", "not existing"));
    }

    public Employees getEmployees(){
        Employees employees = new Employees();
        employees.setEmployees(this.employees);
        return employees;
    }
}
