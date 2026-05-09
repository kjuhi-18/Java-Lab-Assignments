# 🍽 Restaurant Management System using JDBC & MySQL  

> A beginner-friendly Java project demonstrating **JDBC Connectivity**, **MySQL Database Operations**, and complete **CRUD Operations** using Java.

---

# 🚀 Project Overview  

This project is a simple **Restaurant Database Management System** built using:

✅ Java  
✅ JDBC  
✅ MySQL  

The system performs all major **CRUD Operations** on restaurant and menu data stored inside a MySQL database.

The project demonstrates:

✔ Database Connectivity  
✔ SQL Queries  
✔ ResultSet Handling  
✔ CRUD Operations  
✔ JDBC Programming  

---

# 📂 Project Structure  

```bash
📁 Assignment-09
│
├── 📄 RestaurantCRUD.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🗄 MySQL | Database Management |
| 🔌 JDBC | Database Connectivity |
| 📊 SQL | CRUD Operations |
| 🧩 ResultSet | Data Retrieval |

---

# 🗄 Database Structure  

# 🍴 Restaurant Table  

| Column | Description |
|--------|-------------|
| Id | Primary Key |
| Name | Restaurant Name |
| Address | Restaurant Address |

---

# 🍕 MenuItem Table  

| Column | Description |
|--------|-------------|
| Id | Primary Key |
| Name | Menu Item Name |
| Price | Item Price |
| ResId | Foreign Key referencing Restaurant |

---

# ✨ Features  

# ➕ Insert Records  

The program inserts:

✅ 10 Restaurant Records  
✅ 10 MenuItem Records  

using JDBC and SQL INSERT queries.

---

# 📋 Select Records by Price  

Displays all menu items where:

```sql
price <= 100
```

---

# ☕ Select Items from "Cafe Java"  

Fetches all menu items available in:

```sql
Restaurant = 'Cafe Java'
```

using SQL JOIN operations.

---

# ✏ Update Records  

Updates all menu items where:

```sql
price <= 100
```

to:

```sql
price = 200
```

---

# ❌ Delete Records  

Deletes all menu items where:

```sql
name starts with 'P'
```

Example:

```sql
DELETE FROM MenuItem
WHERE Name LIKE 'P%';
```

---

# 📊 Tabular Output using ResultSet  

All database results are displayed neatly in table format using:

```java
ResultSet
```

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| JDBC | Java Database Connectivity |
| CRUD Operations | Create, Read, Update, Delete |
| SQL Queries | Database Manipulation |
| Foreign Key | Table Relationships |
| ResultSet | Fetching Query Results |
| JOIN Operations | Multi-table Queries |

---

# ▶ Sample Output  

```bash
===== MENU ITEMS PRICE <= 100 =====

ID    NAME          PRICE
1     Coffee        80
2     Sandwich      100
3     Tea           50


===== ITEMS AVAILABLE IN CAFE JAVA =====

ID    ITEM NAME      PRICE
1     Cappuccino     120
2     Pasta          200


===== UPDATED MENU ITEMS =====

All items with price <=100 updated to 200.


===== DELETED RECORDS =====

All menu items starting with 'P' deleted successfully.
```

---

# 💻 SQL Queries Used  

# ✅ Create Tables

```sql
CREATE TABLE Restaurant(
    Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Address VARCHAR(100)
);

CREATE TABLE MenuItem(
    Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Price DOUBLE,
    ResId INT,
    FOREIGN KEY(ResId) REFERENCES Restaurant(Id)
);
```

---

# ✅ Select Query

```sql
SELECT * FROM MenuItem
WHERE Price <= 100;
```

---

# ✅ Join Query

```sql
SELECT m.*
FROM MenuItem m
JOIN Restaurant r
ON m.ResId = r.Id
WHERE r.Name = 'Cafe Java';
```

---

# ✅ Update Query

```sql
UPDATE MenuItem
SET Price = 200
WHERE Price <= 100;
```

---

# ✅ Delete Query

```sql
DELETE FROM MenuItem
WHERE Name LIKE 'P%';
```

---

# ⚙ JDBC Connectivity  

Example JDBC Connection:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/restaurantdb",
    "root",
    "password"
);
```

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How Java connects to MySQL using JDBC  
✅ How CRUD operations work with databases  
✅ How SQL queries manipulate data  
✅ How ResultSet retrieves records  
✅ How foreign keys connect tables  

---

# 📚 Beginner Friendly Notes  

🔹 JDBC stands for Java Database Connectivity.  
🔹 CRUD = Create, Read, Update, Delete.  
🔹 ResultSet stores query output rows.  
🔹 Foreign keys connect related tables.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🖥 GUI using Java Swing
- 🔍 Search Menu Feature
- 📊 Billing System
- 🍔 Online Ordering
- 🔐 Admin Login
- 🗄 Advanced Database Features

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> JDBC + MySQL + CRUD Operations + SQL 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep mastering Java & Databases! ☕
