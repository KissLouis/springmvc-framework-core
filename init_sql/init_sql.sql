/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.28 : Database - sys_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sys_blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sys_blog`;

/*Table structure for table `adm_user` */

DROP TABLE IF EXISTS `adm_user`;

CREATE TABLE `adm_user` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户编号,自增',
  `userImg` varchar(255) DEFAULT NULL COMMENT '管理员头像',
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名,即昵称',
  `passWord` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `userPhone` varchar(12) DEFAULT NULL COMMENT '手机号码',
  `creationDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `userStatus` int(1) DEFAULT NULL COMMENT '用户状态,(0 true,1 false,默认是0)',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `adm_user` */

insert  into `adm_user`(`userId`,`userImg`,`userName`,`passWord`,`userPhone`,`creationDate`,`userStatus`) values (1,NULL,'Louis','1',NULL,'2018-06-12 16:19:36',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
