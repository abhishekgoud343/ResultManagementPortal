CREATE DATABASE srms;
SHOW DATABASES;
USE srms;


CREATE TABLE student(
	`Roll No` VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin PRIMARY KEY,
    Course VARCHAR(15),
    Branch VARCHAR(15),
    Name VARCHAR(30),
    Gender VARCHAR(15),
    `Father's Name` VARCHAR(25)
);

SELECT * FROM student;


CREATE TABLE result(
	`Roll No` VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin PRIMARY KEY,
    English VARCHAR(10),
    Physics VARCHAR(10),
    Math VARCHAR(10),
    Chemistry VARCHAR(10),
    `Engg. Mech` VARCHAR(10),
    DBMS VARCHAR(10),
    FOREIGN KEY(`Roll No`) REFERENCES student(`Roll No`)
);

SELECT * FROM result;


CREATE TABLE admin_credentials(
	username VARCHAR(40),
    password VARCHAR(50)
);

SELECT * FROM admin_credentials;