public class Manager extends Employee {
    public Manager(String name, double salary, String department) {
        super(name, salary, department);
    }

    // Override the abstract method from Employee class
    @Override
    public String getRole() {
        return "Manager";

    }
}
