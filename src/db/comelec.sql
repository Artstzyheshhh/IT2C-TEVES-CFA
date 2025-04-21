-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2025 at 04:15 PM
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
-- Table structure for table `applications`
--

CREATE TABLE `applications` (
  `aid` int(10) NOT NULL,
  `uid` int(11) NOT NULL,
  `cid` int(10) NOT NULL,
  `pid` int(10) NOT NULL,
  `ppid` int(10) NOT NULL,
  `status` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `applications`
--

INSERT INTO `applications` (`aid`, `uid`, `cid`, `pid`, `ppid`, `status`, `date`) VALUES
(2, 15, 29, 16, 13, 'Qualified', '2025-04-21T06:26:53.065'),
(3, 15, 31, 15, 1, 'Qualified', '2025-04-21T06:32:46.124');

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
  `address` varchar(255) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `occupation` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date` varchar(50) NOT NULL,
  `user_id` int(10) NOT NULL,
  `cimage` varchar(255) NOT NULL,
  `bdate` varchar(20) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `candidates`
--

INSERT INTO `candidates` (`cid`, `fname`, `lname`, `age`, `mname`, `address`, `nationality`, `sex`, `occupation`, `contact`, `email`, `date`, `user_id`, `cimage`, `bdate`, `status`) VALUES
(1, 'Mark', 'Romo', -1881, 'ubas', 'japan', 'filipino', 'male', 'student', '099999', 'romo1235', '', 15, '', '', 'Incomplete'),
(2, 'senku', 'ishigami', 25, 'ishi', 'japan', 'filipino', 'male', 'student', '03333', 'senkuu', '', 15, '', '', 'Incomplete'),
(3, 'Anthony', 'teves', 10, 'rosalita', 'cebu', 'filipino', 'male', 'students', '09999', 'tevesdd', '', 15, '', '', 'Incomplete'),
(4, 'anthony', 'teves', 10, 'rosalita', 'city of naga,cebu', 'filipino', 'male', 'student', '0999', 'tevsssss', '', 15, '', '', 'Incomplete'),
(5, 'alcontin', 'vergara', 10, 'ian brent', 'san fernando', 'filipino', 'male', 'student', '0949494', 'aintian', '', 15, '', '', 'Incomplete'),
(6, 'kuroko', 'kuroko', 10, 'n/a', 'japan', 'filipino', 'male', 'student', '08393', 'tetsuyaaa@gmail.com', '', 15, '', '', 'Incomplete'),
(7, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sdsd', '', 15, '', '', 'Incomplete'),
(8, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sssssss', '', 15, '', '', 'Incomplete'),
(9, 'sdsaddsad', 'sdsadd', 24, 'sdsadssadsad', 'sadsadsdsad', 'dssadsa', 'male', 'dasdasd', '2222', 'sssssssddddd', '', 15, '', '', 'Incomplete'),
(10, 'fdsfdsf', 'fdsfdsf', 24, 'fsdfdf', 'fgfggf', 'jhgjghjj', 'male', 'jghjgh3', '33333', 'fgfdg', '', 15, '', '', 'Incomplete'),
(11, 'sdasdasd', 'dsadsad', 24, 'asdasdasdsadas', 'dasdsd', 'dfdf', 'male', 'fgfgf', '3333', 'fdsfdf', '', 15, '', '', 'Incomplete'),
(12, 'gdfg', 'gfgdfdfg', 18, 'gggg', 'ffff', 'fddd', 'male', 'gfgdfgfg', '2222', 'saddsad', '', 15, '', '', 'Incomplete'),
(13, 'fsdfsdf', 'fdsfsdf', 18, 'fdsfsdfsd', 'sdfdsfsd', 'fdsfdsf', 'male', 'fdfsdf', '2222', 'asdasdasd', '', 15, '', '', 'Incomplete'),
(14, 'dfffdd', 'dsdsfds', 24, 'ddssdfd', 'fdfdfd', 'dfdfdfdfd', 'male', 'dsfdsfds', '33333', 'fdf', '', 15, '', '', 'Incomplete'),
(15, 'dfffdd', 'dsdsfds', 24, 'ddssdfd', 'fdfdfd', 'dfdfdfdfd', 'male', 'dsfdsfds', '33333', 'ffff', '', 15, '', '', 'Incomplete'),
(16, 'fsdfsdf', 'dfdfsdf', 18, 'dsfdsfsd', 'dfsdfsd', 'fdsfdsf', 'male', 'dsfsdfsdf', '7777777', 'sdfds', '', 15, '', '', 'Incomplete'),
(17, 'cxvvxcvc', 'cxvvxcvc', 23, 'nnn', 'vvvvvdfdd', 'dddddff', 'male', 'ffff', '2222', 'wewqe@gmail.com', '', 15, '', '', 'Incomplete'),
(18, 'tom', 'cruz', 24, 'tom', 'Minglanilla', 'filipino', 'male', 'actor', '1111', 'tommcruz@gmail.com', '', 15, '', '', 'Incomplete'),
(19, 'gdfg', 'fgfgfdg', 24, 'jjjkjkjjkhjk', 'kjkhjkhj', 'hjjhjhh', 'male', 'hhjjjj', '1111', 'eeee', '', 15, '', '', 'Incomplete'),
(20, 'gdfg', 'fgfgfdg', 24, 'jjjkjkjjkhjk', 'kjkhjkhj', 'hjjhjhh', 'male', 'hhjjjj', '1111', 'aa', '', 15, '', '', 'Incomplete'),
(21, 'eqweqw', 'wewqe', 24, 'qweqwe', 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'wqe', '', 15, '', '', 'Incomplete'),
(22, 'eqweqw', 'wewqe', 24, 'qweqwe', 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'sss', '', 15, '', '', 'Incomplete'),
(23, 'eqweqw', 'wewqe', 24, 'qweqwe', 'qweqweqw', 'eqweqweqwqweqw', 'male', 'qeqwe', '222', 'sdsds', '', 15, '', '', 'Incomplete'),
(24, 'fgfgff', 'sadasddas', 24, 'gfgfg', 'fgfghg', 'ghghgh', 'male', 'hghgh', '2222', 'erer', '', 15, '', '', 'Incomplete'),
(25, 'fgfgff', 'sadasddas', 24, 'gfgfg', 'fgfghg', 'ghghgh', 'male', 'hghgh', '2222', 'ssss', '', 15, '', '', 'Incomplete'),
(26, 'fdsfsdf', 'fdsfsdf', 18, 'fsdfsd', 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'dfsfds@gmail.com', '', 15, '', '', 'Incomplete'),
(27, 'sdfsd', 'fdsfsdf', 18, 'fsdfsd', 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'ggfg', '', 15, '', '', 'Incomplete'),
(28, 'sdfsd', 'fdsfsdf', 18, 'fsdfsd', 'dsfsdfsf', 'fsdfsdf', 'male', 'fsdfdsf', '3333', 'sssxxxxx', '', 15, '', '', 'Incomplete'),
(29, 'sdfsdf', 'fsfdsf', 18, 'fsfsdf', 'fdsfsdf', 'fsdfsdf', 'male', 'fsfsdfss', '33333', 'rwerwer', '', 15, '', '', 'Completed'),
(30, 'sdfsdf', 'ddfs', 18, 'fsdfsdf', 'fsdfsd', 'dsfsdf', 'male', 'fsdfsdf', '1232312', 'eqweqw', '', 15, '', '', 'Incomplete'),
(31, 'sdfsdf', 'ddfs', 24, 'fsdfsdf', 'fsdfsd', 'dsfsdf', 'male', 'fsdfsdf', '1232312', 'eqweqwee', '', 15, '', '', 'Completed'),
(32, 'sdfsdf', 'dsfsdffsdf', 18, 'sdfsdf', 'sdfsd', 'sdfdsf', 'male', 'sdfsddfsf', '4444', 'gfhjhjh', '', 15, '', '', 'Incomplete'),
(33, 'anthony', 'teves', 20, 'rosalita', 'city of naga', 'filipino', 'male', 'students', '099999', 'tevesss21', '', 15, '', '', 'Incomplete'),
(34, 'anthony', 'teves', 25, 'rosalita', 'city of naga', 'filipino', 'male', 'students', '09999', 'dfdsfsdfdfffff', '', 15, '', '', 'Incomplete'),
(35, 'anthony', 'teves', 21, 'rosalita', 'naga', 'filipino', 'male', 'student', '099992', 'tesvessd', '', 15, '', '', 'Incomplete'),
(36, 'anthony', 'teves', 21, 'rosalita', 'minglanilla', 'filipino', 'male', 'student', '0999999', 'tesvs@gmail.com', '', 15, '', '2004-04-12', 'Incomplete'),
(37, 'fsdfsdsdf', 'dsfsd', 22, 'dsfsd', 'sdfsd', 'filipino', 'male', 'students', '22222', 'teves12@gmail.com', '', 15, '', '2002-12-12', 'Incomplete');

-- --------------------------------------------------------

--
-- Table structure for table `logged`
--

CREATE TABLE `logged` (
  `lid` int(10) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `userid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(18, 'Added candidate with ID No.: 33', '2025-04-12 22:16:28', 15),
(19, 'Added candidate with ID No.: 34', '2025-04-12 22:19:10', 15),
(23, 'Added candidate with ID No.: 35', '2025-04-12 23:04:41', 15),
(25, 'Created user account ID: 18', '2025-04-12 23:08:41', 15),
(28, 'Updated user with ID No.: 18', '2025-04-12 23:17:44', 15),
(37, 'Added partylist with ID no.: 1', '2025-04-13 05:02:55', 15),
(38, 'Added partylist with ID no.: 2', '2025-04-13 05:03:35', 15),
(42, 'Added partylist with ID no.: 3', '2025-04-13 05:23:02', 15),
(49, 'Added partylist with ID no.: 4', '2025-04-13 05:37:05', 15),
(51, 'Added partylist with ID no.: 5', '2025-04-13 05:38:38', 15),
(53, 'Added partylist with ID no.: 6', '2025-04-13 05:45:32', 15),
(55, 'Added partylist with ID no.: 7', '2025-04-13 05:46:57', 15),
(57, 'Added partylist with ID no.: 8', '2025-04-13 21:32:01', 15),
(97, 'Updated user with ID No.: 18', '2025-04-14 00:00:17', 15),
(99, 'Updated user with ID No.: 18', '2025-04-14 00:30:12', 15),
(100, 'Updated user with ID No.: 18', '2025-04-14 00:31:06', 15),
(115, 'Updated user with ID No.: 4', '2025-04-14 04:17:38', 15),
(116, 'Updated user with ID No.: 19', '2025-04-17 20:14:35', 15),
(117, 'Created user account ID: 20', '2025-04-17 20:52:59', 15),
(118, 'Added candidate with ID No.: 36', '2025-04-18 00:05:36', 15),
(119, 'Created user account ID: 21', '2025-04-18 00:18:33', 15),
(120, 'Added partylist with ID no.: 10', '2025-04-18 04:43:32', 15),
(121, 'Added partylist with ID no.: 11', '2025-04-18 04:51:18', 15),
(122, 'Created user account ID: 22', '2025-04-18 04:52:55', 15),
(123, 'Created user account ID: 23', '2025-04-18 05:02:12', 15),
(124, 'Added partylist with ID no.: 12', '2025-04-18 20:44:44', 15),
(125, 'Added partylist with ID no.: 13', '2025-04-18 21:23:42', 15),
(126, 'Added candidate with ID No.: 37', '2025-04-18 21:35:08', 15),
(127, 'Updated candidate with ID No.: 17', '2025-04-18 21:50:31', 15),
(128, 'Updated candidate with ID No.: 6', '2025-04-18 21:52:14', 15),
(129, 'Added partylist with ID no.: 16', '2025-04-21 06:26:18', 15),
(130, 'Added COC application with ID No.: 2', '2025-04-21 06:26:53', 15),
(131, 'Added COC application with ID No.: 3', '2025-04-21 06:32:46', 15);

-- --------------------------------------------------------

--
-- Table structure for table `partylist`
--

CREATE TABLE `partylist` (
  `pid` int(10) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `shortname` varchar(50) NOT NULL,
  `contact` int(15) NOT NULL,
  `platform` varchar(500) NOT NULL,
  `logo` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `uid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `partylist`
--

INSERT INTO `partylist` (`pid`, `pname`, `shortname`, `contact`, `platform`, `logo`, `date`, `uid`) VALUES
(15, 'Independent', '', 0, '', '', '', 14),
(16, 'dsdf', 'sdfsd', 22222, 'dsfsdfsdf', '', '2025-04-21T06:26:18.690', 15);

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
(14, 'SK councilor', 3),
(16, 'Representative', 3);

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
  `stats` varchar(50) NOT NULL,
  `Uimage` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `fname`, `lname`, `ussername`, `useremail`, `sex`, `utype`, `birthdate`, `password`, `stats`, `Uimage`) VALUES
(4, 'teves', 'teves', 'ishigami', 'teves1222@gmailcom', 'male', 'Admin', '2004-12-04', '12345678', 'Pending', 'src/images/Screenshot (13).png'),
(5, 'ishigamiqwq', 'senku', 'ishenku', 'senkiii@gmail.com', 'male', 'User', '0000-00-00', '12344wqwq', 'Active', ''),
(9, 'Roronoa', 'Zorro', 'zorrochi', 'zorrororor', 'male', 'Admin', '0000-00-00', 'onepiece', 'active', ''),
(10, 'yuji', 'itadori', 'yujiii', 'itadori@gmail.com', 'male', 'User', '0000-00-00', 'hollowpurple', 'Pending', ''),
(11, 'test', 'try', 'try', 'try', 'male', 'User', '2004-12-04', '1111111111', 'pending', ''),
(12, 'testtttt', 'testtt', 'tesstttt', 'tesstttts', 'male', 'User', '1987-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ''),
(13, 'uzumaki', 'naruto', 'uzumaki', 'hokagi', 'male', 'User', '1989-03-23', 'Vkh+6vmFm1qfN7vw1rV3YNqLhLh3kafHVVCJPtgW1Ak=', 'Active', ''),
(14, 'anthony', 'teves', 'tevsss', 'tesvvvss', 'male', 'Admin', '2012-02-03', 'Tex6uJFFl9hHsI/4S6CB5avUxwSTilpuddqTOf3uQrQ=', 'Active', ''),
(15, 'anthony', 'teves', 'artstzy', 'qwertyuio', 'male', 'Admin', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ''),
(16, 'john', 'cena', 'can\'t see me', 'johncenaaa', 'male', 'Admin', '1990-04-04', 'Qjr41+jWryB0jiy2qeiMy0qwkJLOJ09Sae5BOl474G0=', 'pending', ''),
(17, 'john', 'cena', 'cant see me', 'cena', 'male', 'Admin', '1990-04-04', 'Qjr41+jWryB0jiy2qeiMy0qwkJLOJ09Sae5BOl474G0=', 'pending', ''),
(18, 'teves', 'anthony', 'tevs2004', 'teves12@gmail.com', 'male', 'Admin', '2004-03-23', '1ZlrJeWAyVuQz8immJizHujttmvqADrJmAG4yrNMK7Q=', 'Active', 'src/images/Screenshot (11).png'),
(19, 'sdf', 'sfas', 'fsdfas', 'sdfasdfdsd', 'male', 'Admin', '2004-12-12', 'VgEeP2M5b2EuNU05InvdH7h7uqWKauKTytHX8Fwl5hc=', 'Active', 'src/images/Screenshot (18).png'),
(20, 'dfdsfsd', 'dfsdfsdf', 'fdsfsd', 'fsdfsdfdsfd', 'male', 'Admin', 'dfsdfds', 'Q2StMsg5Kf6JvxafGyeYTlbNB2q3iX3nyW8GlaeNoZE=', 'pending', ''),
(21, 'dsfsd', 'sdfdsf', 'sfdsdsdf', 'fsdfsdfdsfsdfsdf', 'male', 'Admin', '2004-12-12', 'MeJyLiDKAi3n1Y2UQPs9frjwRVkxwg9tbn0wOW6uHr0=', 'pending', ''),
(22, 'sfsd', 'sdfsdf', 'fsfdsf', 'dsfsdfdssdf', 'male', 'Admin', '2004-12-12', 'Z7VdVd3fu+tdjhrk2scd6jez5n4WOeVrgEbC+mVD4cY=', 'pending', ''),
(23, 'sdfsdffsdf', 'fsdfsdf', 'dsfdsfsd', 'weweqwqw', 'male', 'Admin', '2004-12-12', 'mpyqK1kB6F5rIhxg8c4a11mWH+eoFZ41ny6tbiOkNJU=', 'pending', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applications`
--
ALTER TABLE `applications`
  ADD PRIMARY KEY (`aid`),
  ADD KEY `cid` (`cid`),
  ADD KEY `pid` (`pid`),
  ADD KEY `ppid` (`ppid`),
  ADD KEY `uid` (`uid`);

--
-- Indexes for table `candidates`
--
ALTER TABLE `candidates`
  ADD PRIMARY KEY (`cid`),
  ADD KEY `uid` (`user_id`);

--
-- Indexes for table `logged`
--
ALTER TABLE `logged`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `user_id` (`userid`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `partylist`
--
ALTER TABLE `partylist`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `uid_fk` (`uid`);

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
-- AUTO_INCREMENT for table `applications`
--
ALTER TABLE `applications`
  MODIFY `aid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `candidates`
--
ALTER TABLE `candidates`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `logged`
--
ALTER TABLE `logged`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=132;

--
-- AUTO_INCREMENT for table `partylist`
--
ALTER TABLE `partylist`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `positions`
--
ALTER TABLE `positions`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `rid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `applications`
--
ALTER TABLE `applications`
  ADD CONSTRAINT `applications_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`),
  ADD CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `candidates` (`cid`),
  ADD CONSTRAINT `pid` FOREIGN KEY (`pid`) REFERENCES `partylist` (`pid`),
  ADD CONSTRAINT `ppid` FOREIGN KEY (`ppid`) REFERENCES `positions` (`pid`);

--
-- Constraints for table `candidates`
--
ALTER TABLE `candidates`
  ADD CONSTRAINT `candidates_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`uid`);

--
-- Constraints for table `logged`
--
ALTER TABLE `logged`
  ADD CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`uid`);

--
-- Constraints for table `partylist`
--
ALTER TABLE `partylist`
  ADD CONSTRAINT `partylist_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`);

--
-- Constraints for table `recovery`
--
ALTER TABLE `recovery`
  ADD CONSTRAINT `uid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
