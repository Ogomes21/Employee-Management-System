package com.Employee.controller;
import com.Employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//controller from where all APIs will be handled

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    //business logic

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
