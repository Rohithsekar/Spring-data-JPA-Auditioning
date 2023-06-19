package org.spring.Spring_data_jpa_audition.controller;

import org.spring.Spring_data_jpa_audition.dto.InputRequest;
import org.spring.Spring_data_jpa_audition.model.Employee;
import org.spring.Spring_data_jpa_audition.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody InputRequest<Employee> request){
        return service.saveEmployee(request);
    }

    @PutMapping("/updateEmployee/{id}/{salary}")
    public String updateEmployeeSalary(@PathVariable  int id,@PathVariable double salary,@RequestBody InputRequest<Employee> request){
        return service.updateEmployee(id,salary,request);

    }


}
