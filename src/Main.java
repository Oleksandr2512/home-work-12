//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        Book book1 = new Book("1983", "Sasha", 1964);
        Book book2 = new Book("To Kill a Mockingbird", "Dima", 1969);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Total books: " + library.countBooks());
        System.out.println("Search by author 'Sasha': " + library.searchByAuthor("Sasha"));
        library.removeBook("1983");
        System.out.println("Total books after removal: " + library.countBooks());

        System.out.println("Task02");
        // Creating the bank
        Bank bank = new Bank();

        // Creating two bank accounts
        BankAccount account1 = bank.createAccount("12345", 1000);
        BankAccount account2 = bank.createAccount("67890", 500);

        // Depositing money into account 1
        account1.deposit(200);

        // Withdrawing money from account 1
        account1.withdraw(300);

        // Transferring money between accounts
        account1.transfer(account2, 100);

        // Blocking account 1
        bank.blockAccount("12345");

        // Attempting to deposit money into a blocked account
        account1.deposit(50);

        // Unblocking account 1
        bank.unblockAccount("12345");

        // Depositing money into account 1 after unblocking
        account1.deposit(50);

        System.out.println("Task03");
        // Create a personnel management system
        PersonnelManagementSystem system = new PersonnelManagementSystem();

        // Add employees
        Employee emp1 = new Manager("Alice", 5000, "Sales");
        Employee emp2 = new Engineer("Bob", 4000, "Engineering");
        Employee emp3 = new HR("Charlie", 3500, "HR");
        system.addEmployee(emp1);
        system.addEmployee(emp2);
        system.addEmployee(emp3);

        // Display all employees
        system.displayEmployees();

        // Calculate and display total salary
        double totalSalary = system.calculateTotalSalary();
        System.out.println("Total salary of the company: " + totalSalary);

        // Calculate and display average salary
        double averageSalary = system.calculateAverageSalary();
        System.out.println("Average salary of the employees: " + averageSalary);

        // Remove an employee and display again
        system.removeEmployee("Bob");
        system.displayEmployees();
    }
}

