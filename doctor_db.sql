CREATE DATABASE doctor_db;
USE doctor_db;
CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_name VARCHAR(100),
    appointment_date DATE,
    appointment_time TIME
);
SHOW TABLES;
INSERT INTO appointments (doctor_name, appointment_date, appointment_time)
VALUES ('Dr. John', '2026-03-30', '10:30:00');
SELECT * FROM appointments;
DELETE FROM appointments
WHERE doctor_name IS NULL
   OR appointment_date IS NULL
   OR appointment_time IS NULL;