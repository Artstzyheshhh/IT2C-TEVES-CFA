-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 21, 2025 at 08:07 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `comelec`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidates`
--

CREATE TABLE `candidates` (
  `cid` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `age` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `ussername` varchar(255) NOT NULL,
  `useremail` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `utype` varchar(50) NOT NULL,
  `birthdate` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `stats` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `fname`, `lname`, `ussername`, `useremail`, `sex`, `utype`, `birthdate`, `password`, `stats`) VALUES
(4, 'teves', 'teves', 'ishigami', 'teves1222@gmailcom', 'male', 'Admin', '2004-12-04', '12345678', 'Active'),
(5, 'ishigamiqwq', 'senku', 'ishenku', 'senkiii@gmail.com', 'male', 'User', '0000-00-00', '12344wqwq', 'Active'),
(9, 'Roronoa', 'Zorro', 'zorrochi', 'zorrororor', 'male', 'Admin', '0000-00-00', 'onepiece', 'active'),
(10, 'yuji', 'itadori', 'yujiii', 'itadori@gmail.com', 'male', 'User', '0000-00-00', 'hollowpurple', 'Pending'),
(11, 'test', 'try', 'try', 'try', 'male', 'User', '2004-12-04', '1111111111', 'pending'),
(12, 'testtt', 'testtt', 'tesstttt', 'tesstttts', 'male', 'User', '1987-12-12', 'testtest', 'pending'),
(13, 'uzumaki', 'naruto', 'uzumaki', 'hokagi', 'male', 'User', '1989-03-23', 'hokagi123', 'pending'),
(14, 'anthony', 'teves', 'tevsss', 'tesvvvss', 'male', 'Admin', '2012-02-03', '12345678', 'Active'),
(15, 'anthony', 'teves', 'artstzy', 'qwertyuio', 'male', 'Admin', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidates`
--
ALTER TABLE `candidates`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidates`
--
ALTER TABLE `candidates`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
