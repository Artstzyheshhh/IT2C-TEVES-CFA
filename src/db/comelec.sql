-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2025 at 03:34 PM
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
(4, 15, 39, 15, 1, 'Qualified', '2025-04-24T05:45:36.379'),
(5, 15, 36, 15, 1, 'Qualified', '2025-04-24T05:52:25.359');

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
(2, 'senku', 'ishigami', 25, 'ishi', 'japan', 'filipino', 'male', 'student', '03333', 'senkuu', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(3, 'Anthony', 'teves', 10, 'rosalita', 'cebu', 'filipino', 'male', 'students', '09999', 'tevesdd', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(4, 'anthony', 'teves', 10, 'rosalita', 'city of naga,cebu', 'filipino', 'male', 'student', '0999', 'tevsssss', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(5, 'alcontin', 'vergara', 10, 'ian brent', 'san fernando', 'filipino', 'male', 'student', '0949494', 'aintian', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(6, 'kuroko', 'kuroko', 10, 'n/a', 'japan', 'filipino', 'male', 'student', '08393', 'tetsuyaaa@gmail.com', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(29, 'Luffy', 'monkey', 18, 'D', 'westblue', 'filipino', 'male', 'pirate', '33333', 'monkeyd@gmail.com', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Completed'),
(34, 'anthony', 'teves', 25, 'rosalita', 'city of naga', 'filipino', 'male', 'students', '09999', 'dfdsfsdfdfffff', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(35, 'anthony', 'teves', 21, 'rosalita', 'naga', 'filipino', 'male', 'student', '099992', 'tesvessd', '2025-04-24T03:06:54.641', 15, '', '1988-12-12', 'Incomplete'),
(36, 'ferdinand', 'marcos', 40, 'Romualdez', 'ilocos norte', 'filipino', 'male', 'politician', '3232', 'bongbong@gmail.com', '2025-04-24T03:06:54.641', 15, '', '1984-04-12', 'Completed'),
(37, 'Rodrigo', 'Duterte', 22, 'Roa', 'Davao city, mindanao', 'filipino', 'male', 'lawyer', '22222', 'duterteroa12@gmail.com', '2025-04-24T03:06:54.641', 15, '', '2002-12-12', 'Incomplete'),
(38, 'Maria Corazon', 'Aquino', 25, 'Sumulong', 'Quezon, Philippines', 'filipino', 'female', 'lawyer', '09999', 'aquino@gmail.com', '2025-04-24T03:06:54.641', 15, '', '1999-12-12', 'Incomplete'),
(39, 'Aguinaldo', 'Aguinaldo', 36, 'y famy', 'kawit', 'filipino', 'male', 'soldier', '000333', 'emilio@gmail.com', '2025-04-24T05:06:50.618', 15, 'src/images/EMILIO-AGUINALDO.jpg', '1988-12-12', 'Completed');

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

--
-- Dumping data for table `logged`
--

INSERT INTO `logged` (`lid`, `action`, `date`, `userid`) VALUES
(1, 'User with ID 15 logged in', '2025-04-23 07:24:25', 15),
(2, 'User with ID 15 logged in', '2025-04-23 07:32:16', 15),
(3, 'User with ID 15 logged out', '2025-04-23 07:33:01', 15),
(4, 'User with ID 15 logged in', '2025-04-23 07:50:40', 15),
(5, 'User with ID 5 logged in', '2025-04-23 07:56:43', 5),
(6, 'User with ID 5 logged out', '2025-04-23 07:58:17', 5),
(7, 'User with ID 5 logged in', '2025-04-23 08:07:39', 5),
(8, 'User with ID 5 logged out', '2025-04-23 08:08:56', 5),
(9, 'User with ID 15 logged in', '2025-04-23 08:09:11', 15),
(10, 'User with ID 15 logged out', '2025-04-23 08:10:51', 15),
(11, 'User with ID 15 logged in', '2025-04-23 08:12:29', 15),
(12, 'User with ID 15 logged out', '2025-04-23 08:13:15', 15),
(13, 'User with ID 15 logged in', '2025-04-23 08:17:35', 15),
(14, 'User with ID 15 logged in', '2025-04-23 08:18:57', 15),
(15, 'User with ID 15 logged out', '2025-04-23 08:19:57', 15),
(16, 'User with ID 15 logged in', '2025-04-23 08:21:02', 15),
(17, 'User with ID 15 logged out', '2025-04-23 08:22:19', 15),
(18, 'User with ID 15 logged out', '2025-04-23 08:22:21', 15),
(19, 'User with ID 15 logged in', '2025-04-23 08:23:31', 15),
(20, 'User with ID 15 logged out', '2025-04-23 08:23:51', 15),
(21, 'User with ID 15 logged in', '2025-04-23 08:40:24', 15),
(22, 'User with ID 15 logged out', '2025-04-23 08:42:33', 15),
(23, 'User with ID 15 logged in', '2025-04-23 09:00:18', 15),
(24, 'User with ID 15 logged out', '2025-04-23 09:01:17', 15),
(25, 'User with ID 15 logged in', '2025-04-23 09:03:39', 15),
(26, 'User with ID 15 logged out', '2025-04-23 09:03:51', 15),
(27, 'User with ID 15 logged in', '2025-04-23 09:17:51', 15),
(28, 'User with ID 15 logged out', '2025-04-23 09:18:05', 15),
(29, 'User with ID 15 logged in', '2025-04-23 09:20:12', 15),
(30, 'User with ID 15 logged out', '2025-04-23 09:20:59', 15),
(31, 'User with ID 15 logged in', '2025-04-23 09:25:20', 15),
(32, 'User with ID 15 logged out', '2025-04-23 09:26:26', 15),
(33, 'User with ID 5 logged in', '2025-04-24 02:43:52', 5),
(34, 'User with ID 5 logged out', '2025-04-24 02:44:41', 5),
(35, 'User with ID 15 logged in', '2025-04-24 02:46:44', 15),
(36, 'User with ID 15 logged out', '2025-04-24 02:47:51', 15),
(37, 'User with ID 5 logged in', '2025-04-24 02:48:37', 5),
(38, 'User with ID 5 logged out', '2025-04-24 02:49:03', 5),
(39, 'User with ID 15 logged in', '2025-04-24 02:49:30', 15),
(40, 'User with ID 15 logged out', '2025-04-24 02:58:49', 15),
(41, 'User with ID 5 logged in', '2025-04-24 03:00:05', 5),
(42, 'User with ID 5 logged out', '2025-04-24 03:02:39', 5),
(43, 'User with ID 5 logged in', '2025-04-24 03:03:00', 5),
(44, 'User with ID 5 logged out', '2025-04-24 03:05:16', 5),
(45, 'User with ID 15 logged in', '2025-04-24 03:05:26', 15),
(46, 'User with ID 15 logged out', '2025-04-24 03:07:26', 15),
(47, 'User with ID 5 logged in', '2025-04-24 03:08:08', 5),
(48, 'User with ID 5 logged out', '2025-04-24 03:13:00', 5),
(49, 'User with ID 5 logged in', '2025-04-24 03:16:43', 5),
(50, 'User with ID 5 logged out', '2025-04-24 03:17:27', 5),
(51, 'User with ID 5 logged in', '2025-04-24 03:18:32', 5),
(52, 'User with ID 5 logged out', '2025-04-24 03:19:06', 5),
(53, 'User with ID 15 logged in', '2025-04-24 03:19:52', 15),
(54, 'User with ID 15 logged out', '2025-04-24 03:20:10', 15),
(55, 'User with ID 15 logged in', '2025-04-24 03:21:17', 15),
(56, 'User with ID 15 logged out', '2025-04-24 03:21:42', 15),
(57, 'User with ID 5 logged in', '2025-04-24 03:23:11', 5),
(58, 'User with ID 5 logged out', '2025-04-24 03:24:18', 5),
(59, 'User with ID 5 logged in', '2025-04-24 03:25:09', 5),
(60, 'User with ID 5 logged out', '2025-04-24 03:26:02', 5),
(61, 'User with ID 5 logged in', '2025-04-24 03:26:53', 5),
(62, 'User with ID 5 logged out', '2025-04-24 03:28:44', 5),
(63, 'User with ID 5 logged in', '2025-04-24 03:31:33', 5),
(64, 'User with ID 5 logged out', '2025-04-24 03:35:02', 5),
(65, 'User with ID 15 logged in', '2025-04-24 03:35:53', 15),
(66, 'User with ID 15 logged out', '2025-04-24 03:40:50', 15),
(67, 'User with ID 15 logged in', '2025-04-24 03:40:59', 15),
(68, 'User with ID 15 logged out', '2025-04-24 03:42:40', 15),
(69, 'User with ID 15 logged in', '2025-04-24 04:03:25', 15),
(70, 'User with ID 15 logged out', '2025-04-24 04:04:13', 15),
(71, 'User with ID 15 logged in', '2025-04-24 04:04:42', 15),
(72, 'User with ID 15 logged out', '2025-04-24 04:04:52', 15),
(73, 'User with ID 15 logged in', '2025-04-24 04:12:14', 15),
(74, 'User with ID 15 logged out', '2025-04-24 04:15:20', 15),
(75, 'User with ID 15 logged in', '2025-04-24 04:37:41', 15),
(76, 'User with ID 15 logged out', '2025-04-24 04:38:35', 15),
(77, 'User with ID 15 logged in', '2025-04-24 04:39:07', 15),
(78, 'User with ID 15 logged out', '2025-04-24 04:39:38', 15),
(79, 'User with ID 15 logged in', '2025-04-24 04:40:00', 15),
(80, 'User with ID 15 logged out', '2025-04-24 04:40:08', 15),
(81, 'User with ID 15 logged in', '2025-04-24 04:40:53', 15),
(82, 'User with ID 15 logged out', '2025-04-24 04:41:03', 15),
(83, 'User with ID 15 logged in', '2025-04-24 04:41:25', 15),
(84, 'User with ID 15 logged out', '2025-04-24 04:41:45', 15),
(85, 'User with ID 15 logged in', '2025-04-24 04:42:16', 15),
(86, 'User with ID 15 logged out', '2025-04-24 04:42:34', 15),
(87, 'User with ID 15 logged in', '2025-04-24 04:43:02', 15),
(88, 'User with ID 15 logged out', '2025-04-24 04:44:56', 15),
(89, 'User with ID 15 logged in', '2025-04-24 04:46:54', 15),
(90, 'User with ID 15 logged out', '2025-04-24 04:47:07', 15),
(91, 'User with ID 15 logged in', '2025-04-24 04:47:32', 15),
(92, 'User with ID 15 logged out', '2025-04-24 04:50:27', 15),
(93, 'User with ID 15 logged in', '2025-04-24 04:54:32', 15),
(94, 'User with ID 15 logged out', '2025-04-24 04:54:56', 15),
(95, 'User with ID 15 logged in', '2025-04-24 04:55:29', 15),
(96, 'User with ID 15 logged out', '2025-04-24 04:55:52', 15),
(97, 'User with ID 15 logged in', '2025-04-24 04:57:21', 15),
(98, 'User with ID 15 logged out', '2025-04-24 04:57:55', 15),
(99, 'User with ID 15 logged in', '2025-04-24 05:01:23', 15),
(100, 'User with ID 15 logged out', '2025-04-24 05:42:27', 15),
(101, 'User with ID 15 logged in', '2025-04-24 05:45:17', 15),
(102, 'User with ID 15 logged out', '2025-04-24 05:47:03', 15),
(103, 'User with ID 15 logged in', '2025-04-24 05:47:15', 15),
(104, 'User with ID 15 logged out', '2025-04-24 05:54:12', 15),
(105, 'User with ID 15 logged in', '2025-04-24 05:55:46', 15),
(106, 'User with ID 15 logged out', '2025-04-24 05:56:18', 15),
(107, 'User with ID 15 logged in', '2025-04-24 05:58:18', 15),
(108, 'User with ID 15 logged out', '2025-04-24 05:58:30', 15),
(109, 'User with ID 15 logged in', '2025-04-24 05:59:14', 15),
(110, 'User with ID 15 logged out', '2025-04-24 05:59:40', 15),
(111, 'User with ID 15 logged in', '2025-04-24 06:00:22', 15),
(112, 'User with ID 15 logged out', '2025-04-24 06:03:03', 15),
(113, 'User with ID 5 logged in', '2025-04-24 06:03:42', 5),
(114, 'User with ID 5 logged out', '2025-04-24 06:05:26', 5),
(115, 'User with ID 15 logged in', '2025-04-24 06:24:13', 15),
(116, 'User with ID 15 logged out', '2025-04-24 06:24:17', 15),
(117, 'User with ID 5 logged in', '2025-04-24 06:24:29', 5),
(118, 'User with ID 5 logged out', '2025-04-24 06:25:49', 5),
(119, 'User with ID 5 logged in', '2025-04-24 06:27:49', 5),
(120, 'User with ID 5 logged out', '2025-04-24 06:28:15', 5);

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
(131, 'Added COC application with ID No.: 3', '2025-04-21 06:32:46', 15),
(132, 'Deleted candidate with ID No.: 1', '2025-04-22 06:48:18', 15),
(133, 'Deleted candidate with ID No.: 22', '2025-04-22 06:52:08', 15),
(134, 'Deleted users with ID No.: 15', '2025-04-22 07:17:42', 15),
(135, 'Deleted users with ID No.: 12', '2025-04-22 07:18:47', 15),
(136, 'Deleted users with ID No.: 23', '2025-04-22 07:19:21', 15),
(137, 'Deleted users with ID No.: 22', '2025-04-22 07:41:03', 15),
(138, 'Added partylist with ID no.: 17', '2025-04-22 20:00:32', 15),
(139, 'Added partylist with ID no.: 18', '2025-04-22 20:00:42', 15),
(140, 'Deleted partylist with ID No.: 18', '2025-04-22 20:00:52', 15),
(141, 'Added partylist with ID no.: 19', '2025-04-22 20:01:36', 15),
(142, 'Added partylist with ID no.: 20', '2025-04-22 20:01:43', 15),
(143, 'Added partylist with ID no.: 21', '2025-04-22 20:01:52', 15),
(144, 'Deleted partylist with ID No.: 21', '2025-04-22 20:02:02', 15),
(145, 'Added partylist with ID no.: 22', '2025-04-22 20:03:09', 15),
(146, 'Deleted partylist with ID No.: 22', '2025-04-22 20:03:18', 15),
(147, 'Deleted partylist with ID No.: 20', '2025-04-22 20:03:32', 15),
(148, 'Updated user with ID No.: 5', '2025-04-23 07:51:18', 15),
(149, 'Updated user with ID No.: 15', '2025-04-23 08:10:10', 15),
(150, 'Updated user with ID No.: 15', '2025-04-23 08:18:29', 15),
(151, 'Updated user with ID No.: 15', '2025-04-23 08:19:45', 15),
(152, 'Updated user with ID No.: 15', '2025-04-23 08:21:38', 15),
(153, 'Deleted application with ID No.: 3', '2025-04-23 09:20:57', 15),
(154, 'Added partylist with ID no.: 23', '2025-04-23 09:25:33', 15),
(155, 'Deleted partylist with ID No.: 23', '2025-04-23 09:26:23', 15),
(156, 'Deleted candidate with ID No.: 32', '2025-04-24 02:48:57', 5),
(157, 'Updated candidate with ID No.: 37', '2025-04-24 02:50:54', 15),
(158, 'Updated candidate with ID No.: ', '2025-04-24 02:53:39', 15),
(159, 'Updated candidate with ID No.: 36', '2025-04-24 02:55:11', 15),
(160, 'Deleted candidate with ID No.: 7', '2025-04-24 02:56:21', 15),
(161, 'Added candidate with ID No.: 38', '2025-04-24 03:06:54', 15),
(162, 'Added partylist with ID no.: 24', '2025-04-24 03:12:35', 5),
(163, 'Deleted partylist with ID No.: 17', '2025-04-24 03:21:39', 15),
(164, 'Updated user with ID No.: 16', '2025-04-24 03:28:38', 5),
(165, 'Updated partylist with ID No.: 16', '2025-04-24 03:32:15', 5),
(166, 'Updated partylist with ID No.: 19', '2025-04-24 03:36:42', 15),
(167, 'Updated partylist with ID No.: 19', '2025-04-24 03:37:37', 15),
(168, 'Updated partylist with ID No.: 19', '2025-04-24 03:38:32', 15),
(169, 'Updated partylist with ID No.: 19', '2025-04-24 03:39:59', 15),
(170, 'Updated partylist with ID No.: 19', '2025-04-24 03:41:36', 15),
(171, 'Created user account ID: 25', '2025-04-24 04:15:05', 15),
(172, 'Created user account ID: 26', '2025-04-24 04:44:22', 15),
(173, 'Deleted users with ID No.: 26', '2025-04-24 04:44:35', 15),
(174, 'Created user account ID: 27', '2025-04-24 04:48:23', 15),
(175, 'Updated user with ID No.: 27', '2025-04-24 04:49:15', 15),
(176, 'Added candidate with ID No.: 39', '2025-04-24 05:06:50', 15),
(177, 'Deleted candidate with ID No.: 31', '2025-04-24 05:13:32', 15),
(178, 'Deleted candidate with ID No.: 31', '2025-04-24 05:13:35', 15),
(179, 'Deleted candidate with ID No.: 30', '2025-04-24 05:13:45', 15),
(180, 'Deleted candidate with ID No.: 28', '2025-04-24 05:14:04', 15),
(181, 'Deleted candidate with ID No.: 33', '2025-04-24 05:25:43', 15),
(182, 'Updated candidate with ID No.: 29', '2025-04-24 05:29:07', 15),
(183, 'Added partylist with ID no.: 25', '2025-04-24 05:32:04', 15),
(184, 'Updated partylist with ID No.: 16', '2025-04-24 05:34:44', 15),
(185, 'Updated partylist with ID No.: 24', '2025-04-24 05:36:48', 15),
(186, 'Updated candidate with ID No.: 39', '2025-04-24 05:39:53', 15),
(187, 'Added COC application with ID No.: 4', '2025-04-24 05:45:38', 15),
(188, 'Added COC application with ID No.: 5', '2025-04-24 05:52:28', 15);

-- --------------------------------------------------------

--
-- Table structure for table `partylist`
--

CREATE TABLE `partylist` (
  `pid` int(10) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `shortname` varchar(50) NOT NULL,
  `contact` int(15) NOT NULL,
  `platform` varchar(1000) NOT NULL,
  `logo` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `uid` int(10) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `partylist`
--

INSERT INTO `partylist` (`pid`, `pname`, `shortname`, `contact`, `platform`, `logo`, `date`, `uid`, `status`) VALUES
(15, 'Independent', '', 0, '', '', '', 14, 'Completed'),
(16, 'kalikasan at kumunidad', 'kk', 22222, 'Environmental protection and climate action\nSustainable farming and fishing\nCommunity-led disaster response\nRenewable energy initiatives', '', '2025-04-21T06:26:18.690', 15, 'Completed'),
(19, 'Manggagawa Unida', 'MU', 3232, 'Workers’ rights and fair wages\n\nEnding contractualization\n\nAccessible social security\n\nLabor union support and development', '', '2025-04-22T20:01:36.035', 15, 'Completed'),
(24, 'Bayan para sa masa', 'BPM', 121, 'Accessible healthcare for all\n\nLivelihood programs for low-income families\n\nStrengthening public education\n\nTransparent governance\n\n', 'src/images/bpm.png', '2025-04-24T03:12:35.361', 5, 'Completed'),
(25, 'Strawhat pirates', 'SHP', 9999, 'Reduce corruption\nfree foods\nfree rides\n', '', '2025-04-24T05:32:04.419', 15, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `positions`
--

CREATE TABLE `positions` (
  `pid` int(10) NOT NULL,
  `position` varchar(255) NOT NULL,
  `term` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `positions`
--

INSERT INTO `positions` (`pid`, `position`, `term`) VALUES
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
(3, 12, 'doraemon', 'green', 'fish'),
(4, 5, 'romoo', 'black', 'fish');

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
(4, 'teves', 'teves', 'ishigami', 'teves1222@gmailcom', 'male', 'Admin', '2004-12-04', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Pending', 'src/images/Screenshot (13).png'),
(5, 'ishigami', 'senku', 'ishenku', 'senkiii@gmail.com', 'male', 'User', '0000-00-00', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', 'src/images/ishigami.jpg'),
(9, 'Roronoa', 'Zorro', 'zorrochi', 'zorrororor@gmail.com', 'male', 'Admin', '0000-00-00', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'active', ''),
(10, 'yuji', 'itadori', 'yujiii', 'itadori@gmail.com', 'male', 'User', '0000-00-00', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Pending', ''),
(11, 'ryomen', 'sukuna', 'sukuna', 'sukuna@gmail,com', 'male', 'User', '2004-12-04', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'pending', ''),
(12, 'Gojo', 'saturo', 'hollowpurple', 'hollowpurple@gmail.com', 'male', 'User', '1987-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ''),
(13, 'uzumaki', 'naruto', 'uzumaki', 'hokagi@gmail.com', 'male', 'User', '1989-03-23', 'Vkh+6vmFm1qfN7vw1rV3YNqLhLh3kafHVVCJPtgW1Ak=', 'Active', ''),
(14, 'sanji', 'vinsmoke', 'sanjii', 'onepiece@gmail.com', 'male', 'Admin', '2012-02-03', 'Tex6uJFFl9hHsI/4S6CB5avUxwSTilpuddqTOf3uQrQ=', 'Active', ''),
(15, 'anthony', 'teves', 'artstzy', 'teves12@gmail.com', 'male', 'Admin', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', 'src/images/yuji.jpg'),
(25, 'minato', 'namikaze', 'yellowflash', 'yellowflash@yahoo.com', 'male', 'User', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'pending', ''),
(27, 'sasuke', 'uchiha', 'sasukeee', 'chidori@gmail.com', 'male', 'User', '2004-12-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ''),
(28, 'Mark kevin', 'Romo', 'ROMOXD', 'romo@yahoo.com', 'male', 'Admin', '2004-12-23', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'pending', ' ');

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
  MODIFY `aid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `candidates`
--
ALTER TABLE `candidates`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `logged`
--
ALTER TABLE `logged`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=121;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=189;

--
-- AUTO_INCREMENT for table `partylist`
--
ALTER TABLE `partylist`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `positions`
--
ALTER TABLE `positions`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `rid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

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
