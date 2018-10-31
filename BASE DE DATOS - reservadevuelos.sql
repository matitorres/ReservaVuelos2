-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2018 a las 20:25:59
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
(595, 34, 'V032', 8560, 0);

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
(34, 'LATAM', 'Airbus A350', 10, 9, '2018-10-30 10:40:00', '2018-10-31 02:50:00', 'n');

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
  MODIFY `idAsiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=628;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `idVuelo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

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
