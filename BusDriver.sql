-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: BusDriver
-- ------------------------------------------------------
-- Server version	8.0.25

SET GLOBAL time_zone = '-6:00';

DROP SCHEMA IF EXISTS BusDriver;
DROP USER IF EXISTS 'driver';

CREATE SCHEMA BusDriver;
CREATE USER 'driver' IDENTIFIED BY 'Driver';
FLUSH PRIVILEGES;

USE BusDriver;

--
-- Table structure for table `Provincias`
--

DROP TABLE IF EXISTS `Provincias`;
CREATE TABLE `Provincias` (
  `id` 		INT NOT NULL AUTO_INCREMENT,
  `nombre` 	VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Provincias`
--

LOCK TABLES `Provincias` WRITE;
INSERT INTO `Provincias` 
VALUES 
	(1,'San José'),
	(2,'Alajuela'),
    (3,'Cartago'),
    (4,'Heredia'),
    (5,'Guanacaste'),
    (6,'Puntarenas'),
    (7,'Limón');
UNLOCK TABLES;

--
-- Table structure for table `Rutas`
--

DROP TABLE IF EXISTS `Rutas`;
CREATE TABLE `Rutas` (
  `id` 			INT NOT NULL AUTO_INCREMENT,
  `idProvincia`	INT NOT NULL,
  `codigo` 		VARCHAR(45) NOT NULL,
  `nombre` 		VARCHAR(45) NOT NULL,
  `horario` 	VARCHAR(45) NOT NULL,
  `fecha` 		DATE NOT NULL,
  `duracion` 	VARCHAR(45) NOT NULL,
  `parada` 		VARCHAR(45) NOT NULL,
  `precio` 		DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (idProvincia) REFERENCES Provincias(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Rutas`
--

LOCK TABLES `Rutas` WRITE;
INSERT INTO `Rutas`
VALUES 
	(1,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
	(2,1,'1002','San Jose - Puntarenas','06:00 am','2021-09-30','2:30','N/A',20000),
	(3,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(4,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(5,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30 ','4:00','Restaurante Salón del Pollo',30000),
	(6,1,'1002','San Jose - Puntarenas','06:00 am','2021-09-30','2:30','Directo',20000),
	(7,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30 ','4:00','Restaurante Salón del Pollo',30000),
	(8,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30 ','4:00','Restaurante Salón del Pollo',30000),
	(9,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(10,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30 ','4:00','Restaurante Salón del Pollo',30000),
	(11,1,'1001','San Jose - Guanacaste','06:00 am','2021-09-30 ','4:00','Restaurante Salón del Pollo',30000),
	(12,1,'1002','San Jose - Puntarenas','06:00 am','2021-09-30','2:30','Directo',20000),
	(13,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(14,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(15,1,'1001','San Jose - Guanacaste','8:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
	(16,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(17,1,'1001','San Jose - Guanacaste','10:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
	(18,1,'1002','San Jose - Puntarenas','2:00 pm','2021-09-30','2:30','Directo',20000),
	(19,1,'1003','San Jose - Alajuela','7:00 pm','2021-09-30','1:30','N/A',5000),
	(20,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(21,1,'1001','San Jose - Guanacaste','8:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
	(22,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(23,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(24,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(25,1,'1001','San Jose - Guanacaste','8:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
	(26,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(27,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(28,1,'1003','San Jose - Alajuela','7:00 am','2021-09-30','1:30','N/A',5000),
	(29,1,'1004','San Jose - Limon','9:00 am','2021-09-30','5:00','N/A',30000),
	(30,1,'1001','San Jose - Guanacaste','10:00 am','2021-09-30','4:00','Restaurante Salón del Pollo',30000),
    (31,2,2001,'Alajuela - San Jose','04:30 am','2021-09-30','00:45','N/A',3000),
	(32,2,2002,'Alajuela - Heredia','04:30 am','2021-09-30','00:30','N/A',2000),
	(33,2,2003,'Alajuela - Puntarenas','5:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(34,2,2001,'Alajuela - San Jose','5:00 am','2021-09-30','00:45','N/A',3000),
	(35,2,2005,'Alajuela - Cartago','6:00 am','2021-09-30','1:30','N/A',4000),
	(36,2,2006,'Alajuela - Limon','7:00 am','2021-09-30','4:30','Supermercado el Sol',30000),
	(37,2,2007,'Alajuela - Guanacaste','7:15 am','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(38,2,2001,'Alajuela - San Jose','8:00 am','2021-09-30','00:45','N/A',3000),
	(39,2,2005,'Alajuela - Cartago','9:00 am','2021-09-30','1:30','N/A',4000),
	(40,2,2010,'Alajuela - Heredia','9:30 am','2021-09-30','0:30','N/A',2000),
	(41,2,2003,'Alajuela - Puntarenas','2:00 pm','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(42,2,2007,'Alajuela - Guanacaste','4:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(43,2,2006,'Alajuela - Limon','5:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(44,2,2001,'Alajuela - San Jose','04:30 am','2021-09-30','00:45','N/A',3000),
	(45,2,2002,'Alajuela - Heredia','04:30 am','2021-09-30','00:30','N/A',2000),
	(46,2,2003,'Alajuela - Puntarenas','5:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(47,2,2001,'Alajuela - San Jose','5:00 am','2021-09-30','00:45','N/A',3000),
	(48,2,2005,'Alajuela - Cartago','6:00 am','2021-09-30','1:30','N/A',4000),
	(49,2,2006,'Alajuela - Limon','8:00 am','2021-09-30','4:30','Supermercado el Sol',30000),
	(50,2,2007,'Alajuela - Guanacaste','7:15 am','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(51,2,2001,'Alajuela  - San Jose','8:00 am','2021-09-30','00:45','N/A',3000),
	(52,2,2005,'Alajuela - Cartago','10:00 am','2021-09-30','1:30','N/A',4000),
	(53,2,2010,'Alajuela  - Heredia','9:30 am','2021-09-30','0:30','N/A',2000),
	(54,2,2003,'Alajuela - Puntarenas','2:00 pm','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(55,2,2007,'Alajuela - Guanacaste','4:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(56,2,2006,'Alajuela - Limon','5:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(57,2,2006,'Alajuela - Limon','7:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(58,2,2001,'Alajuela - San Jose','4:30 am','2021-09-30','00:45','N/A',3000),
	(59,2,2001,'Alajuela - San Jose','5:00 am','2021-09-30','00:45','N/A',3000),
	(60,2,2001,'Alajuela - San Jose','6:00 am','2021-09-30','00:45','N/A',3000),
    (61,3,3001,'Cartago - San Jose','04:30 am','2021-09-30','00:45','N/A',3000),
	(62,3,3002,'Cartago - Alajuela','05:30 am','2021-09-30','1:00','N/A',5000),
	(63,3,3003,'Cartago - Heredia','05:30 am','2021-09-30','00:30','N/A',4000),
	(64,3,3004,'Cartago - Puntarenas','8:00 am','2021-09-30','2:00','Restaurante el buen pescado',15000),
	(65,3,3001,'Cartago - San Jose','08:30 am','2021-09-30','00:45','N/A',3000),
	(66,3,3005,'Cartago - Guanacaste','11:15 am','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(67,3,3006,'Cartago - Limon','03:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(68,3,3001,'Cartago - San Jose','04:30 pm','2021-09-30','00:45','N/A',3000),
	(69,3,3001,'Cartago - San Jose','04:30 am','2021-09-30','00:45','N/A',3000),
	(70,3,3006,'Cartago - Limon','06:00 am','2021-09-30','4:30','Supermercado el Sol',30000),
	(71,3,3003,'Cartago - Heredia','05:30 am','2021-09-30','00:30','N/A',4000),
	(72,3,3003,'Cartago - Heredia','07:30 am','2021-09-30','00:30','N/A',4000),
	(73,3,3001,'Cartago - San Jose','08:30 am','2021-09-30','00:45','N/A',3000),
	(74,3,3001,'Cartago - San Jose','04:30 pm','2021-09-30','00:45','N/A',3000),
	(75,3,3004,'Cartago -Puntarenas','03:00 pm','2021-09-30','2:00','Restaurante el buen pescado',15000),
	(76,3,3001,'Cartago - San Jose','08:30 am','2021-09-30','00:45','N/A',3000),
	(77,3,3001,'Cartago - San Jose','08:30 am','2021-09-30','00:45','N/A',3000),
	(78,3,3004,'Cartago - Puntarenas','09:00 am','2021-09-30','2:00','Restaurante el buen pescado',15000),
	(79,3,3005,'Cartago - Guanacaste','11:15 am','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(80,3,3001,'Cartago - San Jose','12:30 m','2021-09-30','00:45','N/A',3000),
	(81,3,3004,'Cartago - Puntarenas','03:00 pm','2021-09-30','2:00','Restaurante el buen pescado',15000),
	(82,3,3001,'Cartago - San Jose','05:30 pm','2021-09-30','00:45','N/A',3000),
	(83,3,3006,'Cartago - Limon','07:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(84,3,3001,'Cartago - San Jose','05:30 am','2021-09-30','00:45','N/A',3000),
	(85,3,3001,'Cartago - San Jose','05:30 am','2021-09-30','00:45','N/A',3000),
	(86,3,3005,'Cartago - Guanacaste','11:15 am','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(87,3,3004,'Cartago - Puntarenas','03:00 pm','2021-09-30','2:00','Restaurante el buen pescado',15000),
	(88,3,3005,'Cartago - Guanacaste','04:15 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(89,3,3003,'Cartago - Heredia','05:30 pm','2021-09-30','00:30','N/A',4000),
	(90,3,3002,'Cartago - Alajuela','05:30 pm','2021-09-30','1:00','N/A',5000),
    (91,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(92,4,4002,'Heredia - Cartago','06:30 am','2021-09-30','1:00','N/A',3000),
	(93,4,4003,'Heredia - Puntarenas','5:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(94,4,4003,'Heredia - Puntarenas','5:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(95,4,4004,'Heredia - Guanacaste','4:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(96,4,4005,'Heredia - Limon','7:00 am','2021-09-30','4:30','Supermercado el Sol',30000),
	(97,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(98,4,4002,'Heredia - Cartago','08:30 am','2021-09-30','1:00','N/A',3000),
	(99,4,4004,'Heredia - Guanacaste','2:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(100,4,4003,'Heredia - Puntarenas','5:00 pm','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(101,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(102,4,4003,'Heredia - Puntarenas','5:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(103,4,4003,'Heredia - Puntarenas','7:00 am','2021-09-30','2:00','Restaurante el buen pescado',10000),
	(104,4,4002,'Heredia - Cartago','08:30 am','2021-09-30','1:00','N/A',3000),
	(105,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(106,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(107,4,4004,'Heredia - Guanacaste','1:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(108,4,4004,'Heredia - Guanacaste','5:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(109,4,4004,'Heredia - Guanacaste','6:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(110,4,4004,'Heredia - Guanacaste','7:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(111,4,4004,'Heredia - Guanacaste','8:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(112,4,4004,'Heredia - Guanacaste','9:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(113,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(114,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(115,4,4004,'Heredia - Guanacaste','7:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(116,4,4004,'Heredia - Guanacaste','7:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(117,4,4004,'Heredia - Guanacaste','7:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(118,4,4004,'Heredia - Guanacaste','7:00 pm','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(119,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
	(120,4,4001,'Heredia - San Jose','06:30 am','2021-09-30','00:45','N/A',2000),
    (121,5,5001,'Guanacaste - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(122,5,5002,'Guanacaste - Cartago','07:30 am','2021-09-30','6:00','Restaurante el Abismo',35000),
	(123,5,5003,'Guanacaste - Alajuela','09:00 am','2021-09-30','4:00','Restaurante el Abismo',25000),
	(124,5,5004,'Guanacaste - Heredia','10:00 am','2021-09-30','4:30','Supermercado La Noche',28000),
	(125,5,5005,'Guanacaste - Puntarenas','2:00 pm','2021-09-30','3:00','Supermercado La Noche',23000),
	(126,5,5001,'Guanacaste - San Jose','3:00 pm','2021-09-30','5:00','Restaurante el Abismo',30000),
	(127,5,5006,'Guanacaste - Limon','4:00 pm','2021-09-30','6:00','Restaurante el Abismo',40000),
	(128,5,5001,'Guanacaste - San Jose','5:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(129,5,5005,'Guanacaste - Puntarenas','6:00 am','2021-09-30','3:00','Supermercado La Noche',23000),
	(130,5,5001,'Guanacaste - San Jose','6:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(131,5,5001,'Guanacaste - San Jose','7:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(132,5,5001,'Guanacaste - San Jose','8:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(133,5,5001,'Guanacaste - San Jose','10:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(134,5,5005,'Guanacaste - Puntarenas','2:00 pm','2021-09-30','3:00','Supermercado La Noche',23000),
	(135,5,5004,'Guanacaste - Heredia','5:00 pm','2021-09-30','4:30','Supermercado La Noche',28000),
	(136,5,5001,'Guanacaste - San Jose','5:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(137,5,5001,'Guanacaste - San Jose','6:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(138,5,5001,'Guanacaste - San Jose','8:00 am','2021-09-30','5:00','Restaurante el Abismo',30000),
	(139,5,5004,'Guanacaste - Heredia','9:00 am','2021-09-30','4:30','Supermercado La Noche',28000),
	(140,5,5005,'Guanacaste - Puntarenas','10:00 am','2021-09-30','3:00','Supermercado La Noche',23000),
	(141,5,5004,'Guanacaste - Heredia','12:00 m','2021-09-30','4:30','Supermercado La Noche',28000),
	(142,5,5001,'Guanacaste - San Jose','3:00 pm','2021-09-30','5:00','Restaurante el Abismo',30000),
	(143,5,5001,'Guanacaste - San Jose','5:00 pm','2021-09-30','5:00','Restaurante el Abismo',30000),
    (144,6,6001,'Puntarenas - San Jose','6:30 am','2021-09-30','2:00','N/A',4500),
	(145,6,6002,'Puntarenas - Cartago','7:00 am','2021-09-30','3:00','Retaurante el campeon',20000),
	(146,6,6003,'Puntarenas - Guanacaste','8:15 am','2021-09-30 ','4:00','Resturante el Encanto Tico',25000),
	(147,6,6001,'Puntarenas - San Jose','9:30 am','2021-09-30','2:00','N/A',4500),
	(148,6,6004,'Puntarenas - Heredia','10:30 am','2021-09-30','0:30','N/A',2000),
	(149,6,6006,'Puntarenas - Limon','2:00 pm','2021-09-30','4:30','Supermercado el Sol',30000),
	(150,6,6001,'Puntarenas - San Jose','6:30 am','2021-09-30','2:00','N/A',4500),
	(151,6,6003,'Puntarenas - Guanacaste','12:15 m','2021-09-30','4:00','Resturante el Encanto Tico',25000),
	(152,6,6004,'Puntarenas - Heredia','2:30 pm','2021-09-30','0:30','N/A',2000),
	(153,6,6001,'Puntarenas - San Jose','6:30 am','2021-09-30','2:00','N/A',4500),
	(154,6,6001,'Puntarenas - San Jose','7:30 am','2021-09-30','2:00','N/A',4500),
	(155,6,6001,'Puntarenas - San Jose','8:30 am','2021-09-30','2:00','N/A',4500),
	(156,6,6001,'Puntarenas - San Jose','6:30 am','2021-09-30','2:00','N/A',4500),
	(157,6,6001,'Puntarenas - San Jose','11:30 am','2021-09-30','2:00','N/A',4500),
	(158,6,6004,'Puntarenas - Heredia','10:30 am','2021-09-30','0:30','N/A',2000),
	(159,6,6004,'Puntarenas - Heredia','10:30 am','2021-09-30','0:30','N/A',2000),
	(160,6,6004,'Puntarenas - Heredia','10:30 am','2021-09-30','0:30','N/A',2000),
	(161,6,6001,'Puntarenas - San Jose','6:30 am','2021-09-30','2:00','N/A',4500),
	(162,6,6001,'Puntarenas - San Jose','10:30 am','2021-09-30','2:00','N/A',4500),
	(163,6,6001,'Puntarenas - San Jose','11:30 am','2021-09-30','2:00','N/A',4500),
	(164,6,6001,'Puntarenas - San Jose','2:30 pm','2021-09-30','2:00','N/A',4500),
    (165,6,6001,'Puntarenas - San Jose','2:30 pm','2021-09-30','2:00','N/A',4500),
    (167,7,7001,'Limon - San Jose','06:30 am','2021-09-30','05:00','Restaurante el Buen Pescado',40000),
	(168,7,7002,'Limon - Puntarenas','06:30 am','2021-09-30','4:00','Supermercado el Tope',30000),
	(169,7,7003,'Limon - Guanacaste','7:15 am','2021-09-30 ','6:00','Resturante el Encanto Tico',25000),
	(170,7,7003,'Limon - Guanacaste','7:15 am','2021-09-30 ','6:00','Resturante el Encanto Tico',25000),
	(171,7,7005,'Limon - Cartago','9:00 am','2021-09-30 ','6:30','Supermercado el Tio Azul',4000),
	(172,7,7004,'Limon - Heredia','9:30 am','2021-09-30 ','4:30','Restaurante el Buen Pescado',2000),
	(173,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(174,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(175,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(176,7,7002,'Limon - Puntarenas','06:30 am','2021-09-30','4:00','Supermercado el Tope',30000),
	(177,7,7002,'Limon - Puntarenas','06:30 am','2021-09-30','4:00','Supermercado el Tope',30000),
	(178,7,7003,'Limon - Guanacaste','7:15 am','2021-09-30','6:00','Resturante el Encanto Tico',25000),
	(179,7,7005,'Limon - Cartago','9:00 am','2021-09-30','6:30','Supermercado el Tio Azul',4000),
	(180,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(181,7,7005,'Limon - Cartago','9:00 am','2021-09-30','6:30','Supermercado el Tio Azul',4000),
	(182,7,7003,'Limon - Guanacaste','12:15 m','2021-09-30','6:00','Resturante el Encanto Tico',25000),
	(183,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(184,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(185,7,7001,'Limon - San Jose','06:30 am','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(186,7,7004,'Limon - Heredia','9:30 am','2021-09-30','4:30','Restaurante el Buen Pescado',2000),
	(187,7,7005,'Limon - Cartago','9:00 am','2021-09-30','6:30','Supermercado el Tio Azul',4000),
	(188,7,7001,'Limon - San Jose','1:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(189,7,7004,'Limon - Heredia','9:30 am','2021-09-30','4:30','Restaurante el Buen Pescado',2000),
	(190,7,7004,'Limon - Heredia','3:30 pm','2021-09-30','4:30','Restaurante el Buen Pescado',2000),
	(191,7,7001,'Limon - San Jose','1:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(192,7,7001,'Limon - San Jose','1:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(193,7,7001,'Limon - San Jose','3:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
	(194,7,7001,'Limon - San Jose','4:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000),
    (195,7,7001,'Limon - San Jose','4:30 pm','2021-09-30','5:00','Restaurante el Buen Pescado',40000);
UNLOCK TABLES;

--
-- Table structure for table `Terminales`
--

DROP TABLE IF EXISTS `Terminales`;
CREATE TABLE `Terminales` (
  `id` 			INT NOT NULL AUTO_INCREMENT,
  `ciudad` 		VARCHAR(45) NOT NULL,
  `direccion` 	VARCHAR(100) NOT NULL,
  `horario` 	VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Terminales`
--

LOCK TABLES `Terminales` WRITE;
INSERT INTO `Terminales` 
VALUES 
	(1,'San José','Entre calle 05 y av 20, Plaza Viquez','5:00AM | 11:00PM'),
	(2,'San José','Escazú. calle 22, frente a Burger King','6:00AM | 09:00PM'),
	(3,'Alajuela','De la Policia Rural 200 mts este','4:30AM | 09:00PM'),
	(4,'Cartago','Al costado del quiosco Copa Buena','4:30AM | 06:00PM'),
	(5,'Heredia','Detrás del mercado central 6, 3','5:00AM | 09:00PM'),
	(6,'Puntarenas','Contiguo al Banco Nacional ','8:00AM | 09:00PM'),
	(7,'Guanacaste','Mercado municipal de Guanacaste, 6, 6.','6:00AM | 10:00PM'),
	(8,'Limon','Frente al Hotel Impala, 6, 7.','7:00AM | 08:00PM');
UNLOCK TABLES;

--
-- Table structure for table `Aperitivos`
--

DROP TABLE IF EXISTS `Aperitivos`;
CREATE TABLE `Aperitivos` (
  `id` 		INT NOT NULL AUTO_INCREMENT,
  `codigo` 	INT NOT NULL,
  `plato` 	VARCHAR(45) NOT NULL,
  `precio` 	DOUBLE DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Aperitivos`
--

LOCK TABLES `Aperitivos` WRITE;
INSERT INTO `Aperitivos` 
VALUES 
	(1,1001,'Sandwich de Pollo',3000),
	(2,2002,'Sandwich de Jamón y Queso',2500),
	(3,3001,'Coca- Cola',1500),
    (4,4001,'Agua',1000),
	(5,5001,'Ginger Ale',1500),
	(6,6001,'Hamburguesa de Pollo',6000),
	(7,7001,'Hamburguesa de Carne',6000),
	(8,8001,'Hamburguesa Especial',7500),
	(9,9001,'Sushi: California',8000),
	(10,1101,'Sushi: Nevado',8000),
	(11,2101,'Pizza 4 Quesos',5000),
	(12,3101,'Dona Especial',2000),
	(13,4101,'Pinto de la casa',3000),
	(14,5101,'Cafe Negro',1500),
	(15,6101,'Reposteria',2000),
	(16,7101,'Queque de Chocolate',2500),
	(17,8101,'Queque de Vainilla',2500),
	(18,9101,'Brownies',2000),
	(19,2202,'Yogurt con frutas',3000),
	(20,3303,'Ensalada de Frutas',3000);
UNLOCK TABLES;

--
-- Table structure for table `Clientes`
--

DROP TABLE IF EXISTS `Clientes`;
CREATE TABLE `Clientes` (
  `id` 			INT NOT NULL AUTO_INCREMENT,
  `cedula` 		VARCHAR(45) NOT NULL,
  `nombre` 		VARCHAR(45) NOT NULL,
  `correo` 		VARCHAR(45) NOT NULL,
  `celular` 	VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Clientes`
--

LOCK TABLES `Clientes` WRITE;
INSERT INTO `Clientes` 
VALUES
	(1, '118180578','Johann Perez','JohannPerez@gmail.com','+50687281956'),
	(2, '118180585','Angel Soto','AngelSoto@gmail.com','+50687281946'),
	(3, '118180574','Carla Solano','CarlaSolano@gmail.com','+50687281985'),
	(4, '118180578','James Rodriguez','JamesRodriguez@gmail.com','+50687281978');
UNLOCK TABLES;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
CREATE TABLE `Usuarios` (
  `id` 				INT NOT NULL AUTO_INCREMENT,
  `idCliente` 		INT NOT NULL,
  `usuario` 		VARCHAR(45) NOT NULL,
  `password` 		VARCHAR(45) NOT NULL,
  `idRol` 			VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (idCliente) REFERENCES Clientes(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
INSERT INTO `Usuarios` 
VALUES 
	(1,1,'juan','123','admin'),
	(2,2,'angel','123','admin'),
	(3,3,'carla','123','admin'),
	(4,4,'james','123','comun');
UNLOCK TABLES;

--
-- Table structure for table `Reservas`
--

DROP TABLE IF EXISTS `Reservas`;
CREATE TABLE `Reservas` (
  `id` 			INT NOT NULL AUTO_INCREMENT,
  `idUsuario` 	INT NOT NULL,
  `idRuta` 		INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(id),
  FOREIGN KEY (idRuta) REFERENCES Rutas(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Reservas`
--

LOCK TABLES `Reservas` WRITE;
INSERT INTO `Reservas` 
VALUES 
(1,1,1),
(2,2,2);
UNLOCK TABLES;

-- END SCRIPT