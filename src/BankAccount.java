public class BankAccount {
    private String accountNumber; // Account number
    private double balance; // Account balance
    private boolean isBlocked; // Account status (blocked/unblocked)

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isBlocked = false; // Account is initially not blocked
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for isBlocked status
    public boolean isBlocked() {
        return isBlocked;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Setter for isBlocked status
    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    // Method for depositing money into the account
    public void deposit(double amount) {
        if (amount > 0 && !isBlocked) {
            balance += amount;
            System.out.println("Deposited " + amount + " into the account.");
        } else if (isBlocked) {
            System.out.println("The account is blocked. Unable to perform the operation.");
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    // Method for withdrawing money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && !isBlocked) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from the account.");
        } else if (isBlocked) {
            System.out.println("The account is blocked. Unable to perform the operation.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds in the account.");
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    // Method for transferring money between accounts
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance && !isBlocked && !targetAccount.isBlocked()) {
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("Transferred " + amount + " to account " + targetAccount.getAccountNumber());
        } else if (isBlocked) {
            System.out.println("The account is blocked. Unable to perform the operation.");
        } else if (targetAccount.isBlocked()) {
            System.out.println("Target account is blocked.");
        } else {
            System.out.println("Invalid amount for the transfer.");
        }
    }
}
