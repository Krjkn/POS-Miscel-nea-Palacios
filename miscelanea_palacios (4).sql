-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-06-2023 a las 21:29:06
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `miscelanea_palacios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesventa`
--

CREATE TABLE `detallesventa` (
  `ID_DetalleVenta` int(11) NOT NULL,
  `ID_Venta` int(11) DEFAULT NULL,
  `ID_Prod` int(11) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `PrecioUnitario` decimal(10,2) DEFAULT NULL,
  `SubTotal` double NOT NULL,
  `Descuento` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallesventa`
--

INSERT INTO `detallesventa` (`ID_DetalleVenta`, `ID_Venta`, `ID_Prod`, `Cantidad`, `PrecioUnitario`, `SubTotal`, `Descuento`) VALUES
(1, 1, 1, 1, '27.00', 27, '0.00'),
(2, 2, 2, 1, '15.00', 15, '0.00'),
(3, 2, 1, 1, '27.00', 27, '0.00'),
(4, 3, 2, 1, '15.00', 15, '0.00'),
(5, 4, 1, 1, '27.00', 27, '0.00'),
(6, 5, 1, 1, '27.00', 27, '0.00'),
(7, 6, 1, 1, '27.00', 27, '0.00'),
(8, 7, 1, 1, '27.00', 27, '0.00'),
(9, 8, 1, 1, '27.00', 27, '0.00'),
(10, 9, 1, 1, '27.00', 27, '0.00'),
(11, 10, 2, 1, '15.00', 15, '0.00'),
(12, 11, 1, 1, '27.00', 27, '0.00'),
(13, 11, 2, 1, '15.00', 15, '0.00'),
(14, 12, 12, 1, '60.00', 60, '0.00'),
(15, 13, 10, 1, '60.00', 60, '0.00'),
(16, 14, 5, 1, '50.00', 50, '0.00'),
(17, 15, 6, 1, '66.00', 66, '0.00'),
(18, 16, 24, 1, '75.00', 75, '0.00'),
(19, 17, 47, 1, '60.00', 60, '0.00'),
(20, 17, 162, 1, '65.00', 65, '0.00'),
(21, 17, 132, 1, '45.00', 45, '0.00'),
(22, 18, 136, 1, '80.00', 80, '0.00'),
(23, 18, 189, 1, '63.00', 63, '0.00'),
(24, 19, 136, 1, '80.00', 80, '0.00'),
(25, 20, 139, 1, '22.00', 22, '0.00'),
(26, 21, 96, 1, '50.00', 50, '0.00'),
(27, 21, 229, 1, '65.00', 65, '0.00'),
(28, 21, 70, 1, '50.00', 50, '0.00'),
(29, 21, 143, 1, '45.00', 45, '0.00'),
(30, 21, 167, 1, '35.00', 35, '0.00'),
(31, 22, 47, 1, '60.00', 60, '0.00'),
(32, 23, 128, 1, '25.00', 25, '0.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `ID_Prod` int(11) NOT NULL,
  `Lote` varchar(30) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Precio_Venta` decimal(10,0) NOT NULL,
  `Precio_Compra` double NOT NULL,
  `Stock` int(11) NOT NULL,
  `Fecha_Cad` date DEFAULT NULL,
  `Descuento` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`ID_Prod`, `Lote`, `Nombre`, `Descripcion`, `Precio_Venta`, `Precio_Compra`, `Stock`, `Fecha_Cad`, `Descuento`) VALUES
(1, '7501125104411', 'Electrolit', 'Sabor Coco 625 ml', '27', 17, 1, '2024-10-01', '0'),
(2, '7501039401149', 'Boing', 'Guayaba 500ml', '15', 10, 6, '2023-09-13', '0'),
(3, '7509546662442', 'Desodorante Barra', 'Stefano', '50', 40, 4, '2024-04-01', '0'),
(4, '7506309839202', 'Des Barra', 'Old Spice Wolfthorn', '55', 40, 8, '2024-07-01', '0'),
(5, '7509546061672', 'Desodorante', 'Barra Speed Stick', '50', 40, 1, '2023-05-01', '0'),
(6, '7702018913664', 'Desodorante', 'Gel Gillette ', '66', 44, 4, '2024-10-01', '0'),
(7, '7502221181641', 'Desodorante', 'Barra Brut Classic', '50', 40, 3, '2024-11-01', '0'),
(8, '7509546661636', 'Desodorante', 'Aerosol Stefano', '60', 40, 6, '2023-12-01', '0'),
(9, '7509546078434', 'Desodorante', 'Aerosol Stefano Alpha', '60', 40, 8, '2024-01-01', '0'),
(10, '7791293022819', 'Desodorante', 'Aerosol Dove Man Care', '60', 40, 24, '2024-09-01', '0'),
(11, '7506306203044', 'Desodorante', 'Aerosol Axe Kilo', '63', 40, 1, '2026-02-01', '0'),
(12, '7791293025797', 'Desodorante', 'Aerosol Axe Dark Temptation', '60', 40, 39, '2026-03-01', '0'),
(13, '7791293025810', 'Desodorante', 'Aerosol Axe Fusion', '63', 40, 12, '2026-03-01', '0'),
(14, '7791293032153', 'Desodorante', 'Aerosol Axe Black Night', '63', 40, 8, '2026-03-01', '0'),
(15, '7506306244795', 'Desodorante', 'Aerosol Axe Intense', '63', 40, 10, '2026-01-01', '0'),
(16, '7500435141796', 'Desodorante Aerosol', 'Old Spice Mar Profundo', '60', 40, 28, '2024-03-05', '0'),
(17, '7506339349047', 'Desodorante Aerosol', 'Old Spice Fresh', '60', 40, 4, '2024-06-08', '0'),
(18, '7509546063676', 'Desodorante Aerosol', 'Speed Stick Water Proof', '60', 40, 12, '2024-03-01', '0'),
(19, '7509546063867', 'Desodorante Aerosol', 'Speed Stick Xtreme Intense', '60', 40, 3, '2024-03-01', '0'),
(20, '7791293022567', 'Desodorante Aerosol', 'Rexona V8', '60', 40, 12, '2025-03-01', '0'),
(21, '7791293022581', 'Desodorante Aerosol', 'Rexona XtraCool', '63', 40, 13, '2026-03-01', '0'),
(22, '4005900515865', 'Desodorante Aerosol', 'Nivea Fresh', '60', 40, 15, '2024-12-01', '0'),
(23, '7791293022635', 'Desodorante Aerosol', 'Rexona Invisible', '60', 40, 2, '2026-05-01', '0'),
(24, '4005900342263', 'Desodorante Aerosol', 'Nivea Black Y White 250ml', '75', 60, 2, NULL, '0'),
(25, '7506306221765', 'Desodorante Aerosol', 'EGO ultrafresh 150 ml', '55', 40, 4, '2026-02-01', '0'),
(26, '7506306215504', 'Desodorante aerosol', 'Ego attraction ', '55', 35, 4, '2026-02-01', '0'),
(27, '7506306210080', 'Desodorante aerosol', 'Ego sport', '55', 35, 4, '2026-04-01', '0'),
(28, '7506306210103', 'Desodorante aerosol', 'Ego force', '55', 35, 3, '2026-02-01', '0'),
(29, '7509546063843', 'Desodorante aerosol', 'lady Speed Stick powder fresh', '60', 40, 2, '2024-04-01', '0'),
(30, '7509546067926', 'Desodorante aerosol', 'Lady Speed stick dermaaclarado', '60', 40, 1, '2024-05-01', '0'),
(31, '7509546063461', 'Desodorante aerosol', 'Lady Speed Stick cool aqua', '60', 40, 5, '2024-06-01', '0'),
(32, '7509546076300', 'Desodorante aerosol', 'Lady Speed Stick Dynamic', '60', 40, 2, '2024-05-01', '0'),
(33, '7509546071909', 'Desodorante aerosol', 'Lady Speed Stick invisible', '60', 40, 3, '2023-12-01', '0'),
(34, '7506306213906', 'Desodorante Aerosol', 'Axe Ice Chill', '60', 40, 21, '2026-04-01', '0'),
(35, '7791293025780', 'Desodorante aerosol', 'Axe apollo', '60', 40, 7, '2026-05-01', '0'),
(36, '7506306226739', 'Desodorante aerosol', 'Axe Conviction', '60', 40, 23, '2026-03-01', '0'),
(37, '7506306226852', 'Desodorante aerosol', 'axe anarchy', '60', 40, 5, '2026-04-01', '0'),
(38, '7506306209855', 'Desodoranteaerosol', 'axe anarchy flower', '60', 40, 5, '2026-03-01', '0'),
(39, '7791293037806', 'Desodorante aerosol', 'Rexona Marine', '60', 40, 12, '2025-04-01', '0'),
(40, '7791293037790', 'Desodorante Aerosol', 'Rexona Forest', '60', 40, 12, '2025-04-01', '0'),
(41, '7791293025537', 'Desodorante Aerosol', 'Rexona Antibacterial Proteccion', '60', 40, 12, '2026-01-01', '0'),
(42, '7506306244184', 'Desodorante Aerosol', 'Rexona Antibacterial Invisible', '60', 40, 12, '2026-04-01', '0'),
(43, '7791293032429', 'Des ae', 'Rexona Happy morning', '60', 40, 12, '2026-03-01', '0'),
(44, '7791293036045', 'Des ae', 'Rexona toronja', '60', 40, 12, '2026-05-01', '0'),
(45, '7506306241176', 'Des ae', 'Dove invisible dry', '60', 40, 10, '2025-10-01', '0'),
(46, '7506306241190', 'Des ae', 'Dove coco', '60', 40, 6, '2026-04-01', '0'),
(47, '7506306241183', 'Des ae', 'Dove original', '60', 40, 16, '2026-03-01', '0'),
(48, '7791293032436', 'Des Ae', 'Rexona power dry', '60', 40, 6, '2024-12-01', '0'),
(49, '7506306241152', 'Des Ae', 'Dove dermoaclarante', '60', 40, 1, '2024-12-01', '0'),
(50, '7500435186674', 'Des ae', 'Old Spice Adventure', '60', 40, 2, '2024-03-05', '0'),
(51, '7506339349146', 'Des ae', 'Old Spice Wolfthorn', '60', 40, 2, '2024-06-07', '0'),
(52, '7502221187599', 'Des ae', 'Brut classic', '56', 36, 24, '2025-04-01', '0'),
(53, '7791293022598', 'Des ae', 'Rexona Active Dry', '60', 40, 13, '2026-03-01', '0'),
(54, '7500435129312', 'Des ae', 'Secret Lavender', '58', 40, 1, '2024-03-03', '0'),
(55, '7500435180665', 'Des ae', 'Secret Orange Blossom', '58', 40, 2, '2024-05-11', '0'),
(56, '4005808829675', 'Des ae', 'Nivea Aclarado Natural', '60', 40, 13, '2024-07-01', '0'),
(57, '7500435170086', 'Des barra', 'Secret Orange Blossom', '50', 35, 8, '2023-08-01', '0'),
(58, '4005900036711', 'Des ae', 'Nivea Black & White Invisible 150ml', '60', 40, 24, '2026-02-01', '0'),
(59, '4005900376459', 'Des ae', 'Nivea B&N Fresh', '60', 40, 14, '2025-08-01', '0'),
(60, '4005900728173', 'Des ae', 'Nivea B&N Ultimate Impact', '60', 40, 8, '2026-02-01', '0'),
(61, '4005900618979', 'Des ae', 'Nivea B&W Efecto Satín', '60', 40, 6, '2026-01-01', '0'),
(62, '4005900081087', 'Des ae', 'Nivea Tono Natural', '60', 40, 12, '2026-01-01', '0'),
(63, '4005808837311', 'Des ae', 'Nivea Pearl & Beauty', '60', 40, 20, '2026-02-01', '0'),
(64, '4005900515889', 'Des roll', 'Nivea Fresh Ice', '36', 22, 14, NULL, '0'),
(65, '4005808306053', 'Des roll', 'Nivea Silver Protect', '36', 22, 11, NULL, '0'),
(66, '7501027272706', 'Des roll', 'Obao Floral', '33', 22, 14, '2025-11-01', '0'),
(67, '7501027278487', 'Des roll', 'Obao Suave', '33', 22, 1, '2025-06-01', '0'),
(68, '7500435141840', 'Des Barra', 'Old Spice Mar Profundo', '55', 35, 24, '2025-03-01', '0'),
(69, '7501001163983', 'Des barra', 'Old Spice Fresh', '55', 35, 61, '2024-08-01', '0'),
(70, '7506339390230', 'Des barra', 'Old Spice Leña', '55', 35, 7, '2024-07-01', '0'),
(71, '7509552906158', 'Des roll', 'Obao Fresquísima', '33', 22, 5, '2026-01-01', '0'),
(72, '7501839107852', 'Des roll', 'Obao Bamboo', '33', 22, 2, '2024-07-01', '0'),
(73, '7509552844832', 'Des roll', 'Obao Ritual Natural', '33', 22, 15, '2024-01-01', '0'),
(74, '7501027286017', 'Des roll', 'Obao Men Classic', '33', 22, 4, '2025-11-01', '0'),
(75, '7509552839012', 'Des roll', 'Miss Obao Sexy', '33', 22, 7, '2025-10-01', '0'),
(76, '7509552780970', 'Des roll', 'Obao Tatto', '33', 22, 5, '2025-10-01', '0'),
(77, '7501027254436', 'Des roll', 'Obao Intensa', '33', 22, 2, '2026-01-01', '0'),
(78, '7501027250612', 'Des roll', 'Obao Piel Delicada', '33', 22, 3, '2025-11-01', '0'),
(79, '7509552844634', 'Des roll', 'Obao Men Tatto', '33', 22, 1, '2026-01-01', '0'),
(80, '7501027286024', 'Des roll', 'Obao Active', '33', 22, 1, '2026-03-01', '0'),
(81, '4005808837359', 'Des roll', 'Nivea Pearl & Beauty', '36', 23, 10, NULL, '0'),
(82, '7501054526131', 'Des roll', 'Nivea Tono Natural Efecto Satín', '36', 23, 21, '2025-09-01', '0'),
(84, '4005808837472', 'Des roll', 'Nivea Tono Natural Classic Touch', '36', 23, 5, '2025-11-01', '0'),
(85, '022200004909', 'Des barra', 'Speed Stick Power Fresh', '55', 40, 5, '2024-02-01', '0'),
(86, '75062910', 'Des barra', 'Rexona Active Motion', '50', 35, 7, '2025-06-01', '0'),
(87, '75062927', 'Des barra', 'Rexona Power Dry', '50', 35, 4, '2026-02-01', '0'),
(88, '75062798', 'Des barra', 'Rexona Tono Perfecto', '50', 35, 6, '2026-06-01', '0'),
(89, '75062897', 'Des Barra', 'Rexona Bamboo & Aloe Vera', '50', 35, 6, '2026-03-01', '0'),
(90, '75062941', 'Des barra', 'Rexona Antibacterial Invisible', '50', 35, 3, '2025-06-01', '0'),
(91, '7500435169998', 'Des Barra', 'Secret Rose', '50', 35, 5, '2025-02-01', '0'),
(92, '7500435129367', 'Des barra', 'Secret Balanced Lavender', '50', 35, 5, '2025-02-01', '0'),
(93, '7500435129350', 'Des barra', 'Secret Jasmine', '50', 35, 2, '2024-03-01', '0'),
(94, '7509546029825', 'Des roll', 'Palmolive Neutro Balance', '40', 25, 1, '2024-06-01', '0'),
(95, '75076221', 'Des barra', 'Axe Epic Fresh', '50', 34, 12, '2026-06-01', '0'),
(96, '75076238', 'Des barra', 'Axe Apollo', '50', 34, 11, '2026-04-01', '0'),
(97, '75076276', 'Des barra', 'Axe Fusion', '50', 34, 6, '2026-06-01', '0'),
(98, '75076245', 'Des barra', 'Axe Collision', '50', 34, 6, '2026-01-01', '0'),
(99, '75076252', 'Des barra', 'Axe Dark Temptation', '50', 34, 6, '2026-03-01', '0'),
(100, '75076351', 'Des barra', 'Rexona Forest', '50', 34, 6, '2026-02-01', '0'),
(101, '75076382', 'Des barra', 'Rexona Active Dry', '50', 34, 6, '2026-04-01', '0'),
(102, '75076313', 'Des barra', 'Rexona Xtra Cool', '50', 34, 12, '2026-04-01', '0'),
(103, '75076368', 'Des barra', 'Rexona Sport', '50', 34, 6, '2025-04-01', '0'),
(104, '75076375', 'Des barra', 'Rexona Antibacterial Protection', '50', 34, 12, '2026-04-01', '0'),
(105, '7506267905186', 'Jabón mano', 'Blumen Coconut', '27', 20, 6, '2025-04-01', '0'),
(106, '7506267905131', 'Jabón mano', 'Blumen Cherry', '27', 20, 4, '2025-05-03', '0'),
(107, '06667452', 'Perfume', 'Avon 300 km/h', '100', 90, 2, '2026-04-01', '0'),
(108, '650240035401', 'Jabón', 'Asepxia Carón Detox', '48', 35, 3, '2023-08-01', '0'),
(109, '650240036965', 'Jabón', 'Asepxia Bicarbonato de Sodio', '48', 35, 7, '2025-02-01', '0'),
(110, '650240020568', 'Jabón', 'Asepxia Exfoliante', '48', 35, 4, '2024-04-01', '0'),
(111, '650240029479', 'Jabón', 'Asepxia Azufre', '48', 35, 1, '2025-01-01', '0'),
(112, '650240033766', 'Jabón', 'Asepxia Ing. Humectantes', '48', 35, 2, '2025-02-01', '0'),
(113, '7501026006616', 'Jabón', 'Rosa Venus', '20', 12, 12, NULL, '0'),
(114, '7506425606900', 'Jabón Corporal', 'Escudo Antibacterial', '20', 12, 18, NULL, '0'),
(115, '7509546074627', 'Jabón', 'Palmolive Sensasión Humectante', '20', 12, 11, '2023-11-01', '0'),
(116, '7509546074696', 'Jabón', 'Palmolive Suavidad Exfoliante', '20', 12, 2, '2023-12-01', '0'),
(117, '7509546074702', 'Jabón', 'Palmolive Delicada Exfoliación', '20', 12, 2, '2023-11-01', '0'),
(118, '7509546074726', 'Jabón', 'Suavidad Radiante', '17', 12, 4, '2023-10-01', '0'),
(119, '7509546074672', 'Jabón', 'Palmolive Fusión Nutritiva', '20', 12, 1, '2023-12-01', '0'),
(120, '7509546074665', 'Jabón', 'Palmolive Sensación Nutritiva', '20', 12, 8, NULL, '0'),
(121, '7509546074658', 'Jabón', 'Palmolive Suavidad Relajante', '20', 12, 12, '2024-01-01', '0'),
(122, '7509546080253', 'Jabón', 'Palmolive Sensación Humectante 100g', '13', 10, -1, NULL, '0'),
(123, '067238891190', 'Jabón', 'Dove Original', '26', 20, 28, '2024-05-01', '0'),
(124, '7501022182796', 'Jabón', 'Grisi Neutro ', '22', 18, 35, NULL, '0'),
(125, '7501943450103', 'Jabón barra', 'Huggies Sueños Lavanda', '25', 20, 25, NULL, '0'),
(126, '7501022105283', 'Jabón Bebe', 'Ricitos de Oro', '25', 15, 12, NULL, '0'),
(127, '7891150069091', 'Jabón bebe', 'Dove Humectación Enriquecida', '25', 15, 2, NULL, '0'),
(128, '7501022105344', 'Jabón bebe', 'Ricitos de Oro Lavanda y Lechuga', '25', 15, 11, NULL, '0'),
(129, '7506425603404', 'Toallitas Hu.', 'Escudo Antibacterial', '35', 25, 4, NULL, '0'),
(130, '7502254360006', 'Repelente ae', 'Bye Bites Active', '90', 70, 1, '2024-10-01', '0'),
(131, '7501032918392', 'Repelente crema', 'Off!', '90', 66, 47, '2024-07-07', '0'),
(132, '7501791655316', 'Aromatizante ae', 'Graeat Value Lavanda', '45', 35, 7, '2024-08-01', '0'),
(133, '7506495002961', 'Aromatizante ae', 'Great Value Destellos Azules', '45', 35, 9, '2024-08-01', '0'),
(134, '75062811', 'Des barra', 'Dove Tono Uniforme Rosas', '50', 35, 3, '2026-05-01', '0'),
(135, '75062828', 'Des barra', 'Dove Tono Uniforme Aceite', '50', 35, 3, '2026-04-01', '0'),
(136, '650240025839', 'Shampoo Íntimo', 'Lomecan Ultra Fresh', '80', 70, 10, NULL, '0'),
(137, '7909189135561', 'Gel Íntimo', 'Avon Simply Delicate', '50', 40, 1, NULL, '0'),
(138, '7909189135974', 'Gel Íntimo', 'Avon Simply Active', '50', 40, 3, NULL, '0'),
(139, '7500525160645', 'Cottonete ', 'Quality Day', '22', 18, 16, '2027-06-01', '0'),
(140, '7500435197984', 'Pasta den', 'Crest 50ml', '20', 15, 27, '2025-12-01', '0'),
(141, '7509546072272', 'Pasta den', 'Colgate Kids Fresa', '25', 17, 49, '2025-11-01', '0'),
(142, '7500435122603', 'Pasta den', 'Crest Star Wars', '25', 17, 3, '2024-03-01', '0'),
(143, '7509546681511', 'Pasta den', 'Colgate Luminous White Instant', '45', 40, 3, '2025-01-01', '0'),
(144, '7509546685298', 'Pasta den', 'Colgate Total 12 Carbón Activado', '40', 35, 2, '2025-01-01', '0'),
(145, '099176480310', 'Pasta den', 'Colgate Total 12 Clean Mint', '40', 35, 2, '2025-05-01', '0'),
(146, '7509546056111', 'Pasta den', 'Colgate Triple Accion Xtra', '35', 30, 17, '2025-02-01', '0'),
(147, '7509546000350', 'Pasta den', 'Colgate Triple Acción Original', '45', 40, 44, '2024-05-01', '0'),
(148, '7509546669007', 'Pasta den', 'Colgate Max Pro 160ml', '55', 45, 72, '2025-04-01', '0'),
(149, '7501943489196', 'Crema', 'Huggies Sueños Lavanda', '58', 35, 9, NULL, '0'),
(150, '7909189206520', 'Colonia', 'Marvel Avengers', '85', 75, 1, '2024-09-01', '0'),
(151, '7909189203598', 'Colonia', 'Dc Batman', '85', 75, 2, '2025-04-01', '0'),
(152, '7909189163595', 'Colonia', 'Avon Cars', '85', 75, 2, '2023-12-01', '0'),
(153, '7501082780468', 'Aceite bebe', 'Ettem 125ml', '28', 22, 4, NULL, '0'),
(154, '7502270360394', 'Aceite bebe', 'New Derma', '27', 22, 2, '2024-06-01', '0'),
(155, '7501035908246', 'Aceite bebe', 'Mennen', '40', 34, 6, '2024-10-01', '0'),
(156, '7500525095411', 'Shampoo', 'Disney Emoji Moras', '65', 50, 3, NULL, '0'),
(157, '7500525095404', 'Shampo', 'Dinsey Emoji Mora', '65', 50, 3, NULL, '0'),
(158, '7501082780475', 'Colonia', 'Ettern Baby', '27', 18, 2, NULL, '0'),
(159, '7506425607518', 'Crema', 'Kleen Bebé Manzanilla', '40', 30, 13, NULL, '0'),
(160, '7501943489219', 'Shampoo', 'Huggies Sueños de lavanda', '45', 35, 6, NULL, '0'),
(161, '7506425607501', 'Shampoo', 'Kleen Bebé Manzanilla', '40', 30, 15, NULL, '0'),
(162, '7506078919372', 'Shampoo', 'L\'Oréal Kids Manzanilla', '65', 45, 2, '2024-06-01', '0'),
(163, '7501022103166', 'Shampoo', 'Ricitos de Oros Manzanilla', '65', 50, 10, NULL, '0'),
(164, '7501022133118', 'Shampoo', 'Ricitos de Oro Lavanda & Lechuga', '65', 40, 1, NULL, '0'),
(165, '037836032660', 'Shampoo', 'Ricitos de Oro Neutro', '65', 40, 1, NULL, '0'),
(166, '7509546650708', 'Shampoo', 'Mennen Lavanda & Avena', '35', 25, 12, '2025-04-01', '0'),
(167, '7509546072050', 'Shampoo', 'Mennen Miel & Manzanilla', '35', 25, 15, '2025-02-01', '0'),
(168, '7501878710853', 'Shampoo', 'atm Kids Repele Piojos', '60', 50, 1, '2025-07-01', '0'),
(169, '037836033407', 'Shampoo', 'Grisi Kids Paw Patrol', '65', 40, 1, NULL, '0'),
(170, '7506267916519', 'Shampoo', 'Blumen 3 en 1', '48', 38, 1, '2023-12-01', '0'),
(171, '7506306222922', 'Spray p. Manos', 'Zest', '65', 55, 8, NULL, '0'),
(172, '7501199416885', 'Gel', 'Xtreme Princesa Kids', '25', 20, 4, '2023-05-25', '0'),
(173, '7502251481483', 'Spray cabello', 'Glitter Spray', '42', 32, 10, '2024-08-01', '0'),
(174, '7501017362950', 'Pañuelos', 'Kleenex', '7', 5, 15, NULL, '0'),
(175, '7909189276165', 'Colonia', 'Avon Unicornio', '65', 55, 1, '2025-12-01', '0'),
(176, '7909189239054', 'Colonia', 'Avon Minnie', '65', 55, 1, '2025-10-01', '0'),
(177, '7909189238682', 'Colonia', 'Avon Stich', '65', 55, 2, '2025-09-01', '0'),
(178, '7501056340124', ' Crema p. Peinar', 'Sedal Brillo Ceram.', '45', 35, 23, '2024-04-01', '0'),
(179, '7506306234062', 'Crema p. Peinar', 'Sedal Hidratación Anti-Nudos', '45', 35, 12, '2026-04-01', '0'),
(180, '7506306311152', 'Crema p. Peinar', 'Sedal Brillo y Suavidad', '45', 38, 10, '2026-04-01', '0'),
(181, '7501056340117', 'Crema p. Peinar', 'Sedal Liso Perfecto', '45', 38, 12, '2026-04-01', '0'),
(182, '7500435169035', 'Espuma', 'Herbal Essences Cabello Rizo', '60', 50, 12, '2026-03-01', '0'),
(183, '7500435169004', 'Espuma', 'Herbal Essences Ondas Perfectas', '60', 50, 12, '2026-02-01', '0'),
(184, '7500435168991', 'Espuma', 'Herbal Essences Extra Control', '60', 50, 12, '2026-02-01', '0'),
(185, '7509546058986', 'Spray', 'Caprice Kiwi y Lavanda', '54', 40, 2, '2024-09-01', '0'),
(186, '7509546058962', 'Spray', 'Caprice Sábila', '54', 40, 19, '2024-12-01', '0'),
(187, '7509546058979', 'Spray', 'Caprice Algas', '54', 40, 5, '2024-11-01', '0'),
(188, '7509546058955', 'Spary', 'Caprice Fuerza Acti-Ceramidas', '54', 40, 12, '2024-04-01', '0'),
(189, '7501001303549', 'Crema p. Peinar', 'Pantene Control Caida', '63', 58, 2, '2025-03-08', '0'),
(190, '7502245720062', 'Aceite cab', 'Silk Hair Naranja', '50', 33, 4, '2024-01-01', '0'),
(191, '7502245720079', 'Aceite cab', 'Silk Hair Uva', '50', 33, 4, '2024-01-01', '0'),
(192, '759684154140', 'Gel antiséptico', 'Jaloma Citrico', '25', 20, 6, '2024-02-01', '0'),
(193, '7506267907388', 'Shampoo', 'Animal Planet PETS', '50', 40, 3, '2025-06-24', '0'),
(194, '7501438311124', 'Gel p. Cabello', 'Moco de Gorila', '54', 40, 11, '2026-04-01', '0'),
(195, '7501438326388', 'CeraGel', 'Punky Junky Asp Húmedo', '56', 56, 3, '2026-04-01', '0'),
(196, '7506192503358', 'Gel', 'Ego Magnetic', '20', 14, 10, NULL, '0'),
(197, '7506306248359', 'Gel', 'Ego Black', '46', 39, 14, NULL, '0'),
(198, '7909189175741', 'Crema p. Manos', 'Avon Lavanda', '30', 25, 1, NULL, '0'),
(199, '7909189135868', 'Crema p. Manos', 'Avon Agua de Rosas', '30', 25, 1, NULL, '0'),
(200, '7909189207800', 'Crema p. Manos', 'Avon Árbol de Te', '30', 35, 1, NULL, '0'),
(201, '7909189192755', 'Crema p. Manos', 'Avon Macadamia', '30', 25, 1, NULL, '0'),
(202, '7909189087563', 'Crema p. Manos', 'Avon Almendras', '30', 25, 1, NULL, '0'),
(203, '7909189193202', 'Crema p. Manos', 'Avon Aceite de Oliva', '30', 25, 2, NULL, '0'),
(204, '7501058743121', 'Cera Calzado', 'Nugget Negro', '18', 15, 3, NULL, '0'),
(205, '7501056326173', 'Crema p. Piel', 'Pond\'S Nutritiva', '95', 80, 4, '2025-02-01', '0'),
(206, '4005900708298', 'Crema corp', 'Nivea Aloe', '80', 60, 1, NULL, '0'),
(207, '7501054504535', 'Crema corp', 'Nivea Milk Nutritiva', '80', 60, 11, NULL, '0'),
(208, '7501007528427', 'Crema corp', 'Lubriderm Repar. Intensiva', '105', 85, 2, NULL, '0'),
(209, '7909189096770', 'Loción corp', 'Avon Jalea Real 1LT', '100', 85, 1, '2024-12-01', '0'),
(210, '7909189175727', 'Loción corp', 'Avon Lavanda 1LT', '100', 85, 1, '2024-11-01', '0'),
(211, '7909189207787', 'Loción corp', 'Avon Arb de Té 1Lt', '100', 85, 2, '2024-09-01', '0'),
(212, '7909189087488', 'Loción corp', 'Avon Pepino y Sábila 1Lt', '100', 85, 1, '2024-11-01', '0'),
(213, '7909189087495', 'Loción corp', 'Avon Avena 1LT', '100', 85, 1, NULL, '0'),
(214, '7909189087310', 'Loción corp', 'Avon Coco 1LT', '100', 85, 1, '2024-11-01', '0'),
(215, '7501082721690', 'Crema hum', 'Nuvel Antioxidantes', '40', 25, 2, NULL, '0'),
(216, '7501082721713', 'Crema hum', 'Nuvel Aceite de Coco', '45', 25, 3, NULL, '0'),
(217, '7909189193080', 'Loción corp', 'Avón Aceite de Oliva 1Lt', '100', 85, 1, NULL, '0'),
(218, '7909189159215', 'Loción corp', 'Avon Aguacate 1LT', '100', 85, 1, NULL, '0'),
(219, '7909189087532', 'Crema p. Manos', 'Avon Silicona', '30', 25, 1, NULL, '0'),
(220, '7909189192748', 'Crema Multiuso', 'Avon de Macadamia', '100', 80, 1, NULL, '0'),
(221, '7500435162241', 'Shampoo', 'Head & Shoulder Suave y Manejable', '110', 94, 7, NULL, '0'),
(222, '7500435161619', 'Shampoo', 'Head & Shoulders Limpieza Profunda', '110', 85, 4, NULL, '0'),
(223, '7500435162005', 'Shampoo', 'Head & Shoulders Humectación', '110', 85, 3, '2026-04-03', '0'),
(224, '7500435161565', 'Shampoo', 'Head & Shoulders Alivio Refrescante', '110', 85, 4, '2025-11-11', '0'),
(225, '7500435161596', 'Shampoo', 'Head & Shoulders Purificación Capilar 650ml', '110', 85, 2, '2026-04-23', '0'),
(226, '7500435162913', 'Shampoo', 'Head & Shoulders Men 650ml', '110', 85, 2, '2026-02-11', '0'),
(227, '7500435162135', 'Shampoo', 'Head & Shoulders Manzana Fresh 650ml', '110', 85, 2, '2026-04-23', '0'),
(228, '7500435162586', 'Shampoo', 'Head & Shoulders con Cafeína 650ml', '110', 85, 3, '2026-04-21', '0'),
(229, '7500435019828', 'Shampoo', 'Head & Shoulders Suave y Manejable 375ml', '65', 50, 8, '2025-11-16', '0'),
(230, '7500435020008', 'Shampoo', 'Head & Shoulders Limpieza Ren 375ml', '65', 50, 10, '2025-11-09', '0'),
(231, '7500435019811', 'Shampoo', 'Head & Shoulders Suave y Manejable 180ml', '33', 23, 2, '2025-12-07', '0'),
(232, '7500435019958', 'Shampoo', 'Head & Shoulders Limpieza Ren 180ml', '33', 23, 1, '2026-01-16', '0'),
(233, '7506306221918', 'Shampoo', 'Sedal Control Caspa', '32', 26, 16, '2025-08-01', '0'),
(234, '7506306240087', 'Shampoo', 'Sedal Hidratación Anti-Nudos 190ml', '32', 23, 7, '2026-04-01', '0'),
(235, '7506306211650', 'Shampoo', 'Sedal Agua Micelar 190ml', '33', 23, 8, '2025-09-01', '0'),
(236, '7506192506557', 'Shampoo', 'Savile Limpieza Profunda', '25', 14, 12, '2026-05-01', '0'),
(237, '7500435193733', 'Shampoo', 'Herbal Essences Lavanda', '75', 60, 2, '2026-04-13', '0'),
(238, '7500435193788', 'Shampoo', 'Herbal Essences Granada 400ml', '75', 60, 4, '2026-04-11', '0'),
(239, '7500435193887', 'Shampoo', 'Herbal Esscences Té Verde & Menta', '75', 60, 2, '2026-04-10', '0'),
(240, '381519180743', 'Shampoo', 'Herbal Essences Manzanilla & Pasiflora', '75', 60, 2, '2026-04-13', '0'),
(241, '381519180736', 'Shampoo', 'Herbal Essences Rosa Mosqueta', '75', 60, 2, '2026-04-05', '0'),
(244, '7500435193832', 'Shampoo', 'Herbal Essences Mandarina', '75', 60, 2, '2026-04-21', '0'),
(245, '7509552900903', 'Shampoo', 'Garnier Fructis Stop Caida', '70', 60, 9, '2025-06-01', '0'),
(246, '7509552816266', 'Shampoo', 'Garnier Fructis Oil Coco', '70', 60, 6, '2026-03-01', '0'),
(247, '7509552849653', 'Shampoo', 'Garnier Aguacate', '70', 60, 8, '2026-02-01', '0'),
(248, '7509552830583', 'Shampoo', 'Garnier Aloe Hidra', '70', 60, 11, '2026-03-01', '0'),
(249, '7509552906455', 'Shampoo', 'Garnier Brillo Vitaminado', '70', 60, 6, '2026-03-01', '0'),
(250, '7509552909739', 'Shampoo', 'Garnier Stop Caida Naranja', '70', 60, 11, '2025-06-01', '0'),
(251, '7509552906509', 'Shampoo', 'Garnier Coco + Maracuyá', '70', 60, 10, '2025-12-01', '0'),
(252, '7509552914658', 'Shampoo', 'Garnier Rizos Coco', '70', 60, 2, '2026-03-01', '0'),
(253, '7509552836615', 'Shampoo', 'L\'Oréal Dream Long', '100', 60, 2, '2026-01-01', '0'),
(254, '7509552817362', 'Shampoo', 'L\'Oréal Óleo Extraordinario', '100', 60, 2, '2025-12-01', '0'),
(255, '7509552817348', 'Shampoo', 'L\'Oréal Reparación Total 5', '100', 60, 4, '2026-02-01', '0'),
(256, '7509552845891', 'Shampoo', 'L\'Oréal Hidra Hialurónico', '100', 60, 2, '2026-02-01', '0'),
(257, '7501035919129', 'Shampoo', 'Palmolive Vital Keratina', '50', 38, 30, '2024-02-01', '0'),
(258, '75002794', 'Shampoo', 'Palmolive Vital Keratina 200ml', '32', 20, 6, '2025-04-01', '0'),
(259, '7506306246263', 'Shampoo', 'Sedal Crecimineto anti. ', '65', 45, 10, '2026-03-01', '0'),
(260, '7506306248199', 'Shampoo', 'Sedal Prebióticos + Biotina', '65', 45, 1, '2025-05-01', '0'),
(261, '7506306246843', 'Shampoo', 'Sedal Control Caspa', '65', 45, 12, '2026-03-01', '0'),
(262, '7506306246867', 'Shampoo', 'Sedal Brillo y Suavidad', '65', 45, 10, '2026-02-01', '0'),
(263, '7506306246256', 'Shampoo', 'Sedal Ceramidas', '65', 45, 12, '2026-05-01', '0'),
(264, '7506306246300', 'Shampoo', 'Sedal Restauración Ins.', '65', 45, 3, '2026-05-01', '0'),
(265, '7506306246829', 'Shampoo', 'Sedal Hidratación Frambuesa', '65', 45, 10, '2026-03-01', '0'),
(266, '7506306246232', 'Shampoo', 'Sedal Control Caída', '65', 45, 12, '2026-03-01', '0'),
(267, '7509546072425', 'Shampoo', 'Caprice Keratina + Aloe', '45', 35, 1, '2025-02-01', '0'),
(268, '7509546656434', 'Shampoo', 'Caprice Argán + Orquídea', '45', 35, 4, '2025-05-01', '0'),
(269, '7509546072364', 'Shampoo', 'Caprice Aceite Herbal', '47', 35, 13, '2025-04-01', '0'),
(270, '7509546072340', 'Shampoo', 'Caprice Manzana', '47', 35, 16, '2024-06-01', '0'),
(271, '7506306225602', 'Shampoo', 'Savilé Chile', '45', 35, 2, '2025-06-01', '0'),
(272, '7506192501057', 'Shampoo', 'Savilé Chile 750ml', '45', 35, 29, '2028-01-01', '0'),
(273, '7506306225572', 'Shampoo', 'Savilé Miel', '45', 35, 3, '2025-06-01', '0'),
(274, '7506306225565', 'Shampoo', 'Savilé Keratina', '45', 35, 4, '2025-06-01', '0'),
(275, '7506306249240', 'Shampoo', 'Savilé Keratina y Sábila 700ml', '45', 35, 12, '2026-04-01', '0'),
(276, '7506306249202', 'Shampo', 'Savilé Miel Y Sábila 700ml', '45', 35, 24, '2026-01-01', '0'),
(277, '7506306249226', 'Shampo', 'Savilé Biotina y Sábila 700ml', '45', 35, 12, '2026-01-01', '0'),
(278, '7506306249127', 'Shampoo', 'Savilé Leche de Coco', '45', 35, 12, '2026-04-01', '0'),
(279, '7506306249233', 'Shampoo', 'Savilé Colágeno y Sábila', '45', 35, 12, '2026-02-01', '0'),
(280, '7502229587032', 'Pintura Daly', 'Naranja Flourecente', '65', 55, 6, NULL, '0'),
(281, '7502229587063', 'Pinutra Daly', 'Rosa Flourescente', '65', 55, 6, NULL, '0'),
(282, '7502229587049', 'Pintura Daly', 'Amarillo Flourecente', '65', 55, 4, NULL, '0'),
(283, '7502229587025', 'Pintura Daly', 'Bugambilia Flourescente', '65', 55, 8, NULL, '0'),
(284, '7502229587087', 'Pintura Daly', 'Fiusha Flour', '65', 55, 8, NULL, '0'),
(285, '0001', 'Pintura Daly', 'Mandarina Flour 250ml', '65', 55, 2, NULL, '0'),
(286, '7502229583423', 'Pintura Daly', 'Verde Olivo', '50', 40, 2, NULL, '0'),
(287, '7502229583508', 'Pintura Daly', '137 Carne 250ml', '50', 40, 6, NULL, '0'),
(288, '0002', 'Pintura Daly', '110 Rosa Pastel 250 ml', '50', 40, 2, NULL, '0'),
(289, '7502229583416', 'Pintura Daly', '128 Verde Bandera 250ml', '50', 40, 12, NULL, '0'),
(290, '0003', 'Pintura Daly', '118 Lila 250ml', '50', 40, 5, NULL, '0'),
(291, '0004', 'Pintura Daly', '103 A. Napolitano 250ml', '50', 40, 8, NULL, '0'),
(292, '0005', 'Pintura Daly', '115 Rojo Cerezaa 250ml', '50', 40, 4, NULL, '0'),
(293, '0006', 'Pintura Daly', '104 Amarillo Mango 250ml', '50', 40, 4, NULL, '0'),
(294, '7501017376322', 'Papel Higiénico', 'Paquete Vogue', '34', 27, 31, NULL, '0'),
(295, '7506425628094', 'Toalla Fem', 'Caja Kotex Prot. Ava', '110', 80, 1, NULL, '0'),
(296, '7506425628070', 'Toalla Fem', 'Caja Kotex 70pz', '100', 80, 5, NULL, '0'),
(297, '7501019040788', 'Toalla Fem', 'Caja Saba Reg 60pz', '100', 80, 3, NULL, '0'),
(298, '7501943490529', 'Toalla Fem', '36 pz Kotex Naturals', '55', 45, 1, NULL, '0'),
(299, '7501943431089', 'Toalla Fem', 'Kotex 44 pz', '30', 25, 5, NULL, '0'),
(300, '1001', 'Papel Hig', 'Pieza Vugue', '9', 7, 124, NULL, '0'),
(301, '7501019006623', 'Toalla fem', 'Saba buenas nch 8 pz', '25', 20, 59, NULL, '0'),
(302, '7501019068416', 'Toalla fem', 'Saba Regular 16pz', '16', 12, 1, NULL, '0'),
(303, '7501019034084', 'Toalla fem', 'Saba diario 24pz', '19', 14, 1, NULL, '0'),
(304, '7501019030130', 'Toalla fem', 'Saba regular 24pz', '19', 14, 4, NULL, '0'),
(305, '7501019007606', 'Toalla fem', 'Saba Nocturna 8 pz', '22', 18, 2, NULL, '0'),
(306, '7501943432475', 'Toalla fem', 'Kotex Largo 14pz', '14', 9, 3, NULL, '0'),
(307, '7501943432451', 'Toalla fem', 'Kotex Rosa 14pz', '14', 9, 5, NULL, '0'),
(308, '7501943424609', 'Toalla fem', 'Kotex Anat 10pz', '19', 15, 4, NULL, '0'),
(309, '7506195158739', 'Toalla fem', 'Naturella Regular 8pz', '20', 15, 6, NULL, '0'),
(310, '7500435157964', 'Toalla fem', 'Naturella Invisible 8pz', '20', 15, 8, NULL, '0'),
(311, '7899026462533', 'Tinte', 'Garnier 1.0 Negro Int', '60', 50, 12, '2026-05-01', '0'),
(312, '3614229721706', 'Tinte ', 'Koleston 21 Nch Brillante', '65', 55, 1, '2023-05-01', '0'),
(313, '3614225108754', 'Tinte', 'Koleston #46', '65', 55, 26, NULL, '0'),
(314, '3614225109041', 'Tinte', 'Koleston #4446', '65', 55, 7, '2023-10-01', '0'),
(315, '3614225108747', 'Tinte', 'Koleston #40', '65', 55, 23, '2023-08-01', '0'),
(316, '3614225108785', 'Tinte', 'Koleston #50', '65', 55, 12, '2023-10-01', '0'),
(317, '3614225108990', 'Tinte', 'Koleston #5546', '65', 55, 1, '2023-10-01', '0'),
(318, '3614225108839', 'Tinte', 'Koleston #60', '65', 55, 10, '2023-08-01', '0'),
(319, '3614225108792', 'Tinte', 'Koleston #537', '65', 55, 6, '2023-08-01', '0'),
(320, '3614225108723', 'Tinte', 'Koleston #30', '65', 55, 24, '2025-09-01', '0'),
(321, '3614225108709', 'Tinte', 'Koleston #20', '65', 55, 24, '2026-03-01', '0'),
(322, '7501102614322', 'Pegamento', 'Kola Loka Brocha', '28', 22, 6, NULL, '0'),
(323, '7501102610003', 'Pegamento', 'Kola Loka', '28', 22, 10, '2023-12-01', '0'),
(324, '7501943471900', 'Toallitas hum', 'Kleen Bebé 120pz', '32', 22, 94, NULL, '0'),
(325, '3014260802189', 'Cepillo', 'Oral-B Complete', '25', 20, 59, NULL, '0'),
(326, '7506235701079', 'Foco', 'JWJ 85W', '200', 150, 20, NULL, '0'),
(327, '7501019047695', 'Toalla fem', 'Saba Regular 120pz', '85', 75, 1, '2025-07-01', '0'),
(328, '75003463', 'Gerber', 'Frutas Mixtas', '16', 12, 4, '2026-10-01', '0'),
(329, '75003487', 'Gerber', 'Mango', '16', 12, 4, '2024-10-01', '0'),
(330, '5000267014203', 'Whisky', 'Red Label ', '300', 250, 1, NULL, '0'),
(331, '5000281003160', 'Whisky', 'Grand Old Parr', '800', 700, 1, NULL, '0'),
(332, '7501003696397', 'Whisky', 'Passport Scotch', '220', 180, 1, NULL, '0'),
(333, '7506475106924', 'Fórmula', 'Nan 2', '155', 145, 3, '2923-08-31', '0'),
(334, '7501058625205', 'Fórmula', 'Nan 3', '117', 105, 1, '2023-04-30', '0'),
(335, '7506475106917', 'Fórmula', 'Nan 1', '165', 152, 5, '2024-01-31', '0'),
(336, '7506240646419', 'Pila AA', 'Volteck', '16', 12, 41, NULL, '0'),
(337, '7506240646426', 'Pila AAA', 'Volteck', '16', 12, 44, NULL, '0'),
(338, '75071295', 'Cigarro', 'Caja Pall Mall 20pz', '90', 75, 13, NULL, '0'),
(339, '75001322', 'Cigarro', 'Marlboro Caja 20pz', '90', 75, 20, NULL, '0'),
(340, '7501159580359', 'Paracetamol', '500 mg', '20', 15, 10, '2024-09-01', '0'),
(341, '7501342800820', 'Paracetaml', 'Temperal 500mg', '20', 15, 5, '2024-09-01', '0'),
(342, '7501086106899', 'Encendedor', '', '10', 8, 17, NULL, '0'),
(343, '7502213341367', 'Alcohol', 'Purex 125ml', '15', 10, 1, NULL, '0'),
(344, '7453038473064', 'Baraja', 'Española', '25', 20, 14, NULL, '0'),
(345, '7503015938069', 'Alcohol', '350ml', '25', 20, 20, NULL, '0'),
(346, '753015938076', 'Alcohol', '200ml', '16', 12, 19, NULL, '0'),
(347, '6936363384188', 'Marcador', 'de billetes falsos', '25', 20, 2, NULL, '0'),
(348, '7501428708835', 'Marcador', 'Razor de billetes falsos', '25', 20, 3, NULL, '0'),
(349, '7506235701031', 'Foco', 'JWJ 28W', '60', 48, 13, NULL, '0'),
(350, '606110104487', 'Foco', 'Boomer 80W', '30', 35, 10, NULL, '0'),
(351, '7506198003050', 'Foco', 'High Power', '45', 35, 8, NULL, '0'),
(352, '7501206664872', 'Fusible', 'Volteck', '15', 12, 18, NULL, '0'),
(353, '7501206664858', 'Fusible', 'Volteck Reforzado', '15', 12, 10, NULL, '0'),
(354, '7501206626610', 'Cinta de aislar', 'Pretul 19mm x 9m', '16', 12, 3, NULL, '0'),
(355, '7501206626627', 'Cinta de aislar', 'Pretul 19mm x 18m', '22', 16, 16, NULL, '0'),
(356, '7502239095077', 'Cinta de aislar', 'Aksi 19mm x 18m', '25', 20, 10, NULL, '0'),
(357, '7500435144483', 'Cepillo', '3 Pack', '30', 20, 13, NULL, '0'),
(358, '7702010631207', 'Cepillo', 'Colgate 2 pack', '36', 25, 4, NULL, '0'),
(359, '7501006711387', 'Cepillo', 'Mediano Pro', '25', 18, 51, NULL, '0'),
(360, '7702010631191', 'Cepillo', 'Colgate Medio', '17', 12, 25, NULL, '0'),
(361, '7509546055121', 'Cepillo', 'Colgate 360° Medio', '30', 26, 12, NULL, '0'),
(362, '7501061812227', 'Cepillo', 'Shoprins Niño', '25', 20, 3, NULL, '0'),
(363, '7501061812210', 'Cepillo', 'Gusanito Doraldent', '23', 18, 2, NULL, '0'),
(364, '7501061811237', 'Cepillo', 'Doraldent El Chavo', '18', 15, 7, NULL, '0'),
(365, '070942004428', 'Cepillo', 'Barbie GUM', '40', 35, 2, NULL, '0'),
(366, '7501061812302', 'Cepillo', 'Doraldent Shoppies', '20', 16, 4, NULL, '0'),
(367, '013117019926', 'Pañales', 'bbTips Talla 1 cont.40', '140', 120, 10, NULL, '0'),
(368, '013117000689', 'Pañales', 'bbTips Talla 2 cont.40', '170', 150, 10, NULL, '0'),
(369, '7501943434622', 'Pañales', 'Kleen Bebé Etapa 2', '170', 150, 20, NULL, '0'),
(370, '7501943498815', 'Pañales', 'Kleen Bebé RN Etapa 1', '140', 120, 6, NULL, '0'),
(371, '7501017372775', 'Pañales', 'Kleen Bebé Absorsec E 5 J', '189', 169, 2, NULL, '0'),
(372, '1002', 'Pañal', 'K Bebé E4 Grnd', '6', 3, 240, NULL, '0'),
(373, '1003', 'Pañal', 'k Bebé Etapa 5 J', '6', 4, 240, NULL, '0'),
(374, '1004', 'Pañal', 'K Bebé Etapa 6 XJ', '6', 4, 240, NULL, '0'),
(375, '1005', 'Pañales', 'K Bebé Etapa 4 G', '155', 140, 23, NULL, '0'),
(376, '013117040814', 'Pañales', 'bbTips RN', '70', 60, 3, NULL, '0'),
(377, '1006', 'Pañales', 'K Bebé Etapa Absorsec 6 XJ', '6', 4, 80, NULL, '0'),
(378, '1007', 'Pañales', 'K Bebé Absrc Etapa 4 G', '6', 4, 160, NULL, '0'),
(379, '1008', 'Pañales', 'K Bebé Suav Etapa 5 J ', '175', 155, 9, NULL, '0'),
(380, '1009', 'Pañal', 'K Bebé Comd Etapa 3 M', '6', 5, 160, NULL, '0'),
(381, '7506495006693', 'Pañales', 'Bebyto Talla Ch C.40', '135', 115, 1, NULL, '0'),
(382, '7506495006723', 'Pañales', 'Bebyto Talla J', '245', 220, 1, NULL, '0'),
(383, '013117000696', 'Pañales', 'bbTips Sens Talla 3 Mediano', '200', 180, 18, NULL, '0'),
(384, '013117000719', 'Pañales', 'bbTips Tlla 5 XG', '245', 225, 2, NULL, '0'),
(385, '7506495006709', 'Pañales', 'Bebyto Talla M', '155', 135, 6, NULL, '0'),
(386, '7501032900175', 'Raid', 'Raidolitos', '21', 17.5, 3, NULL, '0'),
(387, '7591005574007', 'Raid', 'Raidolitos', '21', 17.5, 42, NULL, '0'),
(388, '7501032907495', 'Baygon', 'Poder Mortal', '58', 50, 33, NULL, '0'),
(389, '7501032925956', 'Raid', 'Casa Y Jardín', '68', 58, 19, NULL, '0'),
(390, '7506425606924', 'Jabón', 'Escudo Antibacterial', '20', 16.5, 5, NULL, '0'),
(391, '7501103300293', 'Esponja', 'T.TAiO', '17', 12, 4, NULL, '0'),
(392, '7501082780086', 'Vaselina', 'Ettem Baby', '25', 20, 1, NULL, '0'),
(393, '7501065628145', 'Pomada', 'De La Campana 35g', '30', 25, 4, NULL, '0'),
(394, '7501065628121', 'Pomada', 'de la Campana 19g', '20', 15, 2, NULL, '0'),
(395, '7501016802105', 'Pastilla des', 'Blasa Pino', '16', 12, 3, NULL, '0'),
(397, '3001', 'Cutter', 'Hengxingli', '25', 20, 1, NULL, '0'),
(398, '7501005110242', 'Maizena', 'Fécula de Maíz', '16', 12, 1, NULL, '0'),
(399, '759684901058', 'Bicarbonato', 'Jalona', '17', 12, 4, NULL, '0'),
(400, '7502258443682', 'Crema y Perfume', 'Cars', '100', 80, 5, '2025-08-01', '0'),
(401, '7502258443460', 'Crema y Perfume', 'Frozen II', '100', 80, 6, '2026-01-01', '0'),
(402, '740617298680', 'Memoria SD', 'Kingston 32 GB c/n adapatador', '160', 130, 7, NULL, '0'),
(403, '726798258262', 'Kingston', 'Micro SD 64GB sin adapt.', '200', 180, 3, NULL, '0'),
(404, '726798258255', 'Kingston', 'Micro SD 32 GB sin adapt.', '150', 130, 5, NULL, '0'),
(405, '7501044205404', 'Talco', 'Olormax 150g', '27', 22, 22, NULL, '0'),
(406, '7501044205411', 'Talco', 'Olormax Mint', '27', 22, 1, NULL, '0'),
(407, '7501044205428', 'Talco', 'Olormax Ice 150g', '27', 22, 3, NULL, '0'),
(408, '7501044205459', 'Talco', 'Olormax Ice 300g', '40', 34, 5, '2025-04-01', '0'),
(409, '7500525127631', 'Talco', 'Vitascom 300g', '40', 36, 3, '2024-12-31', '0'),
(410, '7501361113000', 'Talco', 'D-Dolex 300g', '40', 36, 19, NULL, '0'),
(411, '7501000911783', 'Sobre', 'Nescafé 14g', '12', 10, 29, NULL, '0'),
(412, '7501058629128', 'Sobre', 'Nescafé Cappuccino 20g', '11', 9, 3, NULL, '0'),
(413, '7501102652102', 'Resistol', 'Kole', '28', 22, 2, NULL, '0'),
(414, '7503032460093', 'Sobre', 'Zuko Horchata', '7', 5, 2, '2026-03-01', '0'),
(415, '7503032460062', 'Sobre', 'Zuko Jamaica', '7', 5, 7, '2026-03-01', '0'),
(416, '1005', 'Pañal', 'Suavelastic Etapa 6 XJ', '185', 165, 2, NULL, '0'),
(417, '011848330044', 'Chamoy', 'La Anita', '18', 13, 9, '2025-03-01', '0'),
(418, '7501003393067', 'Salsa', 'Búfalo 380g', '23', 18, 2, '2023-07-01', '0'),
(419, '7501003393050', 'Salsa', 'Búfalo 150g', '16', 12, 0, NULL, '0'),
(420, '7501023114932', 'Esponja', 'Scotch Brite', '17', 12, 4, NULL, '0'),
(421, '7501791612647', 'Saborizante', 'Vainilla', '18', 13, 5, '2024-07-01', '0'),
(422, '7503010473121', 'Papel alum', 'Alumex 50', '40', 30, 8, NULL, '0'),
(423, '7503010473107', 'Papel alum', 'Alumex 7.5', '18', 13, 22, NULL, '0'),
(424, '9750100612191', 'Papel alum', 'Chef M10', '15', 11, 1, NULL, '0'),
(425, '2001', 'Palillos', '\"El Chef\"', '12', 10, 2, NULL, '0'),
(426, '7503004327201', 'Palillos', 'Tarasquitos 800pz', '18', 16, 1, NULL, '0'),
(427, '7501045404400', 'Atún', 'El Dorado en Agua', '17', 14, 6, '2026-09-01', '0'),
(428, '7501017003167', 'Duraznos en almb', 'La Costeña', '60', 53, 3, '2026-02-27', '0'),
(429, '7501045403144', 'Atún', 'Dolores en Agua', '19', 15, 5, '2026-11-01', '0'),
(430, '7501045401423', 'Atún', 'Dolores cn Aceite', '19', 15, 5, '2027-03-01', '0'),
(431, '7501045403281', 'Sardinas', 'Dolores', '43', 38, 6, '2027-01-01', '0'),
(432, '097339000061', 'Sala', 'Valentina Etiqueta Negra', '20', 15, 24, '2028-03-01', '0'),
(433, '097339000054', 'Salsa', 'Valentina', '19', 14, 3, '2028-04-01', '0'),
(434, '097339000030', 'Salsa', 'Valentina 1Lt', '27', 20, 3, '2023-09-01', '0'),
(435, '7501052420172', 'Frijoles', 'La Sierra rfr', '18', 14, 2, '2024-01-01', '0'),
(436, '7501000658923', 'Galletas', 'Marias', '16', 13, 48, '2023-12-31', '0'),
(437, '7501069213811', 'Harina', 'Tres Estrellas', '40', 30, 11, '2023-11-29', '0'),
(438, '7501017006014', 'Rajas', 'La Costeña 105g', '11', 9, 36, '2026-07-01', '0'),
(439, '7501023318057', 'Chiles Chipotles', 'San Marcos', '12', 10, 30, '2025-06-01', '0'),
(440, '7501017005000', 'Enteros', 'La Costeña 220g', '16', 13, 6, '2026-02-01', '0'),
(441, '75002343', 'Aceite', '1-2-3', '56', 50, 6, '2025-04-01', '0'),
(442, '7501052476001', 'Rajas', 'Clemente Jacques 220g', '16', 13, 25, '2025-08-01', '0'),
(443, '7501008703441', 'Galleta', 'Mexicanas', '12', 10, 18, '2024-05-01', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket_venta`
--

CREATE TABLE `ticket_venta` (
  `ID_Venta` int(11) NOT NULL,
  `SubTotal` decimal(10,0) NOT NULL,
  `Total` decimal(10,0) NOT NULL,
  `FechaHoraVenta` datetime NOT NULL,
  `Vendedor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID_Usuario` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `correoElectronico` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `respuesta1` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_Usuario`, `Nombre`, `correoElectronico`, `Password`, `respuesta1`) VALUES
(1, 'Sergio', 'sergiokrpc13@gmail.com', 'pacs9908', 'xd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `ID_Venta` int(11) NOT NULL,
  `FechaVenta` timestamp NULL DEFAULT NULL,
  `Total` double DEFAULT NULL,
  `Vendedor` varchar(50) DEFAULT NULL,
  `Efectivo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`ID_Venta`, `FechaVenta`, `Total`, `Vendedor`, `Efectivo`) VALUES
(12, '2023-06-17 20:45:23', 60, 'admin', '100'),
(13, '2023-06-18 01:40:39', 60, 'Sergio', '60'),
(14, '2023-06-18 01:41:59', 50, 'Sergio', '50'),
(15, '2023-06-18 21:42:02', 66, 'admin', '66'),
(16, '2023-06-19 18:14:07', 75, 'admin', '75'),
(17, '2023-06-20 17:38:02', 170, 'admin', '170'),
(18, '2023-06-20 18:50:52', 143, 'admin', '143'),
(19, '2023-06-20 18:54:32', 80, 'admin', '80'),
(20, '2023-06-20 18:54:59', 22, 'admin', '22'),
(21, '2023-06-21 02:39:41', 245, 'admin', '245'),
(22, '2023-06-21 18:09:44', 60, 'admin', '60'),
(23, '2023-06-22 17:30:38', 25, 'Faustino', '25');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  ADD PRIMARY KEY (`ID_DetalleVenta`),
  ADD KEY `ID_Prod` (`ID_Prod`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`ID_Prod`);

--
-- Indices de la tabla `ticket_venta`
--
ALTER TABLE `ticket_venta`
  ADD PRIMARY KEY (`ID_Venta`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`ID_Venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  MODIFY `ID_DetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `ID_Prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=444;

--
-- AUTO_INCREMENT de la tabla `ticket_venta`
--
ALTER TABLE `ticket_venta`
  MODIFY `ID_Venta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `ID_Venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  ADD CONSTRAINT `detallesventa_ibfk_2` FOREIGN KEY (`ID_Prod`) REFERENCES `productos` (`ID_Prod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
