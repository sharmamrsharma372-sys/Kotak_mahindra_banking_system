// ======================================================
// Transaction.java
// This class is responsible for transferring money
// between two bank accounts.
// ======================================================

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    // Reference to the Bank object.
    private Bank bank;

    // ======================================================
    // Constructor
    // Receives the Bank object.
    // ======================================================

    public Transaction(Bank bank) {

        this.bank = bank;

    }

    // ======================================================
    // Transfer Money
    // ======================================================

    public void transferMoney(int senderAccountNumber,
                              int receiverAccountNumber,
                              double amount) {

        // Search sender account.
        Account sender = bank.findAccount(senderAccountNumber);

        // Search receiver account.
        Account receiver = bank.findAccount(receiverAccountNumber);

        // Check sender exists.
        if (sender == null) {

            System.out.println("\nSender Account Not Found.");

            return;

        }

        // Check receiver exists.
        if (receiver == null) {

            System.out.println("\nReceiver Account Not Found.");

            return;

        }

        // Prevent transferring to the same account.
        if (senderAccountNumber == receiverAccountNumber) {

            System.out.println("\nSender and Receiver cannot be the same.");

            return;

        }

        // Validate amount.
        if (amount <= 0) {

            System.out.println("\nInvalid Amount.");

            return;

        }

        // Check balance.
        if (sender.getBalance() < amount) {

            System.out.println("\nInsufficient Balance.");

            return;

        }

        // Display balances before transaction.
        System.out.println("\n========== BEFORE TRANSACTION ==========");

        System.out.println("Sender Balance   : ₹" + sender.getBalance());

        System.out.println("Receiver Balance : ₹" + receiver.getBalance());

        // Debit sender.
        sender.withdraw(amount);

        // Credit receiver.
        receiver.deposit(amount);

        // Generate UTR.
        String utr = generateUTR();

        // Print receipt.
        System.out.println("\n========================================");
        System.out.println("      TRANSACTION SUCCESSFUL");
        System.out.println("========================================");

        System.out.println("UTR ID             : " + utr);

        System.out.println("Transferred Amount : ₹" + amount);

        System.out.println();

        System.out.println("FROM ACCOUNT");

        sender.displayAccount();

        System.out.println();

        System.out.println("TO ACCOUNT");

        receiver.displayAccount();

        System.out.println("\n========== AFTER TRANSACTION ==========");

        System.out.println("Sender Balance   : ₹" + sender.getBalance());

        System.out.println("Receiver Balance : ₹" + receiver.getBalance());

    }

    // ======================================================
    // Generate UTR Number
    // ======================================================

    private String generateUTR() {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        return "UTR" + now.format(formatter);

    }

}