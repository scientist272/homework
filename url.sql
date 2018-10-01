/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : url

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 30/09/2018 16:46:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for url
-- ----------------------------
DROP TABLE IF EXISTS `url`;
CREATE TABLE `url`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `long_url` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `short_url` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `md5_key` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
