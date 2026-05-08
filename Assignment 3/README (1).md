# 📚 Book Management System in Java  

> A beginner-friendly Java mini project demonstrating **Object-Oriented Programming (OOP)**, **Custom Exceptions**, **ArrayList**, and **Exception Handling**.

---

## 🚀 Project Overview  

This project is a simple **Book Management System** built using Java.  
It allows users to:

✅ Create multiple book objects  
✅ Store books inside an `ArrayList`  
✅ Handle invalid book prices using a **User Defined Exception**  
✅ Calculate the **average price** of books  
✅ Filter and display books by genre using `forEach()`  

This project is ideal for beginners learning:

- Classes & Objects
- Constructors
- ArrayList
- Exception Handling
- Custom Exceptions
- forEach() method
- Java Collections Framework

---

# 📂 Project Structure  

```bash
📁 Book-Management-System
│
├── 📄 book.java
├── 📄 mainbook.java
├── 📄 ArraylistEx.java
├── 📄 InvalidPriceException.java
├── 📄 InvalidGenreException.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 📚 ArrayList | Dynamic Storage |
| ⚠ Exception Handling | Error Management |
| 🧩 OOP Concepts | Class Design |

---

# ✨ Features  

## 📖 Book Class
The `Book` class contains:

- Book ID
- Book Name
- Author
- Genre
- Price

It also includes:

✔ Default Constructor  
✔ Parameterized Constructor  
✔ Validation for negative price  

---

## ⚠ Custom Exception Handling

A user-defined exception:

```java
InvalidPriceException
```

is thrown whenever:

```java
price < 0
```

This ensures invalid book data is not accepted.

---

# 📌 Functionalities Implemented  

## ✅ Add Multiple Books to ArrayList

Books are dynamically stored using:

```java
ArrayList<Book>
```

---

## ✅ Exception Handling Using try-catch

Example:

```java
try {
    Book b = new Book(101, "Java", "James", "Education", -500);
}
catch(InvalidPriceException e) {
    System.out.println(e.getMessage());
}
```

---

## ✅ Display All Books

The program prints all stored books with their details.

---

## ✅ Calculate Average Price

The average price of all books is calculated and displayed.

---

## ✅ Filter Books by Genre

Books of a specific genre such as:

```java
"Fiction"
```

are displayed using:

```java
forEach()
```

---

# ▶ Sample Output  

```bash
Book Details:

ID: 101
Name: Harry Potter
Author: J.K Rowling
Genre: Fiction
Price: 450

ID: 102
Name: Atomic Habits
Author: James Clear
Genre: Self Help
Price: 550

Invalid Price Exception: Price cannot be negative.

Average Price of Books: 500.0

Books in Fiction Genre:
Harry Potter
```

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| OOP | Creating classes and objects |
| Constructors | Initializing objects |
| Custom Exception | User-defined exception class |
| ArrayList | Dynamic collection handling |
| forEach() | Iterating through collections |
| try-catch | Handling runtime errors |

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How to create custom exception classes  
✅ How constructors work in Java  
✅ How to use `ArrayList<Book>`  
✅ How to filter objects using conditions  
✅ How to handle invalid inputs safely  

---

# 💻 How to Run  

## 1️⃣ Compile the Files

```bash
javac *.java
```

## 2️⃣ Run the Main Class

```bash
java ArraylistEx
```

---

# 📚 Beginner Friendly Notes  

🔹 `ArrayList` grows dynamically unlike arrays.  
🔹 `forEach()` makes iteration cleaner and shorter.  
🔹 Custom exceptions improve program reliability.  
🔹 Exception handling prevents program crashes.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🔍 Search Book Feature
- ✏ Update Book Details
- ❌ Delete Books
- 💾 File Handling
- 🖥 GUI using Java Swing
- 🗄 Database Connectivity

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen understanding of:

> OOP + Collections + Exception Handling 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep learning Java! ☕
