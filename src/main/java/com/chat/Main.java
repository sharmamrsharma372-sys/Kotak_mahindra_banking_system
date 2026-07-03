// =============================================================
// Main.java
// Author : Saketh
// Project : Core Java Banking System
// Description :
// This is the entry point of the application.
// The program starts executing from the main() method.
// =============================================================

// Import Scanner class for taking user input.
import java.util.Scanner;

// Main Class
public class Main {

    // Main Method
    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Create Bank Object
        Bank bank = new Bank();

        // Create Transaction Object
        Transaction transaction = new Transaction(bank);

        // Variable for menu choice
        int choice;

        // Infinite loop
        while (true) {

            System.out.println("\n=========================================");
            System.out.println("        KOTAKMAHINDRA BANK MANAGEMENT SYSTEM");
            System.out.println("=========================================");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Transfer Money");
            System.out.println("7. Exit");
            System.out.println("=========================================");

            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            // Remove newline
            sc.nextLine();

            switch (choice) {

                // =============================================
                // CREATE ACCOUNT
                // =============================================

                case 1:

                    System.out.println("\n----------- CREATE ACCOUNT -----------");

                    System.out.print("Enter Account Number : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Mobile Number : ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    System.out.print("Enter Branch Name : ");
                    String branch = sc.nextLine();

                    System.out.print("Enter IFSC Code : ");
                    String ifsc = sc.nextLine();

                    System.out.print("Enter Account Type (Savings/Current) : ");
                    String type = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    double balance = sc.nextDouble();

                    // Create Account Object
                    Account account = new Account(
                            accountNumber,
                            name,
                            mobile,
                            email,
                            branch,
                            ifsc,
                            type,
                            balance
                    );

                    // Add account into bank
                    bank.createAccount(account);

                    break;

                // =============================================
                // DISPLAY ALL ACCOUNTS
                // =============================================

                case 2:

                    bank.displayAllAccounts();

                    break;

                // =============================================
                // CHECK BALANCE
                // =============================================

                case 3:

                    System.out.print("\nEnter Account Number : ");

                    int accNo = sc.nextInt();

                    bank.checkBalance(accNo);

                    break;

                // =============================================
                // DEPOSIT MONEY
                // =============================================

                case 4:

                    System.out.print("\nEnter Account Number : ");

                    int depositAccount = sc.nextInt();

                    System.out.print("Enter Deposit Amount : ");

                    double depositAmount = sc.nextDouble();

                    bank.depositMoney(depositAccount, depositAmount);

                    break;

                // =============================================
                // WITHDRAW MONEY
                // =============================================

                case 5:

                    System.out.print("\nEnter Account Number : ");

                    int withdrawAccount = sc.nextInt();

                    System.out.print("Enter Withdrawal Amount : ");

                    double withdrawAmount = sc.nextDouble();

                    bank.withdrawMoney(withdrawAccount, withdrawAmount);

                    break;

                // =============================================
                // TRANSFER MONEY
                // =============================================

                case 6:

                    System.out.print("\nEnter Sender Account Number : ");

                    int sender = sc.nextInt();

                    System.out.print("Enter Receiver Account Number : ");

                    int receiver = sc.nextInt();

                    System.out.print("Enter Transfer Amount : ");

                    double amount = sc.nextDouble();

                    transaction.transferMoney(
                            sender,
                            receiver,
                            amount
                    );

                    break;

                // =============================================
                // EXIT
                // =============================================

                case 7:

                    System.out.println("\n================================");
                    System.out.println("Thank You For Using ABC Bank");
                    System.out.println("Visit Again...");
                    System.out.println("================================");

                    sc.close();

                    System.exit(0);

                    break;

                // =============================================
                // INVALID CHOICE
                // =============================================

                default:

                    System.out.println("\nInvalid Choice!");

                    System.out.println("Please Enter 1 to 7.");

            }

        }

    }

}