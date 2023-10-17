package com.pluralsight;

public class Employee { // Private data members
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public int getEmployeeId() {
        return employeeId;
    } public String getName() {
        return name;
    } public double getHoursWorked() {
        return hoursWorked;
    } public double getPayRate(){
        return payRate;
    } // Getters block
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    } public void setName(String name) {
        this.name = name;
    } public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    } public void setPayRate(double payRate) {
        this.payRate = payRate;
    } // Setters block
    public double getGrossPay() { // Gross pay block
        return hoursWorked * payRate;
    }
}
