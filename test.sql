-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 23, 2017 at 06:58 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `forum`
--

CREATE TABLE IF NOT EXISTS `forum` (
  `id` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `komentar` varchar(300) DEFAULT NULL,
  `odg` varchar(2) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forum`
--

INSERT INTO `forum` (`id`, `username`, `komentar`, `odg`) VALUES
(3, 'alex', 'pozdravvv', NULL),
(4, 'nesa', 'cao svima!', NULL),
(5, 'alex', 'dobar sajt', NULL),
(6, 'alex', 'vratite mi moje pareee!!!!', NULL),
(7, 'cao', 'gotovo jos malo', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `kontakt`
--

CREATE TABLE IF NOT EXISTS `kontakt` (
  `id` int(11) NOT NULL,
  `ime` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefon` varchar(20) DEFAULT NULL,
  `poruka` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kontakt`
--

INSERT INTO `kontakt` (`id`, `ime`, `email`, `telefon`, `poruka`) VALUES
(12, 'nenad jevtic', 'penedren@gmail.com', '0640364539', 'ne mogu da napravim profil');

-- --------------------------------------------------------

--
-- Table structure for table `korpa`
--

CREATE TABLE IF NOT EXISTS `korpa` (
  `id_korpa` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `id_proizvod` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `korpa`
--

INSERT INTO `korpa` (`id_korpa`, `username`, `id_proizvod`, `status`) VALUES
(14, 'alex', 12, '0'),
(15, 'sone', 12, '0'),
(17, 'alex', 13, NULL),
(18, 'sone', 12, NULL),
(19, 'nenad', 8, '0'),
(20, 'pedja99', 8, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `odgovori`
--

CREATE TABLE IF NOT EXISTS `odgovori` (
  `id_odgovor` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `odg` varchar(300) DEFAULT NULL,
  `komentar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `odgovori`
--

INSERT INTO `odgovori` (`id_odgovor`, `id`, `username`, `odg`, `komentar`) VALUES
(22, 3, 'alex', 'odgovor1', NULL),
(23, 4, 'alex', 'odgovor2', NULL),
(28, 5, 'mkyong', 'odgovor3', NULL),
(29, 6, 'alex', 'odgovor4', NULL),
(31, 4, 'sone', 'odgovor2.1', NULL),
(32, 4, 'alex', 'sta je bilo bre?', NULL),
(33, 7, 'cao', 'bravo', NULL),
(34, 7, 'cao', 'hvala', NULL),
(35, 7, 'cao', ':)', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `proizvod`
--

CREATE TABLE IF NOT EXISTS `proizvod` (
  `id_proizvod` int(11) NOT NULL,
  `id_tip` int(11) DEFAULT NULL,
  `cena` int(11) NOT NULL,
  `vrsta` varchar(100) NOT NULL,
  `zaauto` varchar(100) NOT NULL,
  `proizvodnja` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proizvod`
--

INSERT INTO `proizvod` (`id_proizvod`, `id_tip`, `cena`, `vrsta`, `zaauto`, `proizvodnja`, `username`) VALUES
(8, 26, 3500, 'boss', 'audi', 2016, NULL),
(9, 27, 600000, 'ferrari', 'maserati', 2016, NULL),
(12, 40, 12000, 'metalna', 'pezo', 2015, NULL),
(13, 26, 5500, 'servo', 'volvo', 2014, NULL),
(14, 25, 3200, 'servoooooo', 'yugo', 1990, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `proizvod_tip`
--

CREATE TABLE IF NOT EXISTS `proizvod_tip` (
  `id` int(11) NOT NULL,
  `naziv` varchar(200) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proizvod_tip`
--

INSERT INTO `proizvod_tip` (`id`, `naziv`) VALUES
(33, 'guma'),
(40, 'hauba'),
(26, 'menjac'),
(27, 'motor'),
(25, 'volan');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL,
  `adresa` varchar(60) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `ime` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `prezime` varchar(60) NOT NULL,
  `role` varchar(50) NOT NULL,
  `telefon` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `adresa`, `enabled`, `ime`, `password`, `prezime`, `role`, `telefon`, `username`) VALUES
(18, '', b'1', '', '123', '', 'admin', '', 'admin1'),
(36, 'paracin', b'1', 'pedja', '12345678', 'jevtic', 'user', '/', 'pedja99'),
(37, '35250 Paracin', b'1', 'nenad', '123', 'jevtic', 'user', '0640364539', 'sone');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `forum`
--
ALTER TABLE `forum`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kontakt`
--
ALTER TABLE `kontakt`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `korpa`
--
ALTER TABLE `korpa`
  ADD PRIMARY KEY (`id_korpa`), ADD KEY `FK_8raysm3sr33bvwtem3vgebn0n` (`id_proizvod`);

--
-- Indexes for table `odgovori`
--
ALTER TABLE `odgovori`
  ADD PRIMARY KEY (`id_odgovor`), ADD KEY `odgovori` (`id`);

--
-- Indexes for table `proizvod`
--
ALTER TABLE `proizvod`
  ADD PRIMARY KEY (`id_proizvod`), ADD KEY `id_tip` (`id_tip`);

--
-- Indexes for table `proizvod_tip`
--
ALTER TABLE `proizvod_tip`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `UK_npxuh8wpihatinfy38r6h755p` (`naziv`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `forum`
--
ALTER TABLE `forum`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `kontakt`
--
ALTER TABLE `kontakt`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `korpa`
--
ALTER TABLE `korpa`
  MODIFY `id_korpa` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `odgovori`
--
ALTER TABLE `odgovori`
  MODIFY `id_odgovor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT for table `proizvod`
--
ALTER TABLE `proizvod`
  MODIFY `id_proizvod` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `proizvod_tip`
--
ALTER TABLE `proizvod_tip`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=38;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `korpa`
--
ALTER TABLE `korpa`
ADD CONSTRAINT `FK_8raysm3sr33bvwtem3vgebn0n` FOREIGN KEY (`id_proizvod`) REFERENCES `proizvod` (`id_proizvod`);

--
-- Constraints for table `odgovori`
--
ALTER TABLE `odgovori`
ADD CONSTRAINT `odgovori_ibfk_1` FOREIGN KEY (`id`) REFERENCES `forum` (`id`);

--
-- Constraints for table `proizvod`
--
ALTER TABLE `proizvod`
ADD CONSTRAINT `proizvod_ibfk_1` FOREIGN KEY (`id_tip`) REFERENCES `proizvod_tip` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
