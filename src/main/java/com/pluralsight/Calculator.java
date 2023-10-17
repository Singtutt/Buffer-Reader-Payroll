package com.pluralsight;
import java.io.BufferedReader;
import java.io.*;


public class Calculator {
    public static void displayInfo(Employee employee) { // "Get" and print employee data
        System.out.printf("Employee ID#: %d\n", employee.getEmployeeId());
        System.out.printf("First and Last Name: %s\n", employee.getName());
        System.out.printf("Gross Pay: %.2f\n", employee.getGrossPay());
    }
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src/main/resources/employees.csv"); // Step 1
            BufferedReader readBuff = new BufferedReader(readFile); // Read
            String input;
            boolean overLook = true;

            while ((input = readBuff.readLine()) != null) {
                if (overLook) {
                    overLook = false;
                    continue;
                }
                String[] line = input.split("\\|");
                if (line.length == 4) {
                    int employeeId = Integer.parseInt(line[0]);
                    String name = line[1];
                    double hoursWorked = Double.parseDouble(line[2]);
                    double payRate = Double.parseDouble(line[3]);
                    Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                    displayInfo(employee); // Display employee data
                }
            } readBuff.close(); // Exit program
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
