import java.util.ArrayList;
import java.util.List;

public class PersonnelManagementSystem {
    private List<Employee> employees; // List to store all employees

    // Constructor for PersonnelManagementSystem
    public PersonnelManagementSystem() {
        employees = new ArrayList<>();
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getRole() + " " + employee.getName() + " has been added.");
    }

    // Method to remove an employee by name
    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
        System.out.println("Employee " + name + " has been removed.");
    }

    // Method to calculate the total salary of the company
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // Method to calculate the average salary of the employees
    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0;
        }
        return calculateTotalSalary() / employees.size();
    }

    // Method to display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            for (Employee employee : employees) {
                System.out.println("Name: " + employee.getName() + ", Role: " + employee.getRole() +
                        ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
            }
        }
    }
}
