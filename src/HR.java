public class HR extends Employee {
    // Constructor for HR class
    public HR(String name, double salary, String department) {
        super(name, salary, department);
    }

    // Override the abstract method from Employee class
    @Override
    public String getRole() {
        return "HR";
    }
}
