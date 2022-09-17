package com.employee_mangment.repos;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String location;
    private int pincode;

    public Employee(int employeeId, String employeeName, String location, int pincode) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.location = location;
        this.pincode = pincode;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
