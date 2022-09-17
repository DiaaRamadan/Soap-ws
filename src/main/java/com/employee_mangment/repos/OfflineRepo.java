package com.employee_mangment.repos;

import com.employee_mangment.hrms.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

public class OfflineRepo {

    public static List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Koko", "Cairo", 12345));
        employees.add(new Employee(2, "Koko2", "Cairo", 12345));
        employees.add(new Employee(3, "Koko3", "Cairo", 12345));
        employees.add(new Employee(4, "Koko4", "Cairo", 12345));
        return employees;
    }

}
