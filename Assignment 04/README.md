# 🔢 Vector Operations System in Java  

> A beginner-friendly Java project demonstrating **Vectors**, **Array Operations**, **Custom Exceptions**, and **Object-Oriented Programming (OOP)** concepts.

---

# 🚀 Project Overview  

This project implements a simple **Vector Mathematics System** in Java.  
It supports mathematical operations on **2D and 3D vectors** while ensuring proper dimension validation using a **User Defined Exception**.

The program allows users to:

✅ Create valid 2D or 3D vectors  
✅ Add two vectors  
✅ Subtract vectors  
✅ Calculate dot product  
✅ Display vector values neatly  
✅ Handle invalid vector dimensions using custom exceptions  

---

# 📂 Project Structure  

```bash
📁 Assignment-4
│
├── 📄 MainVector.java
├── 📄 VectorOperations.java
├── 📄 VectorSizeMismatchException.java
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 🧩 OOP Concepts | Class & Object Design |
| ⚠ Exception Handling | Error Handling |
| 🔢 Arrays | Vector Storage |

---

# ✨ Features  

## 📌 Vector Class

The `Vector` class contains:

- Array of `double` type
- Constructor for vector initialization
- Validation for vector dimensions

Supported dimensions:

✅ 2D Vector  
✅ 3D Vector  

---

# ⚠ Custom Exception Handling  

A user-defined exception:

```java
VectorException
```

is thrown whenever:

```java
Vector dimension is not 2 or 3
```

This prevents invalid vector creation.

---

# 📌 Operations Implemented  

## ➕ Vector Addition

Adds corresponding elements of two vectors.

Example:

```java
[1, 2] + [3, 4] = [4, 6]
```

---

## ➖ Vector Subtraction

Subtracts corresponding elements.

Example:

```java
[5, 7] - [2, 3] = [3, 4]
```

---

## ✖ Dot Product

Calculates scalar product of vectors.

Example:

```java
[1,2,3] • [4,5,6] = 32
```

---

## 🖨 Print Vector

Displays vector values in readable format.

Example:

```java
[2.0, 5.0, 8.0]
```

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| OOP | Classes and Objects |
| Arrays | Vector Storage |
| Constructors | Object Initialization |
| Exception Handling | Runtime Error Management |
| Custom Exception | User-defined error handling |
| Mathematical Operations | Vector calculations |

---

# ▶ Sample Output  

```bash
Vector 1:
[1.0, 2.0, 3.0]

Vector 2:
[4.0, 5.0, 6.0]

Addition:
[5.0, 7.0, 9.0]

Subtraction:
[-3.0, -3.0, -3.0]

Dot Product:
32.0

Exception:
Invalid Vector Dimension!
Only 2D or 3D vectors are allowed.
```

---

# 💻 How It Works  

## ✅ Step 1: Create Vector Objects

```java
double arr[] = {1,2,3};
Vector v1 = new Vector(arr);
```

---

## ✅ Step 2: Perform Operations

```java
v1.add(v2);
v1.subtract(v2);
v1.dotProduct(v2);
```

---

## ✅ Step 3: Handle Exceptions

```java
try {
    double arr[] = {1,2,3,4};
    Vector v = new Vector(arr);
}
catch(VectorException e) {
    System.out.println(e.getMessage());
}
```

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How vectors are represented using arrays  
✅ How mathematical vector operations work  
✅ How to create custom exceptions  
✅ How constructors validate data  
✅ How OOP improves code organization  

---

# 📚 Beginner Friendly Notes  

🔹 A vector is simply an array of numbers.  
🔹 Dot product returns a single scalar value.  
🔹 Vector addition/subtraction requires same dimensions.  
🔹 Custom exceptions make programs safer and cleaner.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 📐 Cross Product
- 📏 Magnitude Calculation
- 🔄 Unit Vector Conversion
- 🧮 Matrix Operations
- 🖥 GUI using Java Swing
- 📊 Advanced Linear Algebra Features

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> OOP + Arrays + Exception Handling + Mathematical Operations 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep practicing Java! ☕
