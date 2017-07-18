CREATE DATABASE  IF NOT EXISTS `dbinfox` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dbinfox`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: dbinfox
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbclientes`
--

DROP TABLE IF EXISTS `tbclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbclientes` (
  `idcli` int(11) NOT NULL AUTO_INCREMENT,
  `nomecli` varchar(50) NOT NULL,
  `endcli` varchar(100) DEFAULT NULL,
  `fonecli` varchar(15) NOT NULL,
  `emailcli` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbclientes`
--

LOCK TABLES `tbclientes` WRITE;
/*!40000 ALTER TABLE `tbclientes` DISABLE KEYS */;
INSERT INTO `tbclientes` VALUES (1,'Linus Torvalds','Rua Tux, 2015','9999-9999','linus@linux.com'),(2,'José de Assis','Rua da gasômetro, 1234','9800-0008','professorjosedeassis@gmail.com'),(3,'João da Silva','Rua vitória, 56','5678-9009','joao@hotmail.com'),(4,'Leandro Ramos','Rua tuiuti, 2600','3900-0000','professorramos@aulaead.com'),(5,'Juliana Paes','Rua santa luzia, 456','7890-0987','ju@globo.com'),(6,'Joaquim Jorge','Avenida Sumaré, 2009 casa 2','2908-0987','joaqui@yahoo.com'),(9,'Tadeu Espíndola Palermo','Rua das carmélias, 800','61 9 8647-3913','tadeupalermoti@gmail.com'),(11,'Osvaldo','Rua Carmélia 25','656565','tau@tau.com'),(12,'Cliente teste','teste','32598','teste@teste.com');
/*!40000 ALTER TABLE `tbclientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbos`
--

DROP TABLE IF EXISTS `tbos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbos` (
  `os` int(11) NOT NULL AUTO_INCREMENT,
  `data_os` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(15) NOT NULL,
  `situacao` varchar(25) NOT NULL,
  `equipamento` varchar(150) NOT NULL,
  `defeito` varchar(150) NOT NULL,
  `servico` varchar(150) DEFAULT NULL,
  `tecnico` varchar(30) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `idcli` int(11) NOT NULL,
  PRIMARY KEY (`os`),
  KEY `idcli` (`idcli`),
  CONSTRAINT `tbos_ibfk_1` FOREIGN KEY (`idcli`) REFERENCES `tbclientes` (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbos`
--

LOCK TABLES `tbos` WRITE;
/*!40000 ALTER TABLE `tbos` DISABLE KEYS */;
INSERT INTO `tbos` VALUES (6,'2017-06-03 04:33:37','Orçamento','Na bancada','Impressora Deskjet','Não puxa papel','','',0.00,6),(7,'2017-06-03 04:39:51','Orçamento','Orçamento REPROVADO','Geladeira','não liga','trocar carvão','Tadeu',40.25,4),(8,'2017-06-03 04:40:18','Orçamento','Entrega OK','hhhh','hhhh','','',25.00,2),(9,'2017-06-03 04:41:33','Orçamento','Retornou','fdfdf','fdfdfd','','',0.00,4),(10,'2017-07-17 05:44:06','OS','Orçamento REPROVADO','ddd','ddd','ddd','ddd',5.00,11),(11,'2017-07-17 15:54:23','OS','Entrega OK','Ventilador','estragado','consetar','tadeu',25.00,2);
/*!40000 ALTER TABLE `tbos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbusuarios`
--

DROP TABLE IF EXISTS `tbusuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbusuarios` (
  `iduser` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `fone` varchar(15) DEFAULT NULL,
  `login` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbusuarios`
--

LOCK TABLES `tbusuarios` WRITE;
/*!40000 ALTER TABLE `tbusuarios` DISABLE KEYS */;
INSERT INTO `tbusuarios` VALUES (1,'Tadeu Espíndola Palermo','61 9 8647-3913','tadeuespindola','tadeu123','admin'),(2,'Administrador','2222-2222','admin','admin','admin'),(3,'Leandro Ramos','9999-9999','leandro','123','user'),(4,'Bill Gates','4444-4444','bill','123','user'),(5,'Jefferson Costa','5555-5555','jefferson','123456','user'),(6,'Linus Torvalds','9999-9999','linus','123','admin'),(7,'Robson Vaamonde','7777-7777','robson','123','admin'),(8,'Bruce Dickinson','6666-6666','iron','maiden','admin'),(9,'Angelina Jolie','9999-9999','lara','croft','user');
/*!40000 ALTER TABLE `tbusuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-17 23:16:57
