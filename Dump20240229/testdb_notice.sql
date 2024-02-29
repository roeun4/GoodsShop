-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: testdb
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice` (
  `no` int NOT NULL AUTO_INCREMENT,
  `writer` varchar(20) DEFAULT NULL,
  `title` varchar(40) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `InDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`no`),
  KEY `writer` (`writer`),
  CONSTRAINT `notice_ibfk_1` FOREIGN KEY (`writer`) REFERENCES `sadmin` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (2,NULL,'아무말이나 적고 확인해보는 테스트용 공지사항임','아아아아','2024-02-23 11:58:53'),(3,NULL,'1 공지사항','h','2024-02-23 12:37:29'),(4,NULL,'2 공지사항','ㅁㅀㅁㅇㅎ','2024-02-23 12:37:35'),(5,NULL,'3 공지사항','ㅁㅎㄴㅇㅎㅁㄹ','2024-02-23 12:37:43'),(6,NULL,'4 공지사항','ㅁㅎㄹㅇㅎ','2024-02-23 12:39:13'),(7,NULL,'5 공지사항','ㅇㅁㅎㄹ','2024-02-23 12:39:21'),(8,NULL,'6 공지사항','ㅁㅎㄹ놓','2024-02-23 12:39:27'),(9,NULL,'7 공지사항','ㅁㅇㅁㄹㄴㅇ','2024-02-23 12:39:38'),(10,NULL,'8 공지사항','ㅎㄻㅇㅎ','2024-02-23 12:39:44'),(11,NULL,'9 공지사항','ㅇㅀ','2024-02-23 12:39:50'),(12,NULL,'10 공지사항','ㅁㄴㅇㅎㅁㄹ','2024-02-23 12:39:58'),(13,NULL,'11 공지사항','ㅁㅀ','2024-02-23 12:40:08'),(14,NULL,'14 공지사항','ㅁㅎㅇ','2024-02-23 12:40:39'),(15,NULL,'15 공지사항','ㅁㅇㅎ','2024-02-23 12:40:50'),(17,NULL,'17 공지사항','ㅀㅁㄹ','2024-02-23 12:41:09'),(24,NULL,'공지사항','내용','2024-02-28 10:19:13');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-29 12:10:30
