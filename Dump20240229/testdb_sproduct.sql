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
-- Table structure for table `sproduct`
--

DROP TABLE IF EXISTS `sproduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sproduct` (
  `pno` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(100) NOT NULL,
  `pcate_fk` varchar(20) DEFAULT NULL,
  `pimage` varchar(200) DEFAULT NULL,
  `pcompany` varchar(50) DEFAULT NULL,
  `delivery` int NOT NULL DEFAULT '0',
  `price` int NOT NULL DEFAULT '0',
  `pspec` varchar(20) DEFAULT NULL,
  `pcontent` varchar(300) DEFAULT NULL,
  `in_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pno`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sproduct`
--

LOCK TABLES `sproduct` WRITE;
/*!40000 ALTER TABLE `sproduct` DISABLE KEYS */;
INSERT INTO `sproduct` VALUES (12,'ㅇㄹ','의류','workplace-2303851_1920.jpg','나누',5000,30000,'일반','fvjh','2024-01-31 12:49:27'),(13,'비타민','디지털/테크','thumb-66CI66qs7I2464Sk7J28_6_276x276.jpg','TEAZEN',3000,13900,'인기','ㅁㅇㄹ','2024-02-02 15:21:32'),(14,'친환경 키친타올','리빙','thumb-09_276x276.jpg','나누',3000,15000,'인기','ㅁㅇㄹ','2024-02-02 15:22:19'),(15,'박','스티커','granola_320x340.jpg','LG',1000,12500,'일반','ㅇㅁㄹ','2024-02-02 15:26:46'),(16,'쿠키박스','문구/오피스','thumb-7L2U7L2U64Sb7I2464Sk7J28_6_276x276.jpg','바스틀리',1000,12900,'최신','ㅁㅇㄹ','2024-02-02 16:48:53'),(17,'대나무','폰액세서리','thumb-64KY64iE64yA6c_276x276.jpg','아임에코',2000,8900,'추천','ㄴㅁㅇㄹ','2024-02-02 16:49:30'),(18,'ㅇㄴㅁㄹ','패션잡화','thumb-65GQ7Jyg_276x276.jpg','TEN',2000,15048,'추천','ㅁㅇㄴㄹ','2024-02-02 16:50:00'),(19,'ㅇㅁㄹ','패션잡화','thumb-7I2464Sk7J281_276x276.jpg','ㅁㅇㄴㄹ',158,84,'최신','ㅁㄹㅇ','2024-02-02 16:50:16'),(20,'초코파이','스티커','thumb-knola1007IiY7KCc7IaM200g_276x276.jpg','나누',3000,5000,'일반','ㅗㅓ','2024-02-26 11:03:15'),(24,'노트북','디지털/테크','1000000662_main_045.jpg','TEAZEN',5000,159000,'인기','ㅁㅇㄹ','2024-02-26 13:33:00'),(25,'물병','리빙','thumb-6rOg66eI7Jq07IOY_276x276.png','바스티',2000,9900,'인기','ㅇㅁㄶ','2024-02-26 17:10:31'),(26,'종이','문구/오피스','thumb-67CA7YKk7JqU7IiY7KCcF_276x276.jpg','per',1500,3000,'인기','adsg','2024-02-26 17:22:05'),(27,'콤부차 스티커 10매','스티커','thumb-TEAZEN_PEACHE_276x276.jpg','TEAZEN',1000,3500,'최신','ㅁㅇㅎ','2024-02-26 17:44:41'),(28,'리얼한 김치 쿠션','쿠션/패브릭','thumb-7JuM7Luk7Z6Q7Zi47YWU7JuM7Luk7Z6Q7Zi47YWU7Ys6riw6rmA7LmY_276x276.jpg','나도몰라',1500,21000,'최신','ㅁㅇㅎ','2024-02-26 17:47:57'),(29,'라벨','스티커','thumb-6rCA67K87Jq07IOY1L7I2464Sk7J28_276x276.jpg','라라라',1000,2300,'최신','ㅁㅇㅎ','2024-02-26 17:48:49'),(30,'아라','의류','thumb-thum_7YKk7Lmc7YOA7JuU7J2867CY7ZiV2_276x276.jpg','라라라',1500,35000,'인기','ㅁㅇㄶ','2024-02-27 09:47:13');
/*!40000 ALTER TABLE `sproduct` ENABLE KEYS */;
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
