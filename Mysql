CREATE DATABASE fee_management;

USE fee_management;

-- LOGIN TABLE
CREATE TABLE login (
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO login VALUES 
('admin','1234'),
('user','1111');

-- STUDENT TABLE
CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    email VARCHAR(50)
);

INSERT INTO student (name, course, email) VALUES
('Rahul Sharma', 'BCA', 'rahul@gmail.com'),
('Priya Verma', 'BBA', 'priya@gmail.com'),
('Aman Singh', 'MCA', 'aman@gmail.com');

-- FEE TABLE
CREATE TABLE fee (
    student_id INT,
    amount INT,
    date DATE
);

INSERT INTO fee VALUES
(1, 5000, '2026-01-10'),
(2, 7000, '2026-02-15'),
(3, 6000, '2026-03-01');
