# EXAMINA – Online Examination System  
*A Java Swing + MySQL based exam management application*

## 📘 Abstract
EXAMINA is a Java-based GUI application designed as a prototype online examination system. The system provides essential functionalities such as student registration, admin login, student login, attendance maintenance, exam creation, participation, and result handling.

The user interface is built using **Java Swing**, offering a clear and interactive visual layout. A **MySQL database** is used to store and manage student details, questions, answers, attendance, and results, ensuring persistent and reliable data management.

This project demonstrates the fundamentals of building GUI-based desktop applications that interact with a database, and showcases modular design, usability, and essential exam management features.

---

## 📖 Introduction
With the rising need for digital evaluation, online examination systems are becoming key tools for educational institutions.  
**EXAMINA** is a simple demonstration project that models core exam-management functionality. The system streamlines:

- student registration  
- user authentication  
- exam participation  
- question management  
- attendance tracking  
- result viewing  

Built using **Java Swing**, the application emphasizes ease of interaction and practical implementation. As a prototype, EXAMINA can be further enhanced with improved security, cloud-based storage, and web integration.

---

## 🧩 Modules Overview

### **1. Student Registration**
- Collects personal details (name, roll no, department, batch)
- Validates data before submission
- Stores student information in MySQL database  

### **2. Login (Student & Admin)**
- Validates credentials for both admin and student roles  
- Grants appropriate access based on role  

### **3. Admin Login**
- Allows admin to manage the system  
- Access to question management, attendance, results  

### **4. Add Question**
- Admin inputs new questions  
- Includes options and correct answer  
- Saved directly to MySQL for future exams  

### **5. Update Question**
- Admin can edit question text, options, or correct answer  
- Ensures exam content remains up to date  

### **6. Delete Question**
- Removes outdated or incorrect questions  
- Helps maintain exam quality  

### **7. Exam Participation**
- Students access available exams after login  
- Questions are fetched from the database  
- System records and processes responses  

### **8. Results Viewing**
- Displays student scores after exam completion  
- Results stored and fetched from MySQL  

### **9. Attendance Tracking**
- **Admin Add Attendance:** Records attendance for academic days  
- **Admin View Attendance:** Displays attendance details for all students  
- **Student Attendance View:** Students can view their personal attendance report (read-only)

---

## 🎨 UI Design
The system UI is built entirely using **Java Swing**, focusing on simplicity and accessibility.

- Buttons for core functions on the main window
- Each module opens a dedicated `JFrame`
- Components used: `JTextField`, `JButton`, `JLabel`, `JTable`, etc.
- Clean layout for easier navigation
- Readable font styles and soft color scheme  
- Separate frames for registration, login, exam, attendance, and question management  

---

## 🗄️ Database Design (MySQL)
The application uses **MySQL** as its backend database.

Key tables:
- `students` – personal and login details  
- `questions` – exam questions and keys  
- `results` – student scores  
- `attendance` – presence records  
- `admin` – admin credential storage  

Features:
- Persistent data storage  
- Fast retrieval through SQL queries  
- Reliable storage for sensitive exam-related data  
- Supports scalability for larger datasets  

---

## 🚀 Future Enhancements
- Shift to a web-based interface (HTML/CSS/JavaScript + backend)
- Add encryption for secure password storage
- Add timer-based exam controls
- Implement role-based dashboard analytics
- Export results to PDF
- Mobile app integration


