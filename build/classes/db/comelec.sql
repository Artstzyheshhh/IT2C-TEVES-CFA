-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2025 at 02:15 PM
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
  `age` int(10) NOT NULL,
  `mname` varchar(50) NOT NULL,
  `year` varchar(10) NOT NULL,
  `month` varchar(50) NOT NULL,
  `day` int(10) NOT NULL,
  `address` varchar(255) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `occupation` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `user_id` int(10) NOT NULL,
  `position` varchar(150) NOT NULL,
  `term` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `candidates`
--

INSERT INTO `candidates` (`cid`, `fname`, `lname`, `age`, `mname`, `year`, `month`, `day`, `address`, `nationality`, `sex`, `occupation`, `contact`, `email`, `date`, `user_id`, `position`, `term`) VALUES
(1, 'Mark', 'Romo', -1881, 'ubas', '2006', 'January', 21, 'japan', 'filipino', 'male', 'student', '099999', 'romo1235', '2025-04-06T23:44:05.217', 15, 'President', 0),
(2, 'senku', 'ishigami', 25, 'ishi', '2000', 'January', 12, 'japan', 'filipino', 'male', 'student', '03333', 'senkuu', '2025-04-06T23:51:50.977', 15, 'President', 0),
(3, 'Anthony', 'teves', 10, 'rosalita', '2015', 'January', 23, 'cebu', 'filipino', 'male', 'students', '09999', 'tevesdd', '2025-04-07T00:30:01.663', 15, 'President', 6),
(4, 'anthony', 'teves', 10, 'rosalita', '2015', 'January', 12, 'city of naga,cebu', 'filipino', 'male', 'student', '0999', 'tevsssss', '2025-04-07T00:34:23.233', 15, 'President', 6),
(5, 'alcontin', 'vergara', 10, 'ian brent', '2015', 'January', 23, 'san fernando', 'filipino', 'male', 'student', '0949494', 'aintian', '2025-04-07T00:38:02.698', 15, 'President', 6),
(6, 'tetsuya', 'kuroko', 10, 'n/a', '2015', 'January', 23, 'japan', 'filipino', 'male', 'student', '08393', 'tetsuyaaa', '2025-04-07T00:39:52.298', 15, 'President', 6),
(7, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', '2001', 'January', 22, 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sdsd', '2025-04-07T01:40:54.619', 15, 'President', 6),
(8, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', '2001', 'January', 22, 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sssssss', '2025-04-07T01:41:18.299', 15, 'Senator', 6),
(9, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', '2001', 'January', 22, 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sssssssddddd', '2025-04-07T01:41:32.568', 15, 'SK councilor', 3),
(10, 'fdsfdsf', 'fdsfdsf', 24, 'fsdfdf', '2001', 'January', 22, 'fgfggf', 'jhgjghjj', 'male', 'jghjgh3', '33333', 'fgfdg', '2025-04-07T01:45:08.759', 15, 'SK chairman', 3),
(11, 'sdasdasd', 'dsadsad', 24, 'asdasdasdsadas', '2001', 'January', 22, 'dasdsd', 'dfdf', 'male', 'fgfgf', '3333', 'fdsfdf', '2025-04-07T01:49:04.579', 15, 'SK chairman', 3),
(12, 'gdfg', 'gfgdfdfg', 18, 'gggg', '2007', 'January', 22, 'ffff', 'fddd', 'male', 'gfgdfgfg', '2222', 'saddsad', '2025-04-07T01:51:13.832', 15, 'SK chairman', 3),
(13, 'fsdfsdf', 'fdsfsdf', 18, 'fdsfsdfsd', '2007', 'January', 22, 'sdfdsfsd', 'fdsfdsf', 'male', 'fdfsdf', '2222', 'asdasdasd', '2025-04-07T01:55:21.079', 15, 'SK councilor', 3),
(14, 'dfffdd', 'dsdsfds', 24, 'ddssdfd', '2001', 'January', 22, 'fdfdfd', 'dfdfdfdfd', 'male', 'dsfdsfds', '33333', 'fdf', '2025-04-07T01:57:08.999', 15, 'President', 6),
(15, 'dfffdd', 'dsdsfds', 24, 'ddssdfd', '2001', 'January', 22, 'fdfdfd', 'dfdfdfdfd', 'male', 'dsfdsfds', '33333', 'ffff', '2025-04-07T01:57:35.279', 15, 'SK councilor', 3),
(16, 'fsdfsdf', 'dfdfsdf', 18, 'dsfdsfsd', '2007', 'January', 22, 'dfsdfsd', 'fdsfdsf', 'male', 'dsfsdfsdf', '7777777', 'sdfds', '2025-04-07T02:01:23.624', 15, 'President', 6),
(17, 'cxvcxvbn', 'cxvvxcvc', 23, 'nnn', '2002', 'January', 11, 'vvvvvdfdd', 'dddddff', 'male', 'ffff', '2222', 'wewqe', '2025-04-07T02:03:07.714', 15, 'President', 6),
(18, 'gdfg', 'fgfgfdg', 24, 'jjjkjkjjkhjk', '2001', 'January', 12, 'kjkhjkhj', 'hjjhjhh', 'male', 'hhjjjj', '1111', 'fsdfsdf', '2025-04-07T02:05:04.729', 15, 'President', 6),
(19, 'gdfg', 'fgfgfdg', 24, 'jjjkjkjjkhjk', '2001', 'January', 12, 'kjkhjkhj', 'hjjhjhh', 'male', 'hhjjjj', '1111', 'eeee', '2025-04-07T02:05:18.924', 15, 'SK chairman', 3),
(20, 'gdfg', 'fgfgfdg', 24, 'jjjkjkjjkhjk', '2001', 'January', 12, 'kjkhjkhj', 'hjjhjhh', 'male', 'hhjjjj', '1111', 'aa', '2025-04-07T02:06:52.379', 15, 'SK chairman', 3),
(21, 'eqweqw', 'wewqe', 24, 'qweqwe', '2001', 'January', 11, 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'wqe', '2025-04-07T02:14:17.169', 15, 'President', 6),
(22, 'eqweqw', 'wewqe', 24, 'qweqwe', '2001', 'January', 11, 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'sss', '2025-04-07T02:14:29.299', 15, 'Senator', 6),
(23, 'eqweqw', 'wewqe', 24, 'qweqwe', '2001', 'January', 11, 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'sdsds', '2025-04-07T02:14:49.739', 15, 'SK chairman', 3),
(24, 'fgfgff', 'sadasddas', 24, 'gfgfg', '2001', 'January', 11, 'fgfghg', 'ghghgh', 'male', 'hghgh', '2222', 'erer', '2025-04-07T02:17:56.719', 15, 'Mayor', 3),
(25, 'fgfgff', 'sadasddas', 24, 'gfgfg', '2001', 'January', 11, 'fgfghg', 'ghghgh', 'male', 'hghgh', '2222', 'ssss', '2025-04-07T02:18:10.560', 15, 'SK chairman', 3),
(26, 'sdfsd', 'fdsfsdf', 18, 'fsdfsd', '2007', 'January', 22, 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'dfsfds', '2025-04-07T02:23:14.830', 15, 'President', 6),
(27, 'sdfsd', 'fdsfsdf', 18, 'fsdfsd', '2007', 'January', 22, 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'ggfg', '2025-04-07T02:24:35.694', 15, 'President', 6),
(28, 'sdfsd', 'fdsfsdf', 18, 'fsdfsd', '2007', 'January', 22, 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'sssxxxxx', '2025-04-07T02:24:50.885', 15, 'SK councilor', 3),
(29, 'sdfsdf', 'fsfdsf', 18, 'fsfsdf', '2007', 'January', 11, 'fdsfsdf', 'fsdfsdf', 'male', 'fsfsdfss', '33333', 'rwerwer', '2025-04-07T02:26:19.290', 15, 'President', 6),
(30, 'sdfsdf', 'ddfs', 18, 'fsdfsdf', '2007', 'January', 3, 'fsdfsd', 'dsfsdf', 'male', 'fsdfsdf', '1232312', 'eqweqw', '2025-04-07T02:40:47.118', 15, 'SK councilor', 3),
(31, 'sdfsdf', 'ddfs', 24, 'fsdfsdf', '2001', 'January', 3, 'fsdfsd', 'dsfsdf', 'male', 'fsdfsdf', '1232312', 'eqweqwee', '2025-04-07T02:41:05.203', 15, 'Mayor', 3),
(32, 'sdfsdf', 'dsfsdffsdf', 18, 'sdfsdf', '2007', 'January', 31, 'sdfsd', 'sdfdsf', 'male', 'sdfsddfsf', '4444', 'gfhjhjh', '2025-04-07T02:45:10.818', 15, 'SK chairman', 3);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `lid` int(10) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`lid`, `action`, `date`, `user_id`) VALUES
(1, 'Created user account ID: -1', '2025-04-07 03:43:32', 15),
(2, 'Created user account ID: -1', '2025-04-07 03:48:35', 15),
(3, 'Created user account ID: -1', '2025-04-07 03:56:48', 15),
(4, 'Created user account ID: 16', '2025-04-07 04:02:47', 15),
(5, 'Created user account ID: 17', '2025-04-07 04:03:36', 15),
(6, 'User with ID 0logged in', '2025-04-07 05:08:17', 15),
(7, 'User with ID 15 logged in', '2025-04-07 05:09:37', 15);

-- --------------------------------------------------------

--
-- Table structure for table `positions`
--

CREATE TABLE `positions` (
  `pid` int(10) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `term` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `positions`
--

INSERT INTO `positions` (`pid`, `pname`, `term`) VALUES
(1, 'President', 6),
(2, 'Vice-president', 6),
(3, 'Senator', 6),
(4, 'Congressman', 3),
(5, 'Governor', 3),
(6, 'Vice-governor', 3),
(7, 'Provincial board member', 3),
(8, 'Mayor ', 3),
(9, 'Vice-mayor', 3),
(10, 'City councilor', 3),
(11, 'Barangay Captain', 3),
(12, 'Barangay councilor', 3),
(13, 'SK chairman', 3),
(14, 'SK councilor', 3);

-- --------------------------------------------------------

--
-- Table structure for table `recovery`
--

CREATE TABLE `recovery` (
  `rid` int(10) NOT NULL,
  `userid` int(10) NOT NULL,
  `answer1` varchar(255) NOT NULL,
  `answer2` varchar(255) NOT NULL,
  `answer3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `recovery`
--

INSERT INTO `recovery` (`rid`, `userid`, `answer1`, `answer2`, `answer3`) VALUES
(1, 15, 'jokjook', 'black', 'chimken'),
(2, 14, 'romo', 'blue', 'dashi'),
(3, 12, 'doraemon', 'green', 'fish');

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
(12, 'testtttt', 'testtt', 'tesstttt', 'tesstttts', 'male', 'User', '1987-12-12', 'k36NX7tIvUlJU2zWW401xCa4DS+DDFwwjizexCKuIkQ=', 'Active'),
(13, 'uzumaki', 'naruto', 'uzumaki', 'hokagi', 'male', 'User', '1989-03-23', 'Vkh+6vmFm1qfN7vw1rV3YNqLhLh3kafHVVCJPtgW1Ak=', 'Active'),
(14, 'anthony', 'teves', 'tevsss', 'tesvvvss', 'male', 'Admin', '2012-02-03', 'Tex6uJFFl9hHsI/4S6CB5avUxwSTilpuddqTOf3uQrQ=', 'Active'),
(15, 'anthony', 'teves', 'artstzy', 'qwertyuio', 'male', 'Admin', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active'),
(16, 'john', 'cena', 'can\'t see me', 'johncenaaa', 'male', 'Admin', '1990-04-04', 'Qjr41+jWryB0jiy2qeiMy0qwkJLOJ09Sae5BOl474G0=', 'pending'),
(17, 'john', 'cena', 'cant see me', 'cena', 'male', 'Admin', '1990-04-04', 'Qjr41+jWryB0jiy2qeiMy0qwkJLOJ09Sae5BOl474G0=', 'pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidates`
--
ALTER TABLE `candidates`
  ADD PRIMARY KEY (`cid`),
  ADD KEY `uid` (`user_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `positions`
--
ALTER TABLE `positions`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `recovery`
--
ALTER TABLE `recovery`
  ADD PRIMARY KEY (`rid`),
  ADD KEY `userid` (`userid`);

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
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `positions`
--
ALTER TABLE `positions`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `rid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `candidates`
--
ALTER TABLE `candidates`
  ADD CONSTRAINT `uid` FOREIGN KEY (`user_id`) REFERENCES `users` (`uid`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`uid`);

--
-- Constraints for table `recovery`
--
ALTER TABLE `recovery`
  ADD CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
