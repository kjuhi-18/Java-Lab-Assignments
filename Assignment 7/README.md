# 📊 Student Record Management System using CSV & Java  

> A beginner-friendly Java project demonstrating **File Handling**, **CSV Operations**, **CRUD Operations**, and **Exception Handling** using Object-Oriented Programming concepts.

---

# 🚀 Project Overview  

This project is a simple **Student Record Management System** built using Java and CSV files.

The system performs complete **CRUD Operations** on a `Students.csv` file while handling exceptions properly.

The application allows users to:

✅ Create student records  
✅ Read and display records  
✅ Update student marks  
✅ Calculate percentage automatically  
✅ Delete student records  
✅ Handle file-related exceptions safely  

---

# 📂 Project Structure  

```bash
📁 Assignment-7
│
├── 📄 AddStudents.java
├── 📄 DisplayStudents.java
├── 📄 UpdateMarks.java
├── 📄 DeleteStudent.java
├── 📄 CalculatePercentage.java
├── 📄 ExceptionDemo.java
├── 📄 StudentRecord.csv
└── 📄 README.md
```

---

# 🛠 Technologies Used  

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core Programming |
| 📂 CSV File Handling | Data Storage |
| ⚠ IOException | Exception Handling |
| 🧩 OOP Concepts | Program Structure |
| 📊 CRUD Operations | Record Management |

---

# ✨ Features  

# 📄 CSV File Creation

The project creates a CSV file named:

```bash
Students.csv
```

with the following header:

```csv
studentId,name,branch,marks1,marks2,marks3,marks4,marks5,percentage
```

---

# ➕ Add Student Records  

The system:

✅ Adds initial records manually  
✅ Inserts 3 additional student rows using Java  
✅ Initializes `marks4` and `marks5` as `0`

Example:

```csv
101,Kunal,AIML,78,85,90,0,0,0
```

---

# ✏ Update Student Marks  

The program updates all student records with correct marks for every subject.

Example:

```csv
101,Kunal,AIML,78,85,90,88,92,0
```

---

# 📈 Calculate Percentage  

A method calculates percentage using:

```java
percentage = totalMarks / 5
```

and updates the CSV file automatically.

---

# ❌ Delete Student Record  

The system supports deleting a row/student from the CSV file.

Example:

```java
deleteStudent(101);
```

---

# 📋 Display Student Records  

All updated records are displayed after each CRUD operation.

---

# ⚠ Exception Handling  

The project catches:

```java
IOException
```

during all file operations.

Example:

```java
try {
    // file handling code
}
catch(IOException e) {
    System.out.println(e.getMessage());
}
```

The output also demonstrates exception conditions.

---

# 🧠 Concepts Covered  

| Concept | Explanation |
|---------|-------------|
| File Handling | Reading/Writing CSV |
| CRUD Operations | Create, Read, Update, Delete |
| Exception Handling | IOException |
| Data Processing | Percentage Calculation |
| CSV Management | Structured Data Storage |

---

# ▶ Sample Output  

```bash
Student Added Successfully!

Displaying Students:

101 Kunal AIML 78 85 90 0 0 0
102 Rahul CSE 80 82 88 0 0 0

Updating Marks...

Marks Updated Successfully!

Calculating Percentage...

Percentage Updated!

Displaying Updated Records:

101 Kunal AIML 78 85 90 88 92 86.6
102 Rahul CSE 80 82 88 85 91 85.2

Deleting Student Record...

Student Deleted Successfully!

IOException Handled:
File not found!
```

---

# 💻 How It Works  

## ✅ Step 1: Create CSV File

The program creates:

```bash
Students.csv
```

with student headers.

---

## ✅ Step 2: Add Students

```java
addStudent();
```

adds new student records.

---

## ✅ Step 3: Update Marks

```java
updateMarks();
```

updates missing marks.

---

## ✅ Step 4: Calculate Percentage

```java
calculatePercentage();
```

updates percentage values.

---

## ✅ Step 5: Delete Record

```java
deleteStudent();
```

removes a student row.

---

# 🎯 Learning Outcomes  

After completing this project, you will understand:

✅ How CSV file handling works in Java  
✅ How CRUD operations are implemented  
✅ How file data can be updated dynamically  
✅ How percentage calculations are automated  
✅ How exceptions prevent program crashes  

---

# 📚 Beginner Friendly Notes  

🔹 CSV files store data in comma-separated format.  
🔹 CRUD stands for Create, Read, Update, Delete.  
🔹 IOException occurs during file handling issues.  
🔹 File handling is important for real-world applications.  

---

# 🌟 Future Improvements  

You can enhance this project by adding:

- 🔍 Search Student Feature
- 📊 Grade Calculation
- 🗄 Database Integration
- 🖥 GUI using Java Swing
- 📈 Result Analytics
- 🔐 Login Authentication

---

# 👨‍💻 Author  

Developed as a Java practice project to strengthen concepts of:

> File Handling + CSV Operations + Exception Handling + CRUD 🚀

---

# ⭐ If You Like This Project  

Give it a ⭐ on GitHub and keep learning Java! ☕
