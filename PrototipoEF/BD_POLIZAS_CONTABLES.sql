SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_polizasC` DEFAULT CHARACTER SET utf8 ;
USE `bd_polizasC` ;


--
-- Estructura de tabla para la tabla `clasificacioncuenta`
--
CREATE TABLE IF NOT EXISTS `clasificacioncuenta` (
  `Codigo_clasificacion` varchar(100) NOT NULL,
  `Clasificacion_CuentaNombre` varchar(100) NOT NULL,
  `Descripcion_Clasificacion` varchar(100) NOT NULL,
  PRIMARY KEY (`Codigo_clasificacion`) 
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

--
-- Volcado de datos para la tabla `clasificacioncuenta`
--
INSERT INTO `clasificacioncuenta` (`Codigo_clasificacion`, `Clasificacion_CuentaNombre`, `Descripcion_Clasificacion`) VALUES
('A001', 'Activo Corriente', 'Activos que se movilizan en la empresa en un período menor o igual a un año.'),
('A002', 'Activo No Corriente', 'Activos que se movilizan en un período mayor a un año y menor a 3 años.'),
('R001', 'Resultados', 'Capital de la Empresa'),
('R002', 'Estado de Resultados', 'Resultados'),
('P001', 'Pasivo Corriente', 'Pasivos que se movilizan en un período menor a un año.'),
('P002', 'Pasivo No Corriente', 'Pasivos que circulan entre uno y tres años.');

--
-- Estructura de tabla para la tabla `cuentacontable`
--

CREATE TABLE IF NOT EXISTS `cuentacontable` (
  `Codigo_CuentaContable` varchar(50) NOT NULL,
  `Nombre_CuentaContable` varchar(100) NOT NULL,
  `Clasificacion_CuentaContable` varchar(50) NOT NULL,
  `Estado_CuentaContable` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Monto_CuentaContable` float NOT NULL,
  PRIMARY KEY (`Codigo_CuentaContable`),
  FOREIGN KEY (`Clasificacion_CuentaContable`) REFERENCES `clasificacioncuenta` (`Codigo_clasificacion`)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

--
-- Volcado de datos para la tabla `cuentacontable`
--
INSERT INTO `cuentacontable` (`Codigo_CuentaContable`, `Nombre_CuentaContable`, `Clasificacion_CuentaContable`, `Estado_CuentaContable`, `Monto_CuentaContable`) VALUES
('A001-Caja', 'Caja', 'A001', 'A', '15000'),
('A001-IVAPC', 'IVA por pagar', 'A001', 'A', '1000'),
('A002-Bancos', 'Bancos', 'A002', 'I', '8000'),
('A002-MOBYEQU', 'Mobiliario y Equipo', 'A002', 'A', '1200'),
('R001-Compras', 'Compras', 'R001', 'A', '9000'),
('P001-DOCPC', 'Documentos por Pagar', 'P001', 'A', '7800');

--
-- Estructura de tabla para la tabla `encabezadoPolizaC`
--

CREATE TABLE IF NOT EXISTS `encabezadoPolizaC` (
  `Codigo_PolizaC` varchar(50) NOT NULL,
  `Fecha_PolizaC` DATE NOT NULL,
  `Concepto_PolizaC` varchar(100) NOT NULL,
  PRIMARY KEY (`Codigo_PolizaC`)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

--
-- Estructura de tabla para la tabla `detallePolizaC`
--
CREATE TABLE IF NOT EXISTS `detallePolizaC` (
  `Codigo_PolizaC` varchar(50) NOT NULL,
  `Codigo_CuentaCD` varchar(50) NOT NULL,
  `Tipo_Cargo` varchar(25) NOT NULL,
  `valor` varchar(50) NOT NULL,
  PRIMARY KEY (`Codigo_CuentaCD`),
  FOREIGN KEY (`Codigo_CuentaCD`) REFERENCES `cuentacontable` (`Clasificacion_CuentaContable`),
  FOREIGN KEY (`Codigo_PolizaC`) REFERENCES `encabezadoPolizaC` (`Codigo_PolizaC`)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- ---------------------
-- PROCESOS ALMACENADOS
-- ---------------------
DELIMITER $$
USE `bd_polizasC`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `detallePolizaC`()
BEGIN 
select * from cuentacontable
   where Monto_CuentaContable>=1000;
END$$
DELIMITER ;

create table usuario(
id_usuario varchar(10),
username varchar (35),
password_u varchar (45)
)engine = InnoDB default charset =latin1;

INSERT INTO `umg`. `tbl_usuario`
VALUES
('1', 'nayredeleon', '5555');

CREATE TABLE bitacora_usuario(
id_bitacora int primary key auto_increment,
usuario varchar (35),  -- usuario de la base de datos
fecha datetime,
accion varchar (50)
)engine = InnoDB default charset =latin1;

registro_eliminado -- borrar
DELIMITER |
CREATE TRIGGER registro_eliminado after Insert on `cuentacontable`
for each row begin
insert into bitacora_usuario(usuario,fecha,accion) values (current_user(), now (),  'registro eliminado');
end

