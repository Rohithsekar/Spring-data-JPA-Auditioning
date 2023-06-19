package org.spring.Spring_data_jpa_audition.repository;

import org.spring.Spring_data_jpa_audition.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
