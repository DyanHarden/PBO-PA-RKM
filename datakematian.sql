-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Nov 03, 2023 at 09:30 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datakematian`
--

-- --------------------------------------------------------

--
-- Table structure for table `almarhum`
--

CREATE TABLE `almarhum` (
  `NIK` char(12) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Domisili` varchar(50) NOT NULL,
  `Tanggal_lahir` varchar(30) NOT NULL,
  `Tanggal_meninggal` varchar(50) NOT NULL,
  `Tempat_meninggal` varchar(50) NOT NULL,
  `Penyebab_meninggal` varchar(50) NOT NULL,
  `Tempati_pemakaman` varchar(50) NOT NULL,
  `Staff_ID_Staff` char(5) NOT NULL,
  `Keluarga_NIK_keluarga` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `almarhum`
--

INSERT INTO `almarhum` (`NIK`, `Nama`, `Domisili`, `Tanggal_lahir`, `Tanggal_meninggal`, `Tempat_meninggal`, `Penyebab_meninggal`, `Tempati_pemakaman`, `Staff_ID_Staff`, `Keluarga_NIK_keluarga`) VALUES
('124671885512', 'Cahyo Bakti', 'Loa Hui, Samarinda', '7 Oktober 1991', '14 Juni 2022', '', 'Rumah Sakit Abdul Moeis, Samarinda', 'Kecelakaan Bermotor', 'ID001', NULL),
('648813903489', 'Megalo Donia', 'Simpang Tiga, Samarinda', '9 Januari 1971', '3 April 2023', 'RS Haji Darjad, Samarinda', 'Sakit Jantung', 'TPU Simpang Tiga, Samarinda', 'ID001', '779011526711');

-- --------------------------------------------------------

--
-- Table structure for table `keluarga`
--

CREATE TABLE `keluarga` (
  `NIK_keluarga` char(12) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Hubungan_dengan_almarhum` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `keluarga`
--

INSERT INTO `keluarga` (`NIK_keluarga`, `Nama`, `Jenis_Kelamin`, `Hubungan_dengan_almarhum`) VALUES
('779011526711', 'Muhammad Sumbul', 'Pria', 'Paman'),
('912287438832', 'Sri Sulaikah', 'Wanita', 'Ibu Kandung');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `ID_Staff` char(5) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Nomor_telepn` char(12) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `Staff_ID_Staff` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`ID_Staff`, `Nama`, `Nomor_telepn`, `Username`, `Password`, `Staff_ID_Staff`) VALUES
('ID001', 'Dian Nurdiansyah', '081341420490', 'dianrt17', 'dian123', 'ID001'),
('ID002', 'Siti Solikah Yosi Karinda', '085225995341', 'ssykarinda1', '123', 'ID001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `almarhum`
--
ALTER TABLE `almarhum`
  ADD PRIMARY KEY (`NIK`),
  ADD KEY `Almarhum_Keluarga_FK` (`Keluarga_NIK_keluarga`),
  ADD KEY `Almarhum_Staff_FK` (`Staff_ID_Staff`);

--
-- Indexes for table `keluarga`
--
ALTER TABLE `keluarga`
  ADD PRIMARY KEY (`NIK_keluarga`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`ID_Staff`),
  ADD KEY `Staff_Staff_FK` (`Staff_ID_Staff`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `almarhum`
--
ALTER TABLE `almarhum`
  ADD CONSTRAINT `Almarhum_Keluarga_FK` FOREIGN KEY (`Keluarga_NIK_keluarga`) REFERENCES `keluarga` (`NIK_keluarga`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Almarhum_Staff_FK` FOREIGN KEY (`Staff_ID_Staff`) REFERENCES `staff` (`ID_Staff`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `Staff_Staff_FK` FOREIGN KEY (`Staff_ID_Staff`) REFERENCES `staff` (`ID_Staff`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
