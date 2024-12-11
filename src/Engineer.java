public class Engineer extends Employee {
    public Engineer(String name, double salary, String department) {
        super(name, salary, department);
    }

    // Override the abstract method from Employee class
    @Override
    public String getRole() {
        return "Engineer";
    }
}
