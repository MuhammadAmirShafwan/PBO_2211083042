-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: pbo_firman_ardiansyah
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anggota`
--

DROP TABLE IF EXISTS `anggota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anggota` (
  `nobp` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `jenis_kelamin` char(1) DEFAULT NULL,
  PRIMARY KEY (`nobp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggota`
--

LOCK TABLES `anggota` WRITE;
/*!40000 ALTER TABLE `anggota` DISABLE KEYS */;
INSERT INTO `anggota` VALUES ('2211081008','Firman Ardiansyah','Padang Panjang','L'),('2211081009','Ntah Lah','Bukittinggi','P'),('2211082008','Farhan Kebab','Padang','P');
/*!40000 ALTER TABLE `anggota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buku`
--

DROP TABLE IF EXISTS `buku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buku` (
  `kodebuku` varchar(30) NOT NULL,
  `judulbuku` varchar(50) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kodebuku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buku`
--

LOCK TABLES `buku` WRITE;
/*!40000 ALTER TABLE `buku` DISABLE KEYS */;
INSERT INTO `buku` VALUES ('2210','Udin yang petot','Ajo','Suka-suka');
/*!40000 ALTER TABLE `buku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `customernumberangka2`
--

DROP TABLE IF EXISTS `customernumberangka2`;
/*!50001 DROP VIEW IF EXISTS `customernumberangka2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `customernumberangka2` (
  `customernumber` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customerNumber` int(11) NOT NULL,
  `customerName` varchar(50) NOT NULL,
  `contactLastName` varchar(50) NOT NULL,
  `contactFirstName` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `addressLine1` varchar(50) NOT NULL,
  `addressLine2` varchar(50) DEFAULT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `postalCode` varchar(15) DEFAULT NULL,
  `country` varchar(50) NOT NULL,
  `salesRepEmployeeNumber` int(11) DEFAULT NULL,
  `creditLimit` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`customerNumber`),
  KEY `salesRepEmployeeNumber` (`salesRepEmployeeNumber`),
  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`salesRepEmployeeNumber`) REFERENCES `employees` (`employeeNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `dataleslie`
--

DROP TABLE IF EXISTS `dataleslie`;
/*!50001 DROP VIEW IF EXISTS `dataleslie`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `dataleslie` (
  `productname` tinyint NOT NULL,
  `employeename` tinyint NOT NULL,
  `customername` tinyint NOT NULL,
  `shippeddate` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `datalesliedetail`
--

DROP TABLE IF EXISTS `datalesliedetail`;
/*!50001 DROP VIEW IF EXISTS `datalesliedetail`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `datalesliedetail` (
  `productname` tinyint NOT NULL,
  `employeename` tinyint NOT NULL,
  `customername` tinyint NOT NULL,
  `shippeddate` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `datalesliedetailsekali`
--

DROP TABLE IF EXISTS `datalesliedetailsekali`;
/*!50001 DROP VIEW IF EXISTS `datalesliedetailsekali`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `datalesliedetailsekali` (
  `productname` tinyint NOT NULL,
  `employeename` tinyint NOT NULL,
  `customername` tinyint NOT NULL,
  `shippeddate` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `emoffices`
--

DROP TABLE IF EXISTS `emoffices`;
/*!50001 DROP VIEW IF EXISTS `emoffices`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `emoffices` (
  `employeenumber` tinyint NOT NULL,
  `firstname` tinyint NOT NULL,
  `lastname` tinyint NOT NULL,
  `officecode` tinyint NOT NULL,
  `city` tinyint NOT NULL,
  `country` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `employeeNumber` int(11) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `extension` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `officeCode` varchar(10) NOT NULL,
  `reportsTo` int(11) DEFAULT NULL,
  `jobTitle` varchar(50) NOT NULL,
  PRIMARY KEY (`employeeNumber`),
  KEY `reportsTo` (`reportsTo`),
  KEY `officeCode` (`officeCode`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`reportsTo`) REFERENCES `employees` (`employeeNumber`),
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`officeCode`) REFERENCES `offices` (`officeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offices`
--

DROP TABLE IF EXISTS `offices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offices` (
  `officeCode` varchar(10) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `addressLine1` varchar(50) NOT NULL,
  `addressLine2` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `country` varchar(50) NOT NULL,
  `postalCode` varchar(15) NOT NULL,
  `territory` varchar(10) NOT NULL,
  PRIMARY KEY (`officeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offices`
--

LOCK TABLES `offices` WRITE;
/*!40000 ALTER TABLE `offices` DISABLE KEYS */;
/*!40000 ALTER TABLE `offices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `officesbaru`
--

DROP TABLE IF EXISTS `officesbaru`;
/*!50001 DROP VIEW IF EXISTS `officesbaru`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `officesbaru` (
  `officecode` tinyint NOT NULL,
  `city` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `officesbaru2`
--

DROP TABLE IF EXISTS `officesbaru2`;
/*!50001 DROP VIEW IF EXISTS `officesbaru2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `officesbaru2` (
  `officecode` tinyint NOT NULL,
  `city` tinyint NOT NULL,
  `country` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `officesbaru3`
--

DROP TABLE IF EXISTS `officesbaru3`;
/*!50001 DROP VIEW IF EXISTS `officesbaru3`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `officesbaru3` (
  `officecode` tinyint NOT NULL,
  `city` tinyint NOT NULL,
  `country` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderdetails` (
  `orderNumber` int(11) NOT NULL,
  `productCode` varchar(15) NOT NULL,
  `quantityOrdered` int(11) NOT NULL,
  `priceEach` decimal(10,2) NOT NULL,
  `orderLineNumber` smallint(6) NOT NULL,
  PRIMARY KEY (`orderNumber`,`productCode`),
  KEY `productCode` (`productCode`),
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderNumber`) REFERENCES `orders` (`orderNumber`),
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`productCode`) REFERENCES `products` (`productCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `orderNumber` int(11) NOT NULL,
  `orderDate` date NOT NULL,
  `requiredDate` date NOT NULL,
  `shippedDate` date DEFAULT NULL,
  `status` varchar(15) NOT NULL,
  `comments` text DEFAULT NULL,
  `customerNumber` int(11) NOT NULL,
  PRIMARY KEY (`orderNumber`),
  KEY `customerNumber` (`customerNumber`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payments` (
  `customerNumber` int(11) NOT NULL,
  `checkNumber` varchar(50) NOT NULL,
  `paymentDate` date NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY (`customerNumber`,`checkNumber`),
  CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payments`
--

LOCK TABLES `payments` WRITE;
/*!40000 ALTER TABLE `payments` DISABLE KEYS */;
/*!40000 ALTER TABLE `payments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peminjaman`
--

DROP TABLE IF EXISTS `peminjaman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peminjaman` (
  `kode_peminjaman` varchar(50) NOT NULL,
  `nobp` varchar(50) DEFAULT NULL,
  `kodebuku` varchar(50) DEFAULT NULL,
  `tglpinjam` date DEFAULT NULL,
  `tglkembali` date DEFAULT NULL,
  PRIMARY KEY (`kode_peminjaman`),
  KEY `nobp` (`nobp`),
  KEY `kodebuku` (`kodebuku`),
  CONSTRAINT `kodebuku` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `nobp` FOREIGN KEY (`nobp`) REFERENCES `anggota` (`nobp`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peminjaman`
--

LOCK TABLES `peminjaman` WRITE;
/*!40000 ALTER TABLE `peminjaman` DISABLE KEYS */;
/*!40000 ALTER TABLE `peminjaman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pengembalian`
--

DROP TABLE IF EXISTS `pengembalian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pengembalian` (
  `nobp` varchar(50) DEFAULT NULL,
  `kodebuku` varchar(50) DEFAULT NULL,
  `tglpinjam` date DEFAULT NULL,
  `tglkembali` date DEFAULT NULL,
  `terlambat` date DEFAULT NULL,
  `denda` int(11) DEFAULT NULL,
  KEY `kodebuku2` (`kodebuku`),
  KEY `nobp2` (`nobp`),
  CONSTRAINT `kodebuku2` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `nobp2` FOREIGN KEY (`nobp`) REFERENCES `anggota` (`nobp`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengembalian`
--

LOCK TABLES `pengembalian` WRITE;
/*!40000 ALTER TABLE `pengembalian` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengembalian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productlines`
--

DROP TABLE IF EXISTS `productlines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productlines` (
  `productLine` varchar(50) NOT NULL,
  `textDescription` varchar(4000) DEFAULT NULL,
  `htmlDescription` mediumtext DEFAULT NULL,
  `image` mediumblob DEFAULT NULL,
  PRIMARY KEY (`productLine`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productlines`
--

LOCK TABLES `productlines` WRITE;
/*!40000 ALTER TABLE `productlines` DISABLE KEYS */;
/*!40000 ALTER TABLE `productlines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `productCode` varchar(15) NOT NULL,
  `productName` varchar(70) NOT NULL,
  `productLine` varchar(50) NOT NULL,
  `productScale` varchar(10) NOT NULL,
  `productVendor` varchar(50) NOT NULL,
  `productDescription` text NOT NULL,
  `quantityInStock` smallint(6) NOT NULL,
  `buyPrice` decimal(10,2) NOT NULL,
  `MSRP` decimal(10,2) NOT NULL,
  PRIMARY KEY (`productCode`),
  KEY `productLine` (`productLine`),
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`productLine`) REFERENCES `productlines` (`productLine`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_mahasiswa`
--

DROP TABLE IF EXISTS `t_mahasiswa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_mahasiswa` (
  `No_bp` varchar(12) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  PRIMARY KEY (`No_bp`),
  KEY `indexnama` (`nama`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_mahasiswa`
--

LOCK TABLES `t_mahasiswa` WRITE;
/*!40000 ALTER TABLE `t_mahasiswa` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_mahasiswa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `customernumberangka2`
--

/*!50001 DROP TABLE IF EXISTS `customernumberangka2`*/;
/*!50001 DROP VIEW IF EXISTS `customernumberangka2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `customernumberangka2` AS select `classicmodels`.`customers`.`customerNumber` AS `customernumber` from `classicmodels`.`customers` where `classicmodels`.`customers`.`customerNumber` like '%2%' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `dataleslie`
--

/*!50001 DROP TABLE IF EXISTS `dataleslie`*/;
/*!50001 DROP VIEW IF EXISTS `dataleslie`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `dataleslie` AS select `classicmodels`.`products`.`productName` AS `productname`,concat(`classicmodels`.`employees`.`firstName`,' ',`classicmodels`.`employees`.`lastName`) AS `employeename`,`classicmodels`.`customers`.`customerName` AS `customername`,`classicmodels`.`orders`.`shippedDate` AS `shippeddate` from ((((`classicmodels`.`employees` join `classicmodels`.`customers` on(`classicmodels`.`employees`.`employeeNumber` = `classicmodels`.`customers`.`salesRepEmployeeNumber`)) join `classicmodels`.`orders` on(`classicmodels`.`customers`.`customerNumber` = `classicmodels`.`orders`.`customerNumber`)) join `classicmodels`.`orderdetails` on(`classicmodels`.`orders`.`orderNumber` = `classicmodels`.`orderdetails`.`orderNumber`)) join `classicmodels`.`products` on(`classicmodels`.`orderdetails`.`productCode` = `classicmodels`.`products`.`productCode`)) where concat(`classicmodels`.`employees`.`firstName`,' ',`classicmodels`.`employees`.`lastName`) = 'Leslie Thompson' and `classicmodels`.`orders`.`shippedDate` like '%2003%' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `datalesliedetail`
--

/*!50001 DROP TABLE IF EXISTS `datalesliedetail`*/;
/*!50001 DROP VIEW IF EXISTS `datalesliedetail`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `datalesliedetail` AS select `dataleslie`.`productname` AS `productname`,`dataleslie`.`employeename` AS `employeename`,`dataleslie`.`customername` AS `customername`,`dataleslie`.`shippeddate` AS `shippeddate` from `classicmodels`.`dataleslie` where `dataleslie`.`shippeddate` like '%05%' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `datalesliedetailsekali`
--

/*!50001 DROP TABLE IF EXISTS `datalesliedetailsekali`*/;
/*!50001 DROP VIEW IF EXISTS `datalesliedetailsekali`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `datalesliedetailsekali` AS select `datalesliedetail`.`productname` AS `productname`,`datalesliedetail`.`employeename` AS `employeename`,`datalesliedetail`.`customername` AS `customername`,`datalesliedetail`.`shippeddate` AS `shippeddate` from `classicmodels`.`datalesliedetail` where `datalesliedetail`.`productname` like '%c%' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `emoffices`
--

/*!50001 DROP TABLE IF EXISTS `emoffices`*/;
/*!50001 DROP VIEW IF EXISTS `emoffices`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `emoffices` AS select `classicmodels`.`employees`.`employeeNumber` AS `employeenumber`,`classicmodels`.`employees`.`firstName` AS `firstname`,`classicmodels`.`employees`.`lastName` AS `lastname`,`classicmodels`.`employees`.`officeCode` AS `officecode`,`classicmodels`.`offices`.`city` AS `city`,`classicmodels`.`offices`.`country` AS `country` from (`classicmodels`.`employees` join `classicmodels`.`offices` on(`classicmodels`.`employees`.`officeCode` = `classicmodels`.`offices`.`officeCode`)) */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `officesbaru`
--

/*!50001 DROP TABLE IF EXISTS `officesbaru`*/;
/*!50001 DROP VIEW IF EXISTS `officesbaru`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `officesbaru` AS select `classicmodels`.`offices`.`officeCode` AS `officecode`,`classicmodels`.`offices`.`city` AS `city` from `classicmodels`.`offices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `officesbaru2`
--

/*!50001 DROP TABLE IF EXISTS `officesbaru2`*/;
/*!50001 DROP VIEW IF EXISTS `officesbaru2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `officesbaru2` AS select `classicmodels`.`offices`.`officeCode` AS `officecode`,`classicmodels`.`offices`.`city` AS `city`,`classicmodels`.`offices`.`country` AS `country` from `classicmodels`.`offices` where `classicmodels`.`offices`.`country` = 'USA' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `officesbaru3`
--

/*!50001 DROP TABLE IF EXISTS `officesbaru3`*/;
/*!50001 DROP VIEW IF EXISTS `officesbaru3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `officesbaru3` AS select `classicmodels`.`offices`.`officeCode` AS `officecode`,`classicmodels`.`offices`.`city` AS `city`,`classicmodels`.`offices`.`country` AS `country` from `classicmodels`.`offices` where `classicmodels`.`offices`.`country` = 'USA' */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-13  8:52:32
