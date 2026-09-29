-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: pharmecy
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
-- Table structure for table `purshase`
--

DROP TABLE IF EXISTS `purshase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purshase` (
  `purshasId` int(11) NOT NULL AUTO_INCREMENT,
  `pursDate` date DEFAULT NULL,
  `supllierId` int(11) DEFAULT NULL,
  `medicineName` varchar(200) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` varchar(100) DEFAULT NULL,
  `exDate` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `mrp` int(11) DEFAULT NULL,
  `purchaseRate` double DEFAULT NULL,
  `invoice` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`purshasId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purshase`
--

LOCK TABLES `purshase` WRITE;
/*!40000 ALTER TABLE `purshase` DISABLE KEYS */;
INSERT INTO `purshase` VALUES (6,'2024-06-04',3,'Rupatadine',1,'Rupa','R1560','2024-11-30',20,75,60,'100010'),(7,'2024-06-04',1,'Paracitamol',10,'Dymando','B1250','2024-12-31',200,12,8,'100010'),(8,'2024-06-07',1,'reneta',10,'ff','1ewww','2024-07-13',100,300,270,'100010'),(9,'2024-06-09',2,'Antacid',10,'Seclo -20mg','10jkl12','2024-07-31',200,8,60,'2024070612153');
/*!40000 ALTER TABLE `purshase` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-10  8:30:45
