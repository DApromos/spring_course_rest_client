package com.dmitriyabramovskyi.spring.rest;

import com.dmitriyabramovskyi.spring.rest.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Communication {

    public List<Employee> showAllEmployees() {
        return null;
    }

    public Employee getEmployee(int id) {
        return null;
    }

    public void saveEmployee(Employee employee) {

    }

    public void deleteEmployee(int id) {

    }

}
