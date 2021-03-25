/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : yangShop

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 25/03/2021 08:13:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for DB_ATTR
-- ----------------------------
DROP TABLE IF EXISTS `DB_ATTR`;
CREATE TABLE `DB_ATTR` (
  `ATTR_ID` int NOT NULL AUTO_INCREMENT,
  `ATTR_NAME` varchar(255) DEFAULT NULL,
  `ATTR_TYPE` varchar(20) DEFAULT NULL,
  `ATTR_VALUE` varchar(255) DEFAULT NULL COMMENT '默认值',
  `CREATE_DATE` datetime DEFAULT NULL,
  `MOD_DATE` datetime DEFAULT NULL,
  `STATE` int DEFAULT NULL,
  PRIMARY KEY (`ATTR_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_ORD
-- ----------------------------
DROP TABLE IF EXISTS `DB_ORD`;
CREATE TABLE `DB_ORD` (
  `ORD_ID` int NOT NULL AUTO_INCREMENT,
  `USER_ID` int DEFAULT NULL,
  `PROD_ID` int DEFAULT NULL,
  `COUNT` int DEFAULT NULL,
  `REAL_PAY` decimal(10,2) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `STATE` int DEFAULT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_ORD_EXT
-- ----------------------------
DROP TABLE IF EXISTS `DB_ORD_EXT`;
CREATE TABLE `DB_ORD_EXT` (
  `ORD_ID` int DEFAULT NULL,
  `REMARKS` varchar(255) DEFAULT NULL COMMENT '用户下单时备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_PROD
-- ----------------------------
DROP TABLE IF EXISTS `DB_PROD`;
CREATE TABLE `DB_PROD` (
  `PROD_ID` int NOT NULL AUTO_INCREMENT,
  `PROD_NAME` varchar(255) DEFAULT NULL,
  `PROD_IMGS` varchar(255) DEFAULT NULL,
  `PROD_TYPE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `STATE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `MOD_DATE` datetime DEFAULT NULL,
  `PROD_DESC` varchar(255) DEFAULT NULL,
  `REMARKS` varchar(255) DEFAULT NULL,
  `EXT1` varchar(255) DEFAULT NULL,
  `EXT2` varchar(255) DEFAULT NULL,
  `EXT3` varchar(255) DEFAULT NULL,
  `OP_ID` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PROD_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_PROD_ATTR
-- ----------------------------
DROP TABLE IF EXISTS `DB_PROD_ATTR`;
CREATE TABLE `DB_PROD_ATTR` (
  `PROD_ID` int DEFAULT NULL,
  `ATTR_ID` int DEFAULT NULL,
  `ATTR_VALUE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_PROD_PRICE
-- ----------------------------
DROP TABLE IF EXISTS `DB_PROD_PRICE`;
CREATE TABLE `DB_PROD_PRICE` (
  `PROD_ID` int NOT NULL,
  `PRICE` decimal(10,2) NOT NULL,
  `DISCOUNT_PRICE` decimal(10,2) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `MOD_TIME` datetime DEFAULT NULL,
  `OP_ID` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_USER
-- ----------------------------
DROP TABLE IF EXISTS `DB_USER`;
CREATE TABLE `DB_USER` (
  `USER_ID` int NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `USER_NAME` varchar(20) DEFAULT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `BILL_ID` int DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `MOD_DATE` datetime DEFAULT NULL,
  `EXPIRE_DATE` datetime DEFAULT NULL,
  `OPEN_ID` varchar(100) DEFAULT NULL,
  `NICK_NAME` varchar(50) DEFAULT NULL,
  `HEAD_IMG_URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `REMARKS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `SEX` int DEFAULT NULL,
  `PROVINCE` varchar(50) DEFAULT NULL,
  `CITY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `COUNTRY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EXT1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EXT2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EXT3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DB_USER_ADDRESS
-- ----------------------------
DROP TABLE IF EXISTS `DB_USER_ADDRESS`;
CREATE TABLE `DB_USER_ADDRESS` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `USER_ID` int DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `BILL_ID` int DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `STATE` int DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `MOD_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
