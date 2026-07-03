// ======================================================
// Account.java
// This class represents one bank customer's account.
// It stores all account-related information.
// ======================================================

public class Account {

    // Account Number (Unique ID)
    private int accountNumber;

    // Customer Name
    private String accountHolderName;

    // Mobile Number
    private String mobileNumber;

    // Email Address
    private String email;

    // Branch Name
    private String branchName;

    // IFSC Code
    private String ifscCode;

    // Account Type (Savings / Current)
    private String accountType;

    // Current Account Balance
    private double balance;

    // ======================================================
    // Constructor
    // This constructor is called whenever a new account
    // object is created.
    // ======================================================

    public Account(int accountNumber,
                   String accountHolderName,
                   String mobileNumber,
                   String email,
                   String branchName,
                   String ifscCode,
                   String accountType,
                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.balance = balance;
    }

    // ======================================================
    // Getter Methods
    // Used to access private variables.
    // ======================================================

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // ======================================================
    // Deposit Method
    // Adds money into account.
    // ======================================================

    public void deposit(double amount) {
        balance += amount;
    }

    // ======================================================
    // Withdraw Method
    // Deducts money from account.
    // ======================================================

    public void withdraw(double amount) {
        balance -= amount;
    }

    // ======================================================
    // Display Account Details
    // Prints complete customer information.
    // ======================================================

    public void displayAccount() {

        System.out.println("------------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Email          : " + email);
        System.out.println("Branch         : " + branchName);
        System.out.println("IFSC Code      : " + ifscCode);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("------------------------------------------");
    }

}