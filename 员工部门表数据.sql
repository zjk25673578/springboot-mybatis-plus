/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2019-01-10 13:54:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dno` int(8) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dno`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('10', '市场部', '503');
INSERT INTO `dept` VALUES ('20', '人事部', '506');
INSERT INTO `dept` VALUES ('30', '财务部', '505');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(8) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  `age` int(8) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` float(7,2) DEFAULT NULL,
  `comm` int(8) DEFAULT NULL,
  `dno` int(8) DEFAULT NULL,
  PRIMARY KEY (`empno`),
  KEY `fk_emp` (`dno`),
  CONSTRAINT `fk_emp` FOREIGN KEY (`dno`) REFERENCES `dept` (`dno`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('91', 'Tom', '1', '25', '2019-01-09', '3000.00', '200', '10');
INSERT INTO `emp` VALUES ('92', 'Lily', '0', '26', '2018-10-16', '2000.00', '200', '20');
INSERT INTO `emp` VALUES ('93', 'Lucy', '0', '26', '2019-02-28', '5000.00', null, '20');
INSERT INTO `emp` VALUES ('94', 'Andy', '0', '22', '2015-07-15', '6000.00', null, '20');
INSERT INTO `emp` VALUES ('95', 'Honey', '1', '23', '2017-06-23', '8000.00', null, '20');
INSERT INTO `emp` VALUES ('96', 'Kity', '0', '21', '2016-08-19', '2000.00', null, '30');
INSERT INTO `emp` VALUES ('97', 'John', '1', '28', '2017-09-11', '2000.00', null, '30');
INSERT INTO `emp` VALUES ('98', 'White', '0', '37', '2018-06-20', '1000.00', '200', null);
INSERT INTO `emp` VALUES ('99', 'Wheel', '1', '33', '2018-11-29', '800.00', null, null);


