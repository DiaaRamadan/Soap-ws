package com.employee_mangment.service;

import com.employee_mangment.repos.Employee;
import com.employee_mangment.repos.OfflineRepo;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp {

    private List<Employee> employees = OfflineRepo.getEmployee();
    public Employee getEmployee(int employeeId) {
        Optional<Employee> employee = employees.stream().filter(employee1 -> employeeId == employee1.getEmployeeId()).findFirst();
        return employee.get();
    }

    public List<Employee> getEmployees(){
        return  employees;
    }

    public boolean removeEmployee(int id){
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee next = iterator.next();
            if (next.getEmployeeId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
