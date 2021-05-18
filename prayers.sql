-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2021 at 10:17 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prayers`
--

-- --------------------------------------------------------

--
-- Table structure for table `biserici`
--

CREATE TABLE `biserici` (
  `Id` int(11) NOT NULL,
  `Nume` varchar(45) NOT NULL,
  `Adresa` varchar(45) NOT NULL,
  `Localitate` varchar(45) NOT NULL,
  `Telefon` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biserici`
--

INSERT INTO `biserici` (`Id`, `Nume`, `Adresa`, `Localitate`, `Telefon`) VALUES
(1, 'Betania nr 4', 'Strada Ciocarliei 12', 'Cluj-Napoca', '07test'),
(4, 'Izvorul Fericirii123123', 'cei ca noi 123', 'Ceica', '911');

-- --------------------------------------------------------

--
-- Table structure for table `motive`
--

CREATE TABLE `motive` (
  `Id` int(11) NOT NULL,
  `Motiv` varchar(500) NOT NULL,
  `Raspuns` varchar(250) NOT NULL,
  `Categorie` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `motive`
--

INSERT INTO `motive` (`Id`, `Motiv`, `Raspuns`, `Categorie`) VALUES
(1, 'Sa fie o zi insorita', 'Da', 'Cerere'),
(4, '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `participanti`
--

CREATE TABLE `participanti` (
  `Id` int(11) NOT NULL,
  `Nume` varchar(45) NOT NULL,
  `Prenume` varchar(45) NOT NULL,
  `Varsta` int(11) NOT NULL,
  `Telefon` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `participanti`
--

INSERT INTO `participanti` (`Id`, `Nume`, `Prenume`, `Varsta`, `Telefon`) VALUES
(1, 'Andrei', 'Ionescu', 12, '07test1232'),
(4, '1', '2', 3, '4');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biserici`
--
ALTER TABLE `biserici`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `motive`
--
ALTER TABLE `motive`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `participanti`
--
ALTER TABLE `participanti`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biserici`
--
ALTER TABLE `biserici`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `motive`
--
ALTER TABLE `motive`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `participanti`
--
ALTER TABLE `participanti`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
