# 👨‍💼 Employee Payroll Management System in Java  

> A beginner-friendly Java project demonstrating **Abstraction**, **Inheritance**, **Method Overriding**, and **Payroll Calculation** using Object-Oriented Programming (OOP).

---

# 🚀 Project Overview  

This project simulates a simple **Employee Payroll Management System** in Java.

It demonstrates how different employee types calculate their **CTC (Cost To Company)** differently using:

✅ Abstract Classes  
✅ Inheritance  
✅ Method Overriding  
✅ Polymorphism  
✅ Exception Handling  

The system includes:

- Full Time Employees
- Contract Employees
- Managers
- Payroll Processing
- Salary Validation

---

# 📂 Project Structure  

```bash
📁 Assignment-6
│
├── 📄 Employee.java
├── 📄 FullTimeEmployee.java
├── 📄 ContractEmployee.java
├── 📄 Manager.java
├── 📄 Payroll.java
├── 📄 InvalidSalaryException.java
├── 📄 main.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🧩 OOP Concepts | Class Design |
| 🔄 Inheritance | Code Reusability |
| 🎭 Polymorphism | Method Overriding |
| ⚠ Exception Handling | Salary Validation |

---

# ✨ Features  

# 👨‍💻 Employee Class (Abstract Root Class)

The base `Employee` class contains common employee details:

- Employee ID
- Employee Name
- PAN Number
- Joining Date
- Designation

It also contains the abstract method:

```java
calcCTC()
```

which is overridden by child classes.

---

# 🧑‍💼 FullTimeEmployee Class

`FullTimeEmployee` extends `Employee`.

### CTC Calculation:

For Software Engineers:

```java
CTC = baseSalary + performanceBonus
```

For HR Employees:

```java
CTC = baseSalary + hiringCommission
```

---

# ⏳ ContractEmployee Class

`ContractEmployee` also extends `Employee`.

### CTC Calculation:

```java
CTC = noOfHours * hourlyRate
```

This simulates payment based on working hours.

---

# 👔 Manager Class

`Manager` is a child of `FullTimeEmployee`.

### Additional Benefits:

✅ Travel Allowance (TA)  
✅ Education Allowance  

### Manager CTC Formula:

```java
CTC = baseSalary + performanceBonus + TA + educationAllowance
```

---

# ⚠ Custom Exception Handling  

The project includes:

```java
InvalidSalaryException
```

to validate incorrect salary values.

---

# 🔄 Method Overriding  

Each employee type overrides:

```java
calcCTC()
```

This demonstrates **Runtime Polymorphism**.

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| Abstraction | Abstract Employee class |
| Inheritance | Child employee classes |
| Polymorphism | Overridden calcCTC() |
| Encapsulation | Secure employee data |
| Exception Handling | Salary validation |
| Payroll Processing | Salary calculations |

---

# ▶ Sample Output  

```bash
Employee Details:

ID: 101
Name: Kunal
Role: SWE

Base Salary: 60000
Performance Bonus: 10000

CTC: 70000


Manager Details:

ID: 201
Name: Rahul

Base Salary: 80000
Performance Bonus: 15000
TA: 5000
Education Allowance: 3000

Manager CTC: 103000


Contract Employee:

Hours Worked: 120
Hourly Rate: 500

CTC: 60000
```

---

# 💻 How It Works  

## ✅ Step 1: Create Employee Objects

```java
FullTimeEmployee e1 = new FullTimeEmployee();
ContractEmployee c1 = new ContractEmployee();
Manager m1 = new Manager();
```

---

## ✅ Step 2: Calculate Salaries

```java
e1.calcCTC();
c1.calcCTC();
m1.calcCTC();
```

---

## ✅ Step 3: Display Payroll Information

The payroll system displays complete employee salary details.

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How abstract classes work in Java  
✅ How inheritance creates reusable code  
✅ How method overriding implements polymorphism  
✅ How payroll systems calculate salaries  
✅ How managers extend employee behavior  

---

# 📚 Beginner Friendly Notes  

🔹 Abstract classes cannot be instantiated directly.  
🔹 Child classes must implement abstract methods.  
🔹 Method overriding allows customized behavior.  
🔹 Inheritance reduces code duplication.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 💾 Database Connectivity
- 🖥 GUI using Java Swing
- 📊 Payslip Generation
- 📅 Attendance Management
- 📈 Tax Calculation
- 🔐 Employee Login System

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> Abstraction + Inheritance + Payroll Logic + OOP 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep learning Java! ☕
