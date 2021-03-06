-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2018 a las 23:08:21
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reservadevuelos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE `asiento` (
  `idAsiento` int(11) NOT NULL,
  `idVuelo` int(11) NOT NULL,
  `ubicacion` varchar(4) NOT NULL,
  `precio` float NOT NULL,
  `disponible` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asiento`
--

INSERT INTO `asiento` (`idAsiento`, `idVuelo`, `ubicacion`, `precio`, `disponible`) VALUES
(564, 34, 'V001', 8560, 0),
(565, 34, 'P002', 8560, 1),
(566, 34, 'P003', 8560, 0),
(567, 34, 'V004', 8560, 1),
(568, 34, 'V005', 8560, 1),
(569, 34, 'P006', 8560, 1),
(570, 34, 'P007', 8560, 0),
(571, 34, 'V008', 8560, 0),
(572, 34, 'V009', 8560, 0),
(573, 34, 'P010', 8560, 1),
(574, 34, 'P011', 8560, 1),
(575, 34, 'V012', 8560, 1),
(576, 34, 'V013', 8560, 1),
(577, 34, 'P014', 8560, 0),
(578, 34, 'P015', 8560, 1),
(579, 34, 'V016', 8560, 1),
(580, 34, 'V017', 8560, 1),
(581, 34, 'P018', 8560, 1),
(582, 34, 'P019', 8560, 0),
(583, 34, 'V020', 8560, 0),
(584, 34, 'V021', 8560, 0),
(585, 34, 'P022', 8560, 1),
(586, 34, 'P023', 8560, 1),
(587, 34, 'V024', 8560, 1),
(588, 34, 'V025', 8560, 1),
(589, 34, 'P026', 8560, 0),
(590, 34, 'P027', 8560, 1),
(591, 34, 'V028', 8560, 0),
(592, 34, 'V029', 8560, 0),
(593, 34, 'P030', 8560, 1),
(594, 34, 'P031', 8560, 1),
(595, 34, 'V032', 8560, 0),
(628, 36, 'V001', 4520, 1),
(629, 36, 'P002', 4520, 1),
(630, 36, 'P003', 4520, 1),
(631, 36, 'V004', 4520, 1),
(632, 36, 'V005', 4520, 0),
(633, 36, 'P006', 4520, 0),
(634, 36, 'P007', 4520, 1),
(635, 36, 'V008', 4520, 1),
(636, 36, 'V009', 4520, 0),
(637, 36, 'P010', 4520, 1),
(638, 36, 'P011', 4520, 1),
(639, 36, 'V012', 4520, 1),
(640, 36, 'V013', 4520, 1),
(641, 36, 'P014', 4520, 0),
(642, 36, 'P015', 4520, 1),
(643, 36, 'V016', 4520, 1),
(644, 36, 'V017', 4520, 1),
(645, 36, 'P018', 4520, 1),
(646, 36, 'P019', 4520, 1),
(647, 36, 'V020', 4520, 1),
(648, 36, 'V021', 4520, 0),
(649, 36, 'P022', 4520, 1),
(650, 36, 'P023', 4520, 0),
(651, 36, 'V024', 4520, 0),
(652, 36, 'V025', 4520, 1),
(653, 36, 'P026', 4520, 0),
(654, 36, 'P027', 4520, 0),
(655, 36, 'V028', 4520, 1),
(656, 36, 'V029', 4520, 0),
(657, 36, 'P030', 4520, 1),
(658, 36, 'P031', 4520, 1),
(659, 36, 'V032', 4520, 1),
(660, 37, 'V001', 14520, 1),
(661, 37, 'P002', 14520, 1),
(662, 37, 'P003', 14520, 1),
(663, 37, 'V004', 14520, 1),
(664, 37, 'V005', 14520, 1),
(665, 37, 'P006', 14520, 1),
(666, 37, 'P007', 14520, 1),
(667, 37, 'V008', 14520, 1),
(668, 37, 'V009', 14520, 1),
(669, 37, 'P010', 14520, 1),
(670, 37, 'P011', 14520, 1),
(671, 37, 'V012', 14520, 1),
(672, 37, 'V013', 14520, 1),
(673, 37, 'P014', 14520, 1),
(674, 37, 'P015', 14520, 1),
(675, 37, 'V016', 14520, 1),
(676, 37, 'V017', 14520, 1),
(677, 37, 'P018', 14520, 1),
(678, 37, 'P019', 14520, 1),
(679, 37, 'V020', 14520, 1),
(680, 37, 'V021', 14520, 1),
(681, 37, 'P022', 14520, 1),
(682, 37, 'P023', 14520, 1),
(683, 37, 'V024', 14520, 1),
(684, 37, 'V025', 14520, 1),
(685, 37, 'P026', 14520, 1),
(686, 37, 'P027', 14520, 1),
(687, 37, 'V028', 14520, 1),
(688, 37, 'V029', 14520, 1),
(689, 37, 'P030', 14520, 1),
(690, 37, 'P031', 14520, 1),
(691, 37, 'V032', 14520, 1),
(692, 38, 'V001', 14520, 0),
(693, 38, 'P002', 14520, 0),
(694, 38, 'P003', 14520, 0),
(695, 38, 'V004', 14520, 1),
(696, 38, 'V005', 14520, 0),
(697, 38, 'P006', 14520, 0),
(698, 38, 'P007', 14520, 1),
(699, 38, 'V008', 14520, 0),
(700, 38, 'V009', 14520, 0),
(701, 38, 'P010', 14520, 0),
(702, 38, 'P011', 14520, 0),
(703, 38, 'V012', 14520, 1),
(704, 38, 'V013', 14520, 0),
(705, 38, 'P014', 14520, 0),
(706, 38, 'P015', 14520, 0),
(707, 38, 'V016', 14520, 1),
(708, 38, 'V017', 14520, 0),
(709, 38, 'P018', 14520, 0),
(710, 38, 'P019', 14520, 0),
(711, 38, 'V020', 14520, 0),
(712, 38, 'V021', 14520, 0),
(713, 38, 'P022', 14520, 1),
(714, 38, 'P023', 14520, 1),
(715, 38, 'V024', 14520, 0),
(716, 38, 'V025', 14520, 1),
(717, 38, 'P026', 14520, 0),
(718, 38, 'P027', 14520, 0),
(719, 38, 'V028', 14520, 0),
(720, 38, 'V029', 14520, 1),
(721, 38, 'P030', 14520, 0),
(722, 38, 'P031', 14520, 1),
(723, 38, 'V032', 14520, 1),
(756, 40, 'V001', 4520, 1),
(757, 40, 'P002', 4520, 1),
(758, 40, 'P003', 4520, 1),
(759, 40, 'V004', 4520, 1),
(760, 40, 'V005', 4520, 1),
(761, 40, 'P006', 4520, 1),
(762, 40, 'P007', 4520, 1),
(763, 40, 'V008', 4520, 1),
(764, 40, 'V009', 4520, 1),
(765, 40, 'P010', 4520, 1),
(766, 40, 'P011', 4520, 1),
(767, 40, 'V012', 4520, 1),
(768, 40, 'V013', 4520, 1),
(769, 40, 'P014', 4520, 1),
(770, 40, 'P015', 4520, 1),
(771, 40, 'V016', 4520, 1),
(772, 40, 'V017', 4520, 1),
(773, 40, 'P018', 4520, 1),
(774, 40, 'P019', 4520, 1),
(775, 40, 'V020', 4520, 1),
(776, 40, 'V021', 4520, 1),
(777, 40, 'P022', 4520, 1),
(778, 40, 'P023', 4520, 1),
(779, 40, 'V024', 4520, 1),
(780, 40, 'V025', 4520, 1),
(781, 40, 'P026', 4520, 1),
(782, 40, 'P027', 4520, 1),
(783, 40, 'V028', 4520, 1),
(784, 40, 'V029', 4520, 1),
(785, 40, 'P030', 4520, 1),
(786, 40, 'P031', 4520, 1),
(787, 40, 'V032', 4520, 1),
(788, 41, 'V001', 10000, 1),
(789, 41, 'P002', 10000, 1),
(790, 41, 'P003', 10000, 1),
(791, 41, 'V004', 10000, 1),
(792, 41, 'V005', 10000, 1),
(793, 41, 'P006', 10000, 1),
(794, 41, 'P007', 10000, 1),
(795, 41, 'V008', 10000, 1),
(796, 41, 'V009', 10000, 1),
(797, 41, 'P010', 10000, 1),
(798, 41, 'P011', 10000, 1),
(799, 41, 'V012', 10000, 1),
(800, 41, 'V013', 10000, 1),
(801, 41, 'P014', 10000, 1),
(802, 41, 'P015', 10000, 1),
(803, 41, 'V016', 10000, 1),
(804, 41, 'V017', 10000, 1),
(805, 41, 'P018', 10000, 1),
(806, 41, 'P019', 10000, 1),
(807, 41, 'V020', 10000, 1),
(808, 41, 'V021', 10000, 1),
(809, 41, 'P022', 10000, 1),
(810, 41, 'P023', 10000, 1),
(811, 41, 'V024', 10000, 1),
(812, 41, 'V025', 10000, 1),
(813, 41, 'P026', 10000, 1),
(814, 41, 'P027', 10000, 1),
(815, 41, 'V028', 10000, 1),
(816, 41, 'V029', 10000, 1),
(817, 41, 'P030', 10000, 1),
(818, 41, 'P031', 10000, 1),
(819, 41, 'V032', 10000, 1),
(820, 42, 'V001', 10000, 1),
(821, 42, 'P002', 10000, 1),
(822, 42, 'P003', 10000, 1),
(823, 42, 'V004', 10000, 1),
(824, 42, 'V005', 10000, 1),
(825, 42, 'P006', 10000, 1),
(826, 42, 'P007', 10000, 1),
(827, 42, 'V008', 10000, 1),
(828, 42, 'V009', 10000, 1),
(829, 42, 'P010', 10000, 1),
(830, 42, 'P011', 10000, 1),
(831, 42, 'V012', 10000, 1),
(832, 42, 'V013', 10000, 1),
(833, 42, 'P014', 10000, 1),
(834, 42, 'P015', 10000, 1),
(835, 42, 'V016', 10000, 1),
(836, 42, 'V017', 10000, 1),
(837, 42, 'P018', 10000, 1),
(838, 42, 'P019', 10000, 1),
(839, 42, 'V020', 10000, 1),
(840, 42, 'V021', 10000, 1),
(841, 42, 'P022', 10000, 1),
(842, 42, 'P023', 10000, 1),
(843, 42, 'V024', 10000, 1),
(844, 42, 'V025', 10000, 1),
(845, 42, 'P026', 10000, 1),
(846, 42, 'P027', 10000, 1),
(847, 42, 'V028', 10000, 1),
(848, 42, 'V029', 10000, 1),
(849, 42, 'P030', 10000, 1),
(850, 42, 'P031', 10000, 1),
(851, 42, 'V032', 10000, 1),
(852, 43, 'V001', 14520, 1),
(853, 43, 'P002', 14520, 1),
(854, 43, 'P003', 14520, 1),
(855, 43, 'V004', 14520, 1),
(856, 43, 'V005', 14520, 1),
(857, 43, 'P006', 14520, 1),
(858, 43, 'P007', 14520, 1),
(859, 43, 'V008', 14520, 1),
(860, 43, 'V009', 14520, 1),
(861, 43, 'P010', 14520, 1),
(862, 43, 'P011', 14520, 1),
(863, 43, 'V012', 14520, 1),
(864, 43, 'V013', 14520, 1),
(865, 43, 'P014', 14520, 1),
(866, 43, 'P015', 14520, 1),
(867, 43, 'V016', 14520, 1),
(868, 43, 'V017', 14520, 1),
(869, 43, 'P018', 14520, 1),
(870, 43, 'P019', 14520, 1),
(871, 43, 'V020', 14520, 1),
(872, 43, 'V021', 14520, 1),
(873, 43, 'P022', 14520, 1),
(874, 43, 'P023', 14520, 1),
(875, 43, 'V024', 14520, 1),
(876, 43, 'V025', 14520, 1),
(877, 43, 'P026', 14520, 1),
(878, 43, 'P027', 14520, 1),
(879, 43, 'V028', 14520, 1),
(880, 43, 'V029', 14520, 1),
(881, 43, 'P030', 14520, 1),
(882, 43, 'P031', 14520, 1),
(883, 43, 'V032', 14520, 1),
(884, 44, 'V001', 5000, 1),
(885, 44, 'P002', 5000, 1),
(886, 44, 'P003', 5000, 1),
(887, 44, 'V004', 5000, 1),
(888, 44, 'V005', 5000, 1),
(889, 44, 'P006', 5000, 1),
(890, 44, 'P007', 5000, 1),
(891, 44, 'V008', 5000, 1),
(892, 44, 'V009', 5000, 1),
(893, 44, 'P010', 5000, 1),
(894, 44, 'P011', 5000, 1),
(895, 44, 'V012', 5000, 1),
(896, 44, 'V013', 5000, 1),
(897, 44, 'P014', 5000, 1),
(898, 44, 'P015', 5000, 1),
(899, 44, 'V016', 5000, 1),
(900, 44, 'V017', 5000, 1),
(901, 44, 'P018', 5000, 1),
(902, 44, 'P019', 5000, 1),
(903, 44, 'V020', 5000, 1),
(904, 44, 'V021', 5000, 1),
(905, 44, 'P022', 5000, 1),
(906, 44, 'P023', 5000, 1),
(907, 44, 'V024', 5000, 1),
(908, 44, 'V025', 5000, 1),
(909, 44, 'P026', 5000, 1),
(910, 44, 'P027', 5000, 1),
(911, 44, 'V028', 5000, 1),
(912, 44, 'V029', 5000, 1),
(913, 44, 'P030', 5000, 1),
(914, 44, 'P031', 5000, 1),
(915, 44, 'V032', 5000, 1),
(916, 45, 'V001', 10500, 1),
(917, 45, 'P002', 10500, 1),
(918, 45, 'P003', 10500, 1),
(919, 45, 'V004', 10500, 1),
(920, 45, 'V005', 10500, 1),
(921, 45, 'P006', 10500, 1),
(922, 45, 'P007', 10500, 1),
(923, 45, 'V008', 10500, 1),
(924, 45, 'V009', 10500, 1),
(925, 45, 'P010', 10500, 1),
(926, 45, 'P011', 10500, 1),
(927, 45, 'V012', 10500, 1),
(928, 45, 'V013', 10500, 1),
(929, 45, 'P014', 10500, 1),
(930, 45, 'P015', 10500, 1),
(931, 45, 'V016', 10500, 1),
(932, 45, 'V017', 10500, 1),
(933, 45, 'P018', 10500, 1),
(934, 45, 'P019', 10500, 1),
(935, 45, 'V020', 10500, 1),
(936, 45, 'V021', 10500, 1),
(937, 45, 'P022', 10500, 1),
(938, 45, 'P023', 10500, 1),
(939, 45, 'V024', 10500, 1),
(940, 45, 'V025', 10500, 1),
(941, 45, 'P026', 10500, 1),
(942, 45, 'P027', 10500, 1),
(943, 45, 'V028', 10500, 1),
(944, 45, 'V029', 10500, 1),
(945, 45, 'P030', 10500, 1),
(946, 45, 'P031', 10500, 1),
(947, 45, 'V032', 10500, 1),
(948, 46, 'V001', 10500, 1),
(949, 46, 'P002', 10500, 1),
(950, 46, 'P003', 10500, 1),
(951, 46, 'V004', 10500, 1),
(952, 46, 'V005', 10500, 1),
(953, 46, 'P006', 10500, 1),
(954, 46, 'P007', 10500, 1),
(955, 46, 'V008', 10500, 1),
(956, 46, 'V009', 10500, 1),
(957, 46, 'P010', 10500, 1),
(958, 46, 'P011', 10500, 1),
(959, 46, 'V012', 10500, 1),
(960, 46, 'V013', 10500, 1),
(961, 46, 'P014', 10500, 1),
(962, 46, 'P015', 10500, 1),
(963, 46, 'V016', 10500, 1),
(964, 46, 'V017', 10500, 1),
(965, 46, 'P018', 10500, 1),
(966, 46, 'P019', 10500, 1),
(967, 46, 'V020', 10500, 1),
(968, 46, 'V021', 10500, 1),
(969, 46, 'P022', 10500, 1),
(970, 46, 'P023', 10500, 1),
(971, 46, 'V024', 10500, 1),
(972, 46, 'V025', 10500, 1),
(973, 46, 'P026', 10500, 1),
(974, 46, 'P027', 10500, 1),
(975, 46, 'V028', 10500, 1),
(976, 46, 'V029', 10500, 1),
(977, 46, 'P030', 10500, 1),
(978, 46, 'P031', 10500, 1),
(979, 46, 'V032', 10500, 1),
(980, 47, 'V001', 10500, 1),
(981, 47, 'P002', 10500, 1),
(982, 47, 'P003', 10500, 1),
(983, 47, 'V004', 10500, 1),
(984, 47, 'V005', 10500, 1),
(985, 47, 'P006', 10500, 1),
(986, 47, 'P007', 10500, 1),
(987, 47, 'V008', 10500, 1),
(988, 47, 'V009', 10500, 1),
(989, 47, 'P010', 10500, 1),
(990, 47, 'P011', 10500, 1),
(991, 47, 'V012', 10500, 1),
(992, 47, 'V013', 10500, 1),
(993, 47, 'P014', 10500, 1),
(994, 47, 'P015', 10500, 1),
(995, 47, 'V016', 10500, 1),
(996, 47, 'V017', 10500, 1),
(997, 47, 'P018', 10500, 1),
(998, 47, 'P019', 10500, 1),
(999, 47, 'V020', 10500, 1),
(1000, 47, 'V021', 10500, 1),
(1001, 47, 'P022', 10500, 1),
(1002, 47, 'P023', 10500, 1),
(1003, 47, 'V024', 10500, 1),
(1004, 47, 'V025', 10500, 1),
(1005, 47, 'P026', 10500, 1),
(1006, 47, 'P027', 10500, 1),
(1007, 47, 'V028', 10500, 1),
(1008, 47, 'V029', 10500, 1),
(1009, 47, 'P030', 10500, 1),
(1010, 47, 'P031', 10500, 1),
(1011, 47, 'V032', 10500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `vigencia` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idCiudad`, `nombre`, `pais`, `vigencia`) VALUES
(7, 'Buenos Aires', 'Argentina', 1),
(8, 'Lima', 'Perú', 1),
(9, 'Londres', 'Inglaterra', 1),
(10, 'La Paz', 'Bolivia', 1),
(11, 'San Luis', 'Argentina', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(8) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `nroPasaporte` int(15) NOT NULL,
  `nroTarjeta` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `dni`, `mail`, `nroPasaporte`, `nroTarjeta`) VALUES
(1, 'Matias', 'Torres', 32887703, 'matitorres87@gmail.com', 123456798, 123456789);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idAsiento` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fechaCompra` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idAsiento`, `idCliente`, `fechaCompra`) VALUES
(1, 564, 1, '2018-11-08 00:41:28');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `idVuelo` int(11) NOT NULL,
  `aerolinea` varchar(30) NOT NULL,
  `tipoAeronave` varchar(30) NOT NULL,
  `idCiudadOrigen` int(11) NOT NULL,
  `idCiudadDestino` int(11) NOT NULL,
  `fechaSalida` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaArribo` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vuelo`
--

INSERT INTO `vuelo` (`idVuelo`, `aerolinea`, `tipoAeronave`, `idCiudadOrigen`, `idCiudadDestino`, `fechaSalida`, `fechaArribo`, `estado`) VALUES
(34, 'LATAM', 'Airbus A350', 10, 9, '2018-11-04 10:40:00', '2018-10-05 02:50:00', 'n'),
(36, 'Aerolineas Argentinas', 'Boeing 747', 7, 8, '2018-11-01 19:52:51', '2018-10-02 00:53:00', 'n'),
(37, 'LAN', 'Boeing 767', 8, 9, '2018-11-01 19:52:51', '2018-10-02 00:53:00', 'n'),
(38, 'Emirates', 'Airbus A330', 9, 10, '2018-11-02 19:52:51', '2018-10-04 00:53:00', 'n'),
(40, 'FlyBondi', 'Boeing 757', 11, 10, '2018-11-01 20:16:55', '2018-10-01 20:17:01', 'n'),
(41, 'Aerolineas Argentinas', 'Boeing 757', 8, 9, '2018-11-01 21:53:42', '2018-11-02 21:53:46', 'n'),
(42, 'Aerolineas Argentinas', 'Airbus A340', 7, 10, '2018-11-01 21:53:42', '2018-11-02 21:53:46', 'n'),
(43, 'Emirates', 'Airbus A340', 9, 7, '2018-11-07 20:16:55', '2018-10-08 20:17:01', 'd'),
(44, 'Aerolineas Argentinas', 'Boeing 757', 7, 10, '2018-11-13 00:46:03', '2018-11-13 02:46:00', 'n'),
(45, 'Emirates', 'Airbus A330', 7, 9, '2018-11-13 00:46:03', '2018-11-13 02:46:00', 'n'),
(46, 'Emirates', 'Airbus A330', 7, 9, '2018-11-12 20:46:00', '2018-11-13 02:46:00', 'n'),
(47, 'Emirates', 'Airbus A330', 7, 9, '2018-11-12 20:46:00', '2018-11-13 02:46:00', 'c');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD PRIMARY KEY (`idAsiento`),
  ADD KEY `asiento_ibfk_1` (`idVuelo`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`idCiudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idAsiento` (`idAsiento`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`idVuelo`),
  ADD KEY `idCiudadDestino` (`idCiudadDestino`),
  ADD KEY `idCiudadOrigen` (`idCiudadOrigen`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asiento`
--
ALTER TABLE `asiento`
  MODIFY `idAsiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1012;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `idVuelo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD CONSTRAINT `asiento_ibfk_1` FOREIGN KEY (`idVuelo`) REFERENCES `vuelo` (`idVuelo`) ON DELETE CASCADE;

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `compra_ibfk_3` FOREIGN KEY (`idAsiento`) REFERENCES `asiento` (`idAsiento`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `vuelo_ibfk_2` FOREIGN KEY (`idCiudadDestino`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `vuelo_ibfk_3` FOREIGN KEY (`idCiudadOrigen`) REFERENCES `ciudad` (`idCiudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
