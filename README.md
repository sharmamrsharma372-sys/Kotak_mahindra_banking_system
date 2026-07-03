# 💳 Kotak Mahindra Banking System

 
---

# 🏦 Kotak Mahindra Banking System

A professional **Console-Based Banking Application** developed using **Core Java**, **Object-Oriented Programming (OOP)** principles, and **Maven**.

This project simulates real-world banking operations through a menu-driven console interface. Users can create accounts dynamically, manage balances, perform secure transactions, and generate transaction receipts. The application has been designed to demonstrate clean coding practices, modular architecture, and practical implementation of Java fundamentals.

Whether you are a beginner learning Java or a student building academic projects, this application serves as an excellent example of how object-oriented concepts are used to solve real-world problems.

---

# 📌 Project Highlights

* ✅ Console-Based Banking System
* ✅ Developed using Core Java
* ✅ Object-Oriented Design
* ✅ Dynamic Account Management
* ✅ Secure Banking Operations
* ✅ Transaction Receipt Generation
* ✅ Duplicate Account Validation
* ✅ Menu-Driven User Interface
* ✅ Maven Project Structure
* ✅ Java 17 Compatible

---

# ✨ Features

## 🆕 Dynamic Account Creation

Users can create new bank accounts during runtime by entering customer information such as account number, customer name, and initial balance. Every account is stored dynamically using an `ArrayList`, allowing unlimited account creation.

---

## 📋 Display All Accounts

Displays all registered customer accounts in a structured format, making it easy to view account information including account number, holder name, and available balance.

---

## 💰 Check Account Balance

Users can instantly check the available balance by entering their account number. The system first verifies that the account exists before displaying the balance.

---

## ➕ Deposit Money

Allows users to deposit funds into their account. The balance is automatically updated after validating the account details.

---

## ➖ Withdraw Money

Withdraws money from an account only if sufficient funds are available. The application prevents overdrafts by validating the available balance before completing the transaction.

---

## 🔄 Transfer Money

Supports secure fund transfer between two accounts.

The system:

* Verifies sender account
* Verifies receiver account
* Validates available balance
* Updates both account balances
* Generates a unique transaction record

---

## 🆔 UTR ID Generation

Every successful money transfer generates a **Unique Transaction Reference (UTR) ID**, making every transaction uniquely identifiable and easier to track.

---

## 🧾 Transaction Receipt

After each successful transaction, a detailed receipt is generated showing:

* Sender Account
* Receiver Account
* Amount
* Transaction Time
* UTR Number
* Transaction Status

---

## 🚫 Duplicate Account Validation

The application prevents duplicate account creation by checking whether an account number already exists before creating a new account.

---

## ✅ Account Verification

Every banking operation first verifies the account number before processing the request, ensuring secure operations.

---

## 💵 Balance Validation

Withdrawal and transfer operations include balance validation to prevent transactions that exceed the available account balance.

---

## 📜 Menu-Driven Console Application

A simple and user-friendly menu allows users to navigate banking operations efficiently without requiring any graphical interface.

---

# ☕ Java Concepts Used

| Concept                     | Description                                                               |
| --------------------------- | ------------------------------------------------------------------------- |
| Classes                     | Represents entities such as Account, Bank, Transaction, and Main.         |
| Objects                     | Used to create multiple customer accounts dynamically.                    |
| Constructors                | Initialize objects with required values during creation.                  |
| Encapsulation               | Protects data using private fields with public getter and setter methods. |
| Object-Oriented Programming | Organizes code into reusable and maintainable classes.                    |
| ArrayList                   | Dynamically stores all bank accounts.                                     |
| Scanner                     | Accepts user input from the console.                                      |
| Methods                     | Divides business logic into reusable functions.                           |
| Loops                       | Keeps the application running until the user exits.                       |
| Switch Case                 | Implements the menu-driven banking system.                                |
| Conditional Statements      | Performs validations such as balance checks and account verification.     |
| Constructor Injection       | Initializes required objects through constructors.                        |
| Method Calling              | Promotes modular and reusable code architecture.                          |
| LocalDateTime               | Captures the exact transaction timestamp.                                 |
| DateTimeFormatter           | Formats transaction date and time into a readable format.                 |

---

# 📁 Project Structure

```text
Kotak_Mahindra_Banking

├── pom.xml
├── README.md
├── .gitignore
└── src
    └── main
        └── java
            └── com
                └── hash
                    ├── Account.java
                    ├── Bank.java
                    ├── Transaction.java
                    └── Main.java
```

---

# 📄 Java Files Explained

## 📌 Account.java

Represents a bank account.

### Responsibilities

* Stores customer details
* Stores account number
* Stores account balance
* Provides getter and setter methods
* Encapsulates account data

---

## 📌 Bank.java

Acts as the business logic layer.

### Responsibilities

* Create Account
* Deposit Money
* Withdraw Money
* Transfer Funds
* Display Accounts
* Validate Accounts
* Search Accounts
* Balance Verification

This class contains the core banking functionality.

---

## 📌 Transaction.java

Responsible for handling transaction-related operations.

### Responsibilities

* Generate UTR ID
* Generate Transaction Receipt
* Store Transaction Time
* Format Date & Time
* Display Transaction Details

---

## 📌 Main.java

The application's entry point.

### Responsibilities

* Displays Menu
* Accepts User Input
* Calls Banking Methods
* Controls Program Flow
* Keeps the Application Running

---

# 🖥️ Sample Console Output

## 🆕 Create Account

```text
========== CREATE ACCOUNT ==========

Enter Account Number : 1001
Enter Customer Name  : Rahul Sharma
Enter Initial Balance: 15000

Account Created Successfully.

-------------------------------------
Account Number : 1001
Customer Name  : Rahul Sharma
Balance        : ₹15000.00
-------------------------------------
```

---

## 📋 Display Accounts

```text
========== ACCOUNT LIST ==========

1001    Rahul Sharma      ₹15000.00
1002    Priya Verma       ₹22000.00
1003    Aman Gupta        ₹18000.00
```

---

## ➕

```text
Deposit Amount : ₹5000

Deposit Successful.

Current Balance : ₹20000.00
```

---

## ➖ Withdraw

```text
Withdraw Amount : ₹3000

Withdrawal Successful.

Available Balance : ₹17000.00
```

---

## 🔄 Transfer Money

```text
Sender Account   : 1001
Receiver Account : 1002
Amount           : ₹2500

Transaction Successful.
```

---

## 🧾 Transaction Receipt

```text
==============================
        TRANSACTION RECEIPT
==============================

UTR ID          : UTR202607030001
From Account    : 1001
To Account      : 1002
Transferred     : ₹2500.00
Date & Time     : 03-07-2026 10:45:18 AM
Status          : SUCCESS

==============================
Thank You for Banking With Us
==============================
```

---

## 💰 Check Balance

```text
Enter Account Number : 1001

Available Balance

₹17500.00
```

---

# 🚀 Installation Guide

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/kotak-mahindra-banking.git
```

---

## 2️⃣ Open in IntelliJ IDEA

* Open IntelliJ IDEA
* Select **Open Project**
* Choose the cloned folder
* Wait for Maven dependencies to load

---

## 3️⃣ Build the Project

```bash
mvn clean install
```

---

## 4️⃣ Run the Application

Run the `Main.java` file directly from IntelliJ IDEA or execute:

```bash
mvn exec:java
```

---

# 🛠 Technologies Used

| Technology    | Purpose                                  |
| ------------- | ---------------------------------------- |
| Java 17       | Core Programming Language                |
| Maven         | Build Automation & Dependency Management |
| IntelliJ IDEA | Integrated Development Environment       |
| Git           | Version Control                          |
| GitHub        | Source Code Hosting & Collaboration      |

---

# 🎯 Learning Outcomes

After completing this project, a beginner will gain hands-on experience with:

* Object-Oriented Programming (OOP)
* Class and Object Design
* Constructors and Encapsulation
* Collections using ArrayList
* User Input using Scanner
* Menu-Driven Programming
* Conditional Logic
* Loops and Control Statements
* Java Methods and Code Reusability
* Exception-aware validation strategies
* Transaction Processing
* Date and Time API
* Maven Project Structure
* Clean Code Organization
* Real-world Banking Workflow Implementation
* Professional GitHub Project Documentation

---

# 🚀 Future Enhancements

The project can be expanded with enterprise-level features such as:

* 🔐 Login Authentication
* 🔑 PIN Verification
* 📜 Transaction History
* 📄 Mini Statement
* 💹 Interest Calculation
* 💾 File Handling
* 🗄 Database Integration
* 🐬 MySQL Support
* 🔗 JDBC Connectivity
* 🌐 Spring Boot REST APIs
* 🖥 JavaFX Desktop GUI
* 📱 Internet Banking
* 📊 Account Analytics Dashboard
* 📧 Email Notifications
* 📲 SMS Alerts
* 🔔 Push Notifications
* ☁ Cloud Deployment
* 🧪 Unit Testing using JUnit
* 📦 Docker Containerization

---

# 🤝 Contributing

Contributions are welcome!

If you'd like to improve this project:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to your branch
5. Open a Pull Request

Please ensure your code follows clean coding standards and includes appropriate documentation.

---

# ⭐ Support

If you found this project useful:

* ⭐ Star the repository
* 🍴 Fork the project
* 🛠 Contribute improvements
* 📢 Share it with other Java learners

Your support helps the project grow and encourages continuous improvement.

---

# 📄 License

This project is released under the **MIT License** and is free to use for educational and personal learning purposes.

---

# 👨‍💻 Author

**Kotak Mahindra Banking System**

Developed using **Java 17**, **Core Java**, **Object-Oriented Programming**, and **Maven** to demonstrate practical banking operations through a professional console-based application.

---

<p align="center">
<strong>⭐ If you like this project, don't forget to give it a Star on GitHub! ⭐</strong>
</p>
