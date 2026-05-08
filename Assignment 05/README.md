# 🏦 Banking Management System in Java  

> A beginner-friendly Java project demonstrating **Inheritance**, **Method Overriding**, **ArrayList**, and **Object-Oriented Programming (OOP)** concepts through a simple banking application.

---

# 🚀 Project Overview  

This project simulates a basic **Banking Management System** using Java.  
It allows the creation of customers and different types of bank accounts while demonstrating important OOP concepts like:

✅ Inheritance  
✅ Method Overriding  
✅ ArrayList  
✅ Encapsulation  
✅ Polymorphism  

The system supports:

- Customer Management
- Savings Accounts
- Loan Accounts
- Deposits & Withdrawals
- Consolidated Account Information

---

# 📂 Project Structure  

```bash
📁 Banking-Application
│
├── 📄 Account.java
├── 📄 Customer.java
├── 📄 LoanAccount.java
├── 📄 SavingsAccount.java
├── 📄 MainApp.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🧩 OOP Concepts | Class Design |
| 📚 ArrayList | Dynamic Data Storage |
| 🔄 Inheritance | Code Reusability |
| ⚙ Method Overriding | Specialized Behavior |

---

# ✨ Features  

## 👤 Customer Management

The `Customer` class stores:

- Customer ID
- Customer Name
- Customer Details

Each customer can own multiple accounts.

---

# 🏦 Account Class  

The base `Account` class contains:

- Account Number
- Balance
- Deposit Method
- Withdraw Method

Example:

```java
deposit(double amount)
withdraw(double amount)
```

---

# 💰 SavingsAccount Class  

`SavingsAccount` extends `Account`.

### Features:
✅ Deposit money  
✅ Withdraw money  
✅ Maintain account balance  
✅ Customized withdrawal rules  

---

# 💳 LoanAccount Class  

`LoanAccount` also extends `Account`.

### Features:
✅ Loan balance handling  
✅ Specialized deposit logic  
✅ Customized withdrawal functionality  

---

# 🔄 Method Overriding  

The child classes override methods from the parent class:

```java
deposit()
withdraw()
```

This demonstrates **Runtime Polymorphism**.

---

# 📚 ArrayList Usage  

The application uses:

```java
ArrayList<Customer>
ArrayList<Account>
```

to dynamically store customer and account information.

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| OOP | Classes & Objects |
| Inheritance | Parent-Child relationship |
| Polymorphism | Method Overriding |
| Encapsulation | Data Hiding |
| ArrayList | Dynamic Collections |
| Method Overriding | Specialized methods |

---

# ▶ Sample Output  

```bash
Customer Details:

Customer ID: 101
Name: Kunal

Savings Account:
Account Number: SA1001
Balance: 15000

Loan Account:
Account Number: LA2001
Loan Amount: 50000

After Transactions:

Deposited Successfully!
Withdraw Successful!

Updated Balance: 17000
```

---

# 💻 How It Works  

## ✅ Step 1: Create Customers

```java
Customer c1 = new Customer(101, "Kunal");
```

---

## ✅ Step 2: Create Accounts

```java
SavingsAccount s1 = new SavingsAccount(1001, 15000);
LoanAccount l1 = new LoanAccount(2001, 50000);
```

---

## ✅ Step 3: Store Data Using ArrayList

```java
ArrayList<Customer> customers = new ArrayList<>();
ArrayList<Account> accounts = new ArrayList<>();
```

---

## ✅ Step 4: Perform Transactions

```java
s1.deposit(5000);
s1.withdraw(3000);
```

---

## ✅ Step 5: Display Consolidated Information

The system prints all customer account details together.

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How inheritance works in Java  
✅ How child classes override parent methods  
✅ How ArrayList stores objects dynamically  
✅ How banking systems manage accounts  
✅ How OOP improves code organization  

---

# 📚 Beginner Friendly Notes  

🔹 `extends` keyword is used for inheritance.  
🔹 Parent class methods can be overridden in child classes.  
🔹 ArrayList is dynamic unlike arrays.  
🔹 OOP makes programs modular and reusable.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🔐 Login Authentication
- 💾 File Handling
- 🗄 Database Connectivity
- 📊 Transaction History
- 💸 Interest Calculation
- 🖥 GUI using Java Swing

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> OOP + Inheritance + ArrayList + Banking Logic 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep learning Java! ☕
