/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-05-22 18:44:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for data_qlsmdygx
-- ----------------------------
DROP TABLE IF EXISTS `data_qlsmdygx`;
CREATE TABLE `data_qlsmdygx` (
  `id` int NOT NULL AUTO_INCREMENT,
  `one` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '物料',
  `two` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '物料描述',
  `three` varchar(255) DEFAULT NULL COMMENT '物料组',
  `four` varchar(255) DEFAULT NULL COMMENT '物料组描述',
  `five` varchar(255) DEFAULT NULL COMMENT '技术对象类型',
  `six` varchar(255) DEFAULT NULL COMMENT '对象类型文本',
  `seven` varchar(255) DEFAULT NULL COMMENT '大类',
  `eight` varchar(255) DEFAULT NULL COMMENT '资产细类编码',
  `nine` varchar(255) DEFAULT NULL COMMENT '资产细类描述',
  `ten` varchar(255) DEFAULT NULL COMMENT '资产层级',
  `eleven` varchar(255) DEFAULT NULL COMMENT '资产层级描述',
  `twelve` varchar(255) DEFAULT NULL COMMENT '对比',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='全量三码对应关系表';
