/*
Navicat MySQL Data Transfer

Source Server         : LOCAL
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : kuebiko_db

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2023-03-17 05:02:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `properties`
-- ----------------------------
DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
  `id` bigint(20) NOT NULL,
  `application` varchar(255) DEFAULT NULL,
  `tkey` varchar(255) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `profile` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of properties
-- ----------------------------
INSERT INTO `properties` VALUES ('1', 'loan-app', 'test1', '1.1', 'local', 'nan');
INSERT INTO `properties` VALUES ('2', 'loan-app', 'jdbc.enabled', '1.1', 'local', 'true');
INSERT INTO `properties` VALUES ('3', 'loan-app', 'jdbc.enabled', '1.1', 'prod', 'Magic100');
INSERT INTO `properties` VALUES ('4', 'loan-app', 'app.name.frequency', '1.1', 'prod', '100');
INSERT INTO `properties` VALUES ('5', 'loan-app', 'spring.app.name', '1.1', 'prod', 'Technohunk Tech');
INSERT INTO `properties` VALUES ('6', 'loan-app', 'name.app', '1.1', 'prod', 'Nagendra Kumar at server');
