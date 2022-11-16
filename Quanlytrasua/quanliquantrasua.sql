-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 31, 2022 lúc 06:30 PM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanliquantrasua`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `ID` int(11) NOT NULL,
  `Username` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Number` int(10) NOT NULL,
  `ghichu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`ID`, `Username`, `Number`, `ghichu`) VALUES
(1, 'Nguyễn Văn Nguyên', 322222, '34554888'),
(2, 'Lê Đình Quang', 5555555, 'Soda'),
(3, 'Nguyễn Văn Phước ', 2256255, '2256255'),
(4, 'Trần Thị Thúy Nga', 1555555, 'Doraemon'),
(5, 'Lương Thị Thu Việt', 225522555, 'Ngồi bàn 02');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoidung`
--

CREATE TABLE `nguoidung` (
  `username` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fullname` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `quyen` varchar(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nguoidung`
--

INSERT INTO `nguoidung` (`username`, `password`, `fullname`, `email`, `quyen`, `sodienthoai`) VALUES
('nga', 'usser', 'Trần Thị Thúy Nga', 'ngadoraemon@gmail.com', 'user', 355555),
('nguyen', 'usser', 'Nguyễn Văn Nguyên', 'nguyen@gmail.com', 'user', 355555),
('phuoc', 'usser', 'Nguyễn Văn Phước', 'phuoc2@gmail.com', 'user', 15555553),
('quang', '123', 'Lê Đình Quang', 'ledinhquangabc1234@gmail.com', 'admin', 35555554),
('viet', 'usser', 'Lương Thị Thu Việt', 'viet2@gmail.com', 'user', 22555555);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manhanvien` int(11) NOT NULL,
  `tennhanvien` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `quequan` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cmnd` int(11) NOT NULL,
  `sdt` int(11) NOT NULL,
  `tuoi` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`manhanvien`, `tennhanvien`, `quequan`, `cmnd`, `sdt`, `tuoi`) VALUES
(191, 'Lê Đình Quang', 'Thanh Hóa', 201012031, 376802189, 21),
(192, 'Nguyễn Văn Phước', 'Hà Nam', 355666, 2556666, 21),
(193, 'Nguyễn Văn Nguyên', 'Hà Nội', 2553555, 2255555, 21),
(194, 'Trần Thị Thúy Nga', 'Thanh Hóa', 225555, 2366555, 21),
(195, ' Lương Thị Thu Việt', 'Hà Tĩnh ', 25556255, 355555, 21);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `id` int(11) NOT NULL,
  `tensp` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dongia` int(11) NOT NULL,
  `nguyenlieu` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`id`, `tensp`, `dongia`, `nguyenlieu`) VALUES
(1, 'Trà sữa sủi bọt', 60000, 'Trà Thái Nguуên: 30grĐường: 40grĐá ᴠiênNước nóng pha trà: khoảng 100mlDụng cụ: Shaker, bình ủ trà, râу lọc'),
(2, 'Trà sữa khúc bạch', 50000, '200ml sữa tươi không đường\r\n'),
(3, 'Trà tắc', 10000, 'chanh '),
(4, 'Nước ép cam', 60000, 'Cam ');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manhanvien`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `manhanvien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=196;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
