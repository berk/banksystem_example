CREATE DATABASE bank_system;
USE bank_system;
CREATE USER 'bank'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON bank_system.* TO 'bank'@'localhost';

CREATE TABLE Account(
	accountId int AUTO_INCREMENT PRIMARY KEY,
	type char(10),
	dateCreated datetime NOT NULL 
);

CREATE TABLE BankCard(
	cardNumber varchar(16) NOT NULL,
	pin char(10),
	customerId int NOT NULL,
	expirationDate datetime NOT NULL 
);

CREATE TABLE Customer(
	customerId int AUTO_INCREMENT PRIMARY KEY,
	firstName varchar(50),
	lastName varchar(50) 
);

CREATE TABLE CustomerAccount(
	customerId int NOT NULL,
	accountId int NOT NULL 
);

CREATE TABLE TransactionLog(
	transactionId int AUTO_INCREMENT PRIMARY KEY,
	accountId int NOT NULL,
	customerId int NOT NULL,
	dateCreated datetime NOT NULL,
	type char(10) NOT NULL,
	amount float NOT NULL,
	clearFlag int NOT NULL 
);

