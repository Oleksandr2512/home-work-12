public abstract class Employee {
    private String name; // Employee's name
    private double salary; // Employee's salary
    private String department; // Department of the employee

    // Constructor for Employee class
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Abstract method to get the employee's role (implemented by subclasses)
    public abstract String getRole();
}
