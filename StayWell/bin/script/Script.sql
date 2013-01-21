--<ScriptOptions statementTerminator=";"/>

CREATE TABLE foodandbeverage (
	quantity INT NOT NULL,
	orderType VARCHAR(100) NOT NULL,
	time TIME NOT NULL,
	roomNumber INT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE ballroom (
	name VARCHAR(45),
	type VARCHAR(45),
	dateTime DATETIME
) ENGINE=InnoDB;

CREATE TABLE pointredemption (
	roomNumber INT NOT NULL,
	item VARCHAR(45) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE carcollection (
	carNo VARCHAR(100) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE laundryservice (
	type VARCHAR(100) NOT NULL,
	dateTime DATETIME NOT NULL,
	name VARCHAR(45) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE admin (
	email VARCHAR(100) NOT NULL,
	adminType VARCHAR(100) NOT NULL,
	PRIMARY KEY (email)
) ENGINE=InnoDB;

CREATE TABLE hotelfacilities (
	type VARCHAR(100) NOT NULL,
	dateTime DATETIME NOT NULL,
	name VARCHAR(45) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE restaurant (
	restaurantType VARCHAR(100) NOT NULL,
	dateTime VARCHAR(100) NOT NULL,
	name VARCHAR(45) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE guest (
	email VARCHAR(100) NOT NULL,
	membership VARCHAR(100) NOT NULL,
	points INT,
	roomNumber INT,
	cost DOUBLE,
	PRIMARY KEY (email)
) ENGINE=InnoDB;

CREATE TABLE user (
	userName VARCHAR(100) NOT NULL,
	password VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	nationality VARCHAR(100) NOT NULL,
	gender VARCHAR(100) NOT NULL,
	firstName VARCHAR(100) NOT NULL,
	lastName VARCHAR(100) NOT NULL,
	DOB VARCHAR(100) NOT NULL,
	address VARCHAR(100) NOT NULL,
	occupation VARCHAR(100) NOT NULL,
	PRIMARY KEY (email,userName)
) ENGINE=InnoDB;

CREATE TABLE feedback (
	houseKeeping VARCHAR(100),
	facilities VARCHAR(45),
	staff VARCHAR(45),
	overall VARCHAR(45)
) ENGINE=InnoDB;

CREATE TABLE cleaningservices (
	time VARCHAR(100),
	roomNumber INT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE taxi (
	carPlateNo VARCHAR(45) NOT NULL,
	dateTime VARCHAR(45) NOT NULL,
	roomNo VARCHAR(45) NOT NULL,
	name VARCHAR(45) NOT NULL
) ENGINE=InnoDB;

