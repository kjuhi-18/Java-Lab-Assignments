# 🍽 Restaurant Management System using JavaFX & JDBC  

> A beginner-friendly Java project demonstrating **JavaFX GUI**, **JDBC Connectivity**, **MySQL Database Operations**, and complete **CRUD Functionality**.

---

# 🚀 Project Overview  

This project extends the basic JDBC restaurant application by adding a fully interactive **JavaFX User Interface**.

The system allows users to manage:

✅ Restaurants  
✅ Menu Items  

through a graphical menu-driven application.

The project demonstrates:

✔ JavaFX UI Development  
✔ JDBC Database Connectivity  
✔ CRUD Operations  
✔ SQL Query Execution  
✔ Event Handling  

---

# 📂 Project Structure  

```bash
📁 Assignment-10
│
├── 📄 MainApp.java
├── 📄 RestaurantJDBC.java
├── 📄 RestaurantUI.java
├── 📄 MenuItemUI.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🎨 JavaFX | GUI Development |
| 🗄 MySQL | Database Management |
| 🔌 JDBC | Database Connectivity |
| 📊 SQL | CRUD Operations |

---

# ✨ Features  

# 🏪 Restaurant Management

The application performs CRUD operations on the:

```sql
Restaurant
```

table.

### Operations:

✅ Insert Restaurant  
✅ View Restaurants  
✅ Update Restaurant  
✅ Delete Restaurant  

---

# 🍕 MenuItem Management

The application also manages:

```sql
MenuItem
```

records.

### Operations:

✅ Insert Menu Items  
✅ View Menu Items  
✅ Update Menu Items  
✅ Delete Menu Items  

---

# 🎨 JavaFX User Interface  

The project uses JavaFX to create a clean and interactive GUI.

### GUI Features:

✅ Buttons  
✅ Forms  
✅ Tables  
✅ Input Fields  
✅ Menu Driven Navigation  

---

# 🔌 JDBC Connectivity  

The application connects JavaFX UI with MySQL database using JDBC.

Example:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/restaurantdb",
    "root",
    "password"
);
```

---

# 📊 CRUD Operations  

# ➕ Insert Records

Users can add:

- New Restaurants
- New Menu Items

through JavaFX forms.

---

# 📋 Select Records

Displays records in table format inside the UI.

---

# ✏ Update Records

Allows updating:

- Restaurant Details
- Menu Item Prices
- Names and Addresses

---

# ❌ Delete Records

Users can delete records directly through the GUI.

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| JavaFX | GUI Development |
| JDBC | Database Connectivity |
| CRUD Operations | Database Manipulation |
| Event Handling | Button Actions |
| SQL Queries | Data Operations |
| UI Design | Interactive Applications |

---

# 🗄 Database Tables  

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

# ▶ Sample Features in GUI  

```bash
===== MAIN MENU =====

1. Add Restaurant
2. View Restaurants
3. Update Restaurant
4. Delete Restaurant

5. Add Menu Item
6. View Menu Items
7. Update Menu Item
8. Delete Menu Item
```

---

# 💻 How It Works  

## ✅ Step 1: Launch JavaFX Application

```java
launch(args);
```

---

## ✅ Step 2: Connect to Database

```java
RestaurantJDBC.connect();
```

---

## ✅ Step 3: Perform CRUD Operations

Users interact with buttons and forms to manipulate database records.

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How JavaFX builds graphical applications  
✅ How JDBC connects Java with MySQL  
✅ How CRUD operations work through GUI  
✅ How SQL queries interact with UI  
✅ How event-driven applications work  

---

# 📚 Beginner Friendly Notes  

🔹 JavaFX is used for building desktop applications.  
🔹 JDBC connects Java programs with databases.  
🔹 CRUD = Create, Read, Update, Delete.  
🔹 Event handling controls button actions.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🔍 Search Functionality
- 📊 Dashboard Analytics
- 🔐 Login Authentication
- 🍔 Online Food Ordering
- 🖼 Better UI Styling with CSS
- 🗄 Advanced Database Features

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> JavaFX + JDBC + MySQL + CRUD Operations 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep mastering Java GUI Development! ☕
