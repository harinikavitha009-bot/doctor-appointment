                                    

#  Doctor Appointment Booking System -Saranya's Dental Care

## Abstract
The Doctor Appointment System is a web-based application developed to simplify the process of booking and managing medical appointments. It provides a user-friendly interface where users can select a doctor, choose a date and time, and book an appointment . The system also allows users to view all booked appointments in a structured table format. This project aims to reduce manual effort and improve efficiency in appointment scheduling.

---

## Introduction
In traditional systems, appointment booking is often done manually, which can lead to confusion, delays, and errors. This project provides a digital solution to manage appointments efficiently. It integrates frontend, backend, and database technologies to create a simple full-stack web application.

---

## Features
- Easy appointment booking  
- Doctor selection  
- Date and time selection  
- View appointments in table format  
- Date displayed in readable format  
- Time displayed in 12-hour format  
- Avoids null values in database  

---

## System Modules

### 1. Home Module
Displays a welcome message and provides navigation to the appointment booking page.

### 2. Appointment Booking Module
Allows users to:
- Select doctor  
- Choose date  
- Choose time  
- Submit appointment details  

### 3. View Module
Displays all appointments in a table format with proper formatting.

---

## Technologies Used
- Backend: Java (Spring Boot)  
- Frontend: HTML, CSS, JavaScript  
- Database: MySQL  
- Version Control: Git & GitHub  

---

## Database Design
The system uses a table named `appointments` to store appointment details.

```sql
CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_name VARCHAR(100) NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL
);

Working Principle
User opens the application
User selects doctor, date, and time
Data is sent to backend using API
Backend stores data in MySQL database
User can view all appointments in table format

Advantages
Reduces manual work
Easy to use
Fast and efficient
Organized data storage

How to Run
Start MySQL and create database
Run Spring Boot application
Open browser and go to:
http://localhost:8080

Conclusion
The Doctor Appointment System demonstrates a simple full-stack application integrating frontend, backend, and database to manage appointments effectively.
