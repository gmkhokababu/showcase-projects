-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: realestate
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `propertyId` int(11) NOT NULL AUTO_INCREMENT,
  `propertyType` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `size` int(11) NOT NULL,
  `amenities` text NOT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'available',
  `landlord_id` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  `saleType` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`propertyId`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (101,'commercial','Dhaka',12,'fully customizeable ','available','1001',2500,'rent','land'),(102,'residential','Dhaka',1500,'3 bed, 1 dining, 1 kitchen, 2 bathroom, belcony','available','1001',15000,'rent','flat'),(103,'commercial','Khulna',25000,'Commercial Lands for rent','available','1001',250000,'rent','land'),(104,'commercial','Dhaka',1500,'centreal ','available','1001',15000,'rent','land'),(105,'residential','Dhaka',15,'2 bed, 2 bath, dining/drawing, belcony','available','1001',250000,'sale','flat'),(106,'commercial','Dhaka',15,'Full Decorated','available','1001',30000,'rent','commercial space'),(107,'commercial','Dhaka',1500,'Front 1500','available','1001',15000,'rent','flat'),(127,'residential','Sylate',2400,'3 bed, 1 dining, 1 kitchen, 2 bathroom, belcony','available','1001',15000,'rent','flat'),(128,'residential','Khulna',3500,'3 bed, 1 dining, 1 kitchen, 2 bathroom, belcony','available','1001',25000,'rent','flat'),(129,'residential','Dhaka',1500,'ok','available','1001',15000,'rent','flat'),(130,'commercial','Dhaka',25000,'Ready for work','rented','1001',2500000,'lease','land'),(131,'industrial','Savar, Ashulia',20000,'Natural view, Specific and wonderful wather','available','1001',15000,'lease','land');
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-29 10:16:02
