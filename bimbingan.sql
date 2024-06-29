-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2024 at 12:07 PM
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
-- Database: `bimbingan`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` bigint(20) NOT NULL,
  `nama_admin` varchar(255) DEFAULT NULL,
  `password_admin` varchar(255) DEFAULT NULL,
  `email_admin` varchar(255) DEFAULT NULL,
  `telp_admin` varchar(255) DEFAULT NULL,
  `alamat_admin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_admin`, `password_admin`, `email_admin`, `telp_admin`, `alamat_admin`) VALUES
(1, 'Juan', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(2, 'bonbon', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(3, 'admin', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(4, 'dafa', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(5, 'test1', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(6, 'test2', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(7, 'test3', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(8, 'test4', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(9, 'test5', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(10, 'test6', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(11, 'test7', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(12, 'test8', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL'),
(13, 'test9', 'bonbon', 'bonbon@gmail.com', '0293212222', 'JL. JKL');

-- --------------------------------------------------------

--
-- Table structure for table `berita`
--

CREATE TABLE `berita` (
  `id_berita` varchar(11) NOT NULL DEFAULT '0',
  `judul` varchar(255) DEFAULT NULL,
  `isi` varchar(255) DEFAULT NULL,
  `tgl_berita` date DEFAULT NULL,
  `jam_berita` time DEFAULT NULL,
  `gambar_berita` varchar(255) DEFAULT NULL,
  `id_admin` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bimbingan`
--

CREATE TABLE `bimbingan` (
  `id_bimbingan` varchar(11) NOT NULL DEFAULT '',
  `nim` varchar(11) DEFAULT NULL,
  `tgl` date DEFAULT NULL,
  `jam` time DEFAULT NULL,
  `hasil` varchar(255) DEFAULT NULL,
  `nip` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `bimbingan`
--

INSERT INTO `bimbingan` (`id_bimbingan`, `nim`, `tgl`, `jam`, `hasil`, `nip`) VALUES
('BIM001', '1812500724', '2020-01-08', '19:30:00', NULL, '360360'),
('BIM002', '1811502796', '2020-01-28', '09:45:00', NULL, '032300'),
('BIM003', '1811502796', '2020-02-24', '07:30:00', '', '032300'),
('BIM004', '1812500724', '2020-02-18', '09:45:00', '', '360360'),
('BIM005', '1811500360', '2020-02-15', '09:00:00', '', '230300'),
('BIM006', '1811500360', '2020-02-18', '10:42:00', '', '230300');

-- --------------------------------------------------------

--
-- Table structure for table `dokumen`
--

CREATE TABLE `dokumen` (
  `id_dokumen` varchar(11) NOT NULL DEFAULT '',
  `nama_dokumen` varchar(255) DEFAULT NULL,
  `tgl_dokumen` date DEFAULT NULL,
  `nim` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `dokumen`
--

INSERT INTO `dokumen` (`id_dokumen`, `nama_dokumen`, `tgl_dokumen`, `nim`) VALUES
('DOC002', 'Update-DOC-Cek lagi lah bosku.docx', '2019-12-28', '1812500724'),
('DOC003', 'DOC-Cek lagi lah bosku.docx', '2019-12-28', '1812500724'),
('DOC004', 'DOC-Cek bosku.docx', '2019-12-30', '1811500360'),
('DOC005', 'Update-DOC-Project_IPBO_0724.docx', '2020-01-17', '1811502796');

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `nip` varchar(11) NOT NULL DEFAULT '',
  `nama_dosen` varchar(50) DEFAULT NULL,
  `password_dosen` varchar(35) DEFAULT NULL,
  `email_dosen` varchar(35) DEFAULT NULL,
  `telp_dosen` varchar(13) DEFAULT NULL,
  `alamat_dosen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`nip`, `nama_dosen`, `password_dosen`, `email_dosen`, `telp_dosen`, `alamat_dosen`) VALUES
('002303', 'Udin', '002303', 'dosen3@gmail.com', '085782193431', 'Karangcegak'),
('032300', 'Amir', '032300', 'dosen2@gmail.com', '08818624589', 'Kutasari'),
('181181', 'Yogi Angga', '181181', 'dosen5@gmail.com', '081213141516', 'Jambi'),
('230300', 'Amirudin', '230300', 'dosen1@gmail.com', '085726097698', 'Purbalingga'),
('360360', 'Yogi Angga Putra', '360360', 'dosen4@gmail.com', '081245456565', 'Pondok Lakah Permai');

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `nim` varchar(11) NOT NULL DEFAULT '',
  `nama_mhs` varchar(50) DEFAULT NULL,
  `password_mhs` varchar(35) DEFAULT NULL,
  `email_mhs` varchar(35) DEFAULT NULL,
  `telp_mhs` varchar(13) DEFAULT NULL,
  `alamat_mhs` varchar(255) DEFAULT NULL,
  `nip` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`nim`, `nama_mhs`, `password_mhs`, `email_mhs`, `telp_mhs`, `alamat_mhs`, `nip`) VALUES
('1811500360', 'Yogi Angga Putra', '360', '1811500360@gmail.com', '085712131415', 'Pondok Lakah Permai', '230300'),
('1811502796', 'Irennada', '2796', 'irennada@gmail.com', '085726097698', 'Pondok Aren', '032300'),
('1812500625', 'Erika Nur Komalasari', '625', 'erika@gmail.com', '08818624589', 'Taman Asri', '002303'),
('1812500724', 'Amirudin', '724', '1812500724@gmail.com', '085726097698', 'Purbalingga', '360360'),
('1812500725', 'Nurul Azzahra', '725', '1812500725@gmail.com', '08818624589', 'Pamulang', '181181');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nama_usr` varchar(35) NOT NULL,
  `email_usr` varchar(35) NOT NULL,
  `tlp_usr` varchar(12) NOT NULL,
  `alamat_usr` text NOT NULL,
  `username` varchar(18) NOT NULL,
  `password` varchar(40) NOT NULL,
  `level` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nama_usr`, `email_usr`, `tlp_usr`, `alamat_usr`, `username`, `password`, `level`) VALUES
('nama', 'email@email', '121212121212', 'asdsd', '12121212', 'a01610228fe998f515a72dd730294d87', '1'),
('Amir', '1812500724@student.budiluhur.ac.id', '08578219589', 'Karangcegak', '1812500720', 'ac43724f16e9241d990427ab7c8f4228', '0'),
('Amirudin', 'amir@gmail.com', '085726097698', 'Purbalingga', '1812500724', 'ac43724f16e9241d990427ab7c8f4228', '1'),
('Udin', 'amirudin@gmail.com', '085726097698', 'Kutasari', '1812500725', '827ccb0eea8a706c4c34a16891f84e7b', '1'),
('Amir', '1812500724@student.budiluhur.ac.id', '08818624589', 'Karangcegak', '1812500726', 'e10adc3949ba59abbe56e057f20f883e', '1'),
('Nur Fahmi Azis', 'nurfahmiazis19@gmail.com', '02191075625', 'jl.queque', 'admin', '21232f297a57a5a743894a0e4a801fc3', '0'),
('Amir', 'amir@gmail.com', '085726097698', 'Purbalingga', 'admin1', 'e00cf25ad42683b3df678c61f42c6bda', '0'),
('Amirudin', 'amirudin@gmail.com', '0857260000', 'Jl. in aja', 'Amirudin', '202cb962ac59075b964b07152d234b70', '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `berita`
--
ALTER TABLE `berita`
  ADD PRIMARY KEY (`id_berita`),
  ADD KEY `FKAdmin` (`id_admin`);

--
-- Indexes for table `bimbingan`
--
ALTER TABLE `bimbingan`
  ADD PRIMARY KEY (`id_bimbingan`);

--
-- Indexes for table `dokumen`
--
ALTER TABLE `dokumen`
  ADD PRIMARY KEY (`id_dokumen`),
  ADD KEY `FKMahasiswa` (`nim`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `FKDosen` (`nip`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
