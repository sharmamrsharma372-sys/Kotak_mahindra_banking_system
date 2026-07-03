// ======================================================
// Bank.java
// This class manages all bank accounts.
// ======================================================

// Import ArrayList to store multiple Account objects.
import java.util.ArrayList;

public class Bank {

    // ArrayList stores Account objects dynamically.
    private ArrayList<Account> accounts;

    // ======================================================
    // Constructor
    // Initializes the ArrayList.
    // ======================================================

    public Bank() {

        accounts = new ArrayList<>();

    }

    // ======================================================
    // Create Account
    // Adds a new account into the bank.
    // ======================================================

    public boolean createAccount(Account account) {

        // Check whether account number already exists.
        if (findAccount(account.getAccountNumber()) != null) {

            System.out.println("\nAccount Number Already Exists.");

            return false;
        }

        // Add account into ArrayList.
        accounts.add(account);

        System.out.println("\nAccount Created Successfully.");

        return true;

    }

    // ======================================================
    // Find Account
    // Searches account using account number.
    // ======================================================

    public Account findAccount(int accountNumber) {

        // Loop through every account.
        for (Account account : accounts) {

            // Compare account numbers.
            if (account.getAccountNumber() == accountNumber) {

                return account;

            }

        }

        // Return null if account not found.
        return null;

    }

    // ======================================================
    // Display All Accounts
    // ======================================================

    public void displayAllAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("\nNo Accounts Found.");

            return;

        }

        System.out.println("\n========== BANK ACCOUNTS ==========");

        for (Account account : accounts) {

            account.displayAccount();

        }

    }

    // ======================================================
    // Check Balance
    // ======================================================

    public void checkBalance(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account == null) {

            System.out.println("\nAccount Not Found.");

            return;

        }

        System.out.println("\n========== ACCOUNT VERIFIED ==========");

        System.out.println("Account Holder : " + account.getAccountHolderName());

        System.out.printf("Available Balance : ₹%.2f%n", account.getBalance());


    }

    // ======================================================
    // Deposit Money
    // ======================================================

    public void depositMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account == null) {

            System.out.println("Account Not Found.");

            return;

        }

        account.deposit(amount);

        System.out.println("\nDeposit Successful.");

        System.out.println("Updated Balance : ₹" + account.getBalance());

    }

    // ======================================================
    // Withdraw Money
    // ======================================================

    public void withdrawMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account == null) {

            System.out.println("Account Not Found.");

            return;

        }

        if (account.getBalance() < amount) {

            System.out.println("Insufficient Balance.");

            return;

        }

        account.withdraw(amount);

        System.out.println("\nWithdrawal Successful.");

        System.out.println("Updated Balance : ₹" + account.getBalance());

    }

}