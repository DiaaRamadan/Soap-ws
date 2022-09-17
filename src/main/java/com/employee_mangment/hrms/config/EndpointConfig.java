package com.employee_mangment.hrms.config;

import com.employee_mangment.hrms.*;
import com.employee_mangment.repos.Employee;
import com.employee_mangment.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.List;
import java.util.stream.Collectors;

@Endpoint
public class EndpointConfig {

    private static final String NAMESPACE_URI = "http://employee_mangment.com/hrms";

    private final EmployeeServiceImp employeeServiceImp;

    @Autowired
    public EndpointConfig(EmployeeServiceImp employeeServiceImp) {
        this.employeeServiceImp = employeeServiceImp;
    }

    @PayloadRoot(localPart = "GetEmployeeRequest", namespace = NAMESPACE_URI)
    @ResponsePayload
    public JAXBElement<GetEmployeeResponse> getEmployee(@RequestPayload GetEmployeeRequest request) {
        GetEmployeeResponse response = new GetEmployeeResponse();
        Employee employee = employeeServiceImp.getEmployee(request.getEmployeeId());
        EmployeeDetails employeeDetails = mapEmployee(employee);
        response.setEmployeeDetails(employeeDetails);
        return new ObjectFactory().createGetEmployeeResponse(response);
    }

    @PayloadRoot(localPart = "GetAllEmployeeRequest", namespace = NAMESPACE_URI)
    @ResponsePayload
    public JAXBElement<GetAllEmployeeResponse> getAllEmployees(){
        GetAllEmployeeResponse response = new GetAllEmployeeResponse();
        List<EmployeeDetails> employeesDetail =  employeeServiceImp.getEmployees().stream().
                map(this::mapEmployee).collect(Collectors.toList());
        response.getEmployeeDetails().addAll(employeesDetail);

        return new ObjectFactory().createGetAllEmployeeResponse(response);
    }

    @PayloadRoot(localPart = "RemoveEmployeeRequest", namespace = NAMESPACE_URI)
    @ResponsePayload
    public JAXBElement<RemoveEmployeeResponse> removeEmployee(@RequestPayload RemoveEmployeeRequest request){
        RemoveEmployeeResponse response = new RemoveEmployeeResponse();
        boolean status = employeeServiceImp.removeEmployee(request.getEmployeeId());
        response.setStatus(status);
        return new ObjectFactory().createRemoveEmployeeResponse(response);
    }

    private  EmployeeDetails mapEmployee(Employee employee) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployeeId(employee.getEmployeeId());
        employeeDetails.setEmployeeName(employee.getEmployeeName());
        employeeDetails.setLocation(employee.getLocation());
        employeeDetails.setPincode(employee.getPincode());
        return employeeDetails;
    }
}
