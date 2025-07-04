CREATE DATABASE btjava10;
USE btjava10;

CREATE TABLE students(
	id int auto_increment,
	fullname varchar(255) not null,
	gender char(5),
	age int,
	city varchar(255),
	weight double,
	
	primary key(id)
);

INSERT INTO students(fullname,gender,age,city,weight) VALUES('Nguyen Thanh Nhan','Nam',19,'Can Tho',56.5674),
													  		('Pham Thu Huong','Nu',20,'Vinh Long',72.456),
													  		('Nguyen Nhu Ngoc','Nu',20,'Soc Trang',85.387),
													  		('Bui Thanh Bao','Nam',19,'Soc Trang',49.3),
													  		('Le My Nhan','Nu',22,'Can Tho',62.963),
													  		('Tan Thuc Bao','Nam',35,'An Giang',55.5678),
													  		('Trinh Giao Kim','Nam',44,'Bac Lieu',67.34);
													  		