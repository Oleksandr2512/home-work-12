import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts; // Collection of bank accounts

    // Constructor for Bank
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to create a new account
    public BankAccount createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount newAccount = new BankAccount(accountNumber, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created: " + accountNumber);
            return newAccount;
        } else {
            System.out.println("An account with this number already exists.");
            return null;
        }
    }

    // Method to block an account
    public void blockAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.setBlocked(true);
            System.out.println("Account " + accountNumber + " is blocked.");
        } else {
            System.out.println("Account with this number not found.");
        }
    }

    // Method to unblock an account
    public void unblockAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.setBlocked(false);
            System.out.println("Account " + accountNumber + " is unblocked.");
        } else {
            System.out.println("Account with this number not found.");
        }
    }

    // Method to get an account by its number
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
