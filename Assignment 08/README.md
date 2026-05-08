# 📦 Inventory Management System using Design Patterns in Java  

> A beginner-friendly Java project demonstrating **Singleton**, **Adapter**, and **Iterator** Design Patterns using Object-Oriented Programming (OOP).

---

# 🚀 Project Overview  

This project implements a simple **Inventory Management System** in Java using three important software design patterns:

✅ Singleton Pattern  
✅ Adapter Pattern  
✅ Iterator Pattern  

The system allows managing both:

- Modern Products
- Legacy Products

through a common interface.

The project demonstrates how design patterns improve:

✔ Code Reusability  
✔ Flexibility  
✔ Scalability  
✔ Maintainability  

---

# 📂 Project Structure  

```bash
📁 Assignment-8
│
├── 📄 InventoryManager.java
├── 📄 Product.java
├── 📄 ProductAdapter.java
├── 📄 LegacyItem.java
├── 📄 NewProduct.java
├── 📄 Main.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🧩 OOP Concepts | Program Design |
| 📚 ArrayList | Product Storage |
| 🔄 Design Patterns | Software Architecture |
| 🔁 Iterator | Inventory Traversal |

---

# ✨ Design Patterns Used  

# 🔒 Singleton Pattern  

The `InventoryManager` class is implemented as a **Singleton**.

### Purpose:

Ensures only **one inventory instance** exists throughout the application.

### Benefits:

✅ Centralized inventory management  
✅ Prevents duplicate inventory objects  
✅ Global access point  

Example:

```java
InventoryManager manager = InventoryManager.getInstance();
```

---

# 🔌 Adapter Pattern  

The `ProductAdapter` class acts as an adapter between:

```java
LegacyItem
```

and

```java
Product Interface
```

This allows old/legacy products to work with the new inventory system.

### Benefits:

✅ Reuse old code  
✅ Integrate incompatible classes  
✅ Avoid rewriting legacy systems  

---

# 🔁 Iterator Pattern  

The inventory is traversed using:

```java
Iterator<Product>
```

with:

```java
hasNext()
next()
```

### Benefits:

✅ Easy collection traversal  
✅ Cleaner looping  
✅ Better abstraction  

---

# 📌 Class Details  

# 🛒 Product Interface  

Contains:

```java
displayDetails()
```

method.

Implemented by:

- `NewProduct`
- `ProductAdapter`

---

# 📦 LegacyItem Class  

Represents old inventory products.

### Attributes:

- itemId
- description

### Methods:

```java
print()
```

---

# 🔌 ProductAdapter Class  

Implements `Product` interface.

Internally stores:

```java
LegacyItem
```

and converts it into compatible format.

### displayDetails()

calls:

```java
print()
```

from `LegacyItem`.

---

# 🆕 NewProduct Class  

Represents modern products.

### Attribute:

```java
name
```

### displayDetails()

prints product name.

---

# 🏪 InventoryManager Class  

Stores inventory using:

```java
List<Product>
```

### Methods:

```java
addProduct()
returnInventory()
```

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| Singleton Pattern | Single Inventory Instance |
| Adapter Pattern | Legacy Compatibility |
| Iterator Pattern | Collection Traversal |
| Interface | Common Product Structure |
| ArrayList | Dynamic Storage |
| OOP | Modular Design |

---

# ▶ Sample Output  

```bash
Inventory Details:

New Product:
Laptop

New Product:
Keyboard

Legacy Product:
Item ID: 101
Description: Old Printer

Legacy Product:
Item ID: 102
Description: Legacy Scanner
```

---

# 💻 How It Works  

## ✅ Step 1: Create Singleton Inventory

```java
InventoryManager manager = InventoryManager.getInstance();
```

---

## ✅ Step 2: Add New Products

```java
manager.addProduct(new NewProduct("Laptop"));
```

---

## ✅ Step 3: Add Legacy Products using Adapter

```java
LegacyItem item = new LegacyItem(101, "Old Printer");

manager.addProduct(new ProductAdapter(item));
```

---

## ✅ Step 4: Iterate Through Inventory

```java
Iterator<Product> it = manager.returnInventory();

while(it.hasNext()) {
    Product p = it.next();
    p.displayDetails();
}
```

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How Singleton Pattern works  
✅ How Adapter Pattern integrates legacy systems  
✅ How Iterator Pattern traverses collections  
✅ How interfaces improve flexibility  
✅ How design patterns improve software architecture  

---

# 📚 Beginner Friendly Notes  

🔹 Singleton ensures only one object exists.  
🔹 Adapter connects incompatible classes.  
🔹 Iterator simplifies collection traversal.  
🔹 Design patterns solve common software problems.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🔍 Product Search
- ❌ Remove Product
- 💾 File Storage
- 🗄 Database Connectivity
- 📊 Product Categories
- 🖥 GUI using Java Swing

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> Design Patterns + OOP + Inventory Management 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep mastering Java! ☕
