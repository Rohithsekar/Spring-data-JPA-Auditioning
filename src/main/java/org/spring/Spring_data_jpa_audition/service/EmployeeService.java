package org.spring.Spring_data_jpa_audition.service;

import org.spring.Spring_data_jpa_audition.dto.InputRequest;
import org.spring.Spring_data_jpa_audition.model.Employee;
import org.spring.Spring_data_jpa_audition.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository repository;

    public String saveEmployee(InputRequest<Employee> request){
        String currentUser = request.getLoggedInUser();
        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
        Employee employee = request.getEmployee();
        employee.setCreatedBy(currentUser);
        repository.save(employee);
        return "Employee saved successfully...";

    }

    public String updateEmployee(int id, double salary, InputRequest<Employee> request){
        Employee employee = repository.findById(id).get();
        if(employee!=null){
            employee.setSalary(salary);
            employee.setModifiedBy(request.getLoggedInUser());
            repository.save(employee);
        }
        else{
            throw new RuntimeException("Employee not found with id" + id);
        }
        return "Employee updated successfully...";

    }



}
