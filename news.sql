/*
SQLyog Community v12.3.3 (64 bit)
MySQL - 5.7.17-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `advance` */

DROP TABLE IF EXISTS `advance`;

CREATE TABLE `advance` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `approach_id` INT(11) NOT NULL,
  `isAdvance` INT(11) NOT NULL,
  `finance_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `advance` */

/*Table structure for table `agentcustomer` */

DROP TABLE IF EXISTS `agentcustomer`;

CREATE TABLE `agentcustomer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `contact_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `type` varchar(50) NOT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `contact_id` (`contact_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `agentcustomer_ibfk_1` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`),
  CONSTRAINT `agentcustomer_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `agentcustomer` */

insert  into `agentcustomer`(`id`,`user_id`,`contact_id`,`date`,`type`,`state`) values
(3,1,1,'2018-02-19','加拿大身份证',1),
(4,1,7,'2018-02-19','国内身份证',0);

/*Table structure for table `app` */

DROP TABLE IF EXISTS `app`;

CREATE TABLE `app` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `APP_name` varchar(50) NOT NULL,
  `APP_id` varchar(32) NOT NULL,
  `APP_pwd` varchar(50) NOT NULL,
  `APP_price` float(10,2) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `APPDate` date NOT NULL,
  `APP_service_type` varchar(50) NOT NULL,
  `Application` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `app_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `app` */

insert  into `app`(`id`,`APP_name`,`APP_id`,`APP_pwd`,`APP_price`,`user_id`,`APPDate`,`APP_service_type`,`Application`) values
(-1,'null','null','null',0.00,1,'2018-02-13','null',-1),
(1,'aaa','zhangsan','zhangsan',3000.00,1,'2020-12-30','不传苹果商城',0),
(2,'bbb','lisi','lisi',3500.00,2,'2021-12-30','传苹果商城',0),
(3,'ccc','wangwu','wangwu',3600.00,3,'2040-12-30','传苹果商城',0),
(4,'ddd','zhaoliu','zhaoliu',8000.00,4,'2050-12-30','不传苹果商城',0),
(5,'eee','tianqi','tianqi',3900.00,5,'2019-12-30','传苹果商城',0),
(6,'fff','wangba','wangba',3000.00,6,'2020-12-30','传苹果商城',0),
(7,'ggg','jiumei','jiumei',3000.00,7,'2020-12-30','不传苹果商城',0);

/*Table structure for table `authoritylist` */

DROP TABLE IF EXISTS `authoritylist`;

CREATE TABLE `authoritylist` (
  `roleId` int(11) NOT NULL,
  `authority_agwnt` varchar(20) DEFAULT NULL,
  `authority_gateway` varchar(20) DEFAULT NULL,
  `authority_report` varchar(20) DEFAULT NULL,
  `authority_system` varchar(20) DEFAULT NULL,
  `authority_configuration` varchar(20) DEFAULT NULL,
  `agwnt_1` varchar(20) DEFAULT NULL,
  `agwnt_2` varchar(20) DEFAULT NULL,
  `agwnt_3` varchar(20) DEFAULT NULL,
  `agwnt_4` varchar(20) DEFAULT NULL,
  `agwnt_5` varchar(20) DEFAULT NULL,
  `gateway_1` varchar(20) DEFAULT NULL,
  `report_1` varchar(20) DEFAULT NULL,
  `system_1` varchar(20) DEFAULT NULL,
  `system_2` varchar(20) DEFAULT NULL,
  `system_3` varchar(20) DEFAULT NULL,
  `system_4` varchar(20) DEFAULT NULL,
  `system_5` varchar(20) DEFAULT NULL,
  `configuration_1` varchar(20) DEFAULT NULL,
  `configuration_2` varchar(20) DEFAULT NULL,
  `configuration_3` varchar(20) DEFAULT NULL,
  `configuration_4` varchar(20) DEFAULT NULL,
  `configuration_5` varchar(20) DEFAULT NULL,
  `configuration_6` varchar(20) DEFAULT NULL,
  `configuration_7` varchar(20) DEFAULT NULL,
  `dateTime` date,
  `type` int not NULL,
  UNIQUE KEY `roleId` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `authoritylist` */

insert  into `authoritylist`(`roleId`,`authority_agwnt`,`authority_gateway`,`authority_report`,`authority_system`,`authority_configuration`,`agwnt_1`,`agwnt_2`,`agwnt_3`,`agwnt_4`,`agwnt_5`,`gateway_1`,`report_1`,`system_1`,`system_2`,`system_3`,`system_4`,`system_5`,`configuration_1`,`configuration_2`,`configuration_3`,`configuration_4`,`configuration_5`,`configuration_6`,`configuration_7`,`dateTime`,`type`) values
(1,'代理商管理','门户管理','报表管理','系统管理','系统配置管理','关键词申请','代理商客户管理','代理商预付款','关键词申请管理','操作日志','门户管理','报表管理','财务管理','角色管理','角色权限配置','用户管理','关键词审核','财务类型','服务类型','服务年限','APP地址','客户类型','证件类型','优惠类型',now(),1),
(2,'代理商管理','门户管理',NULL,NULL,NULL,'关键词申请','代理商客户管理','代理商预付款','关键词申请管理','操作日志','门户管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),
(3,NULL,NULL,'报表管理','系统管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'报表管理','财务管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),
(4,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),
(5,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),
(6,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'报表管理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),
(7,NULL,NULL,'报表管理','系统管理','',NULL,NULL,NULL,NULL,NULL,NULL,'报表管理',NULL,'角色管理','角色权限配置','用户管理','关键词审核',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1),

(8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NOW(),1);

/*Table structure for table `capitalsource` */

DROP TABLE IF EXISTS `capitalsource`;

CREATE TABLE `capitalsource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `approach` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `capitalsource` */

insert  into `capitalsource`(`id`,`approach`) values
(1,'代理款'),
(2,'转账'),
(3,'财务打款'),
(4,'冻结'),
(5,'扣费'),
(6,'代理款冲低'),
(7,'消费'),
(8,'退费'),
(9,'返款'),
(10,'罚款'),
(11,'扣代理款预录费');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contact_name` varchar(50) NOT NULL,
  `contact_phone` varchar(50) NOT NULL,
  `contact_fax` varchar(500) DEFAULT NULL,
  `contact_mobile` varchar(50) NOT NULL,
  `contact_email` varchar(100) NOT NULL,
  `contact_post` varchar(20) NOT NULL,
  `enterprise_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `enterprise_id` (`enterprise_id`),
  CONSTRAINT `contact_ibfk_1` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `contact` */

insert  into `contact`(`id`,`contact_name`,`contact_phone`,`contact_fax`,`contact_mobile`,`contact_email`,`contact_post`,`enterprise_id`) values
(1,'张安顺','075512312','52312','136213123','zhangans@qq.com','保洁',1),
(2,'李维新','075512312','52312','136213123','liweixin@qq.com','绿化',2),
(3,'胖子','075512312','52312','136213123','pangzi@qq.com','房地产',3),
(4,'张六','075512312','52312','136213123','zhangliu@qq.com','服装',4),
(5,'张鑫','075512312','52312','136213123','zhangxin@qq.com','保洁',5);

/*Table structure for table `enterprise` */

DROP TABLE IF EXISTS `enterprise`;

CREATE TABLE `enterprise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enterprise_name` varchar(50) NOT NULL,
  `enterprise_type` varchar(50) NOT NULL,
  `enterprise_home` varchar(500) DEFAULT NULL,
  `enterprise_state` int(11) NOT NULL,
  `gateway_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `gateway_id` (`gateway_id`),
  CONSTRAINT `enterprise_ibfk_1` FOREIGN KEY (`gateway_id`) REFERENCES `gateway` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `enterprise` */

insert  into `enterprise`(`id`,`enterprise_name`,`enterprise_type`,`enterprise_home`,`enterprise_state`,`gateway_id`) values
(1,'通泰实业有限公司','个人','tongtai.com',0,1),
(2,'万力可集团','个人','wanlike.com',0,2),
(3,'伟翔实业有限公司','个人','weixiang.com',1,3),
(4,'节艾特有限公司','个人','jieaite.com',1,4),
(5,'捷达有限公司','个人','jieda.com',1,5);

/*Table structure for table `finance` */

DROP TABLE IF EXISTS `finance`;

CREATE TABLE `finance` (
  `finance_id` int(11) NOT NULL AUTO_INCREMENT,
  `finance_type` varchar(50) NOT NULL,
  `finance_enable` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`finance_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `finance` */

insert  into `finance`(`finance_id`,`finance_type`,`finance_enable`) values
(1,'代理款',0),
(2,'转账',0),
(3,'财务打款',0),
(4,'冻结',0),
(5,'扣费',0),
(6,'代理款冲抵',1),
(7,'消费',0),
(8,'退费',0),
(9,'返款',0),
(10,'罚款',0),
(11,'代理款预录',0);

/*Table structure for table `financialstatements` */

DROP TABLE IF EXISTS `financialstatements`;

CREATE TABLE `financialstatements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `approach_id` int(11) NOT NULL,
  `capital` float(10,2) NOT NULL,
  `apply_date` date NOT NULL,
  `pass_date` date NOT NULL,
  `disburse_income` int(11) NOT NULL,
  `verifier_id` int(11) NOT NULL,
  `accountBalance` varchar(50) NOT NULL,
  `remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `approach_id` (`approach_id`),
  CONSTRAINT `financialstatements_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `financialstatements_ibfk_2` FOREIGN KEY (`approach_id`) REFERENCES `capitalsource` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `financialstatements` */

insert  into `financialstatements`(`id`,`user_id`,`approach_id`,`capital`,`apply_date`,`pass_date`,`disburse_income`,`verifier_id`,`accountBalance`,`remark`) values
(2,1,1,18.50,'2018-02-05','2019-01-04',1,1,'52555336.25','个人隐私');

/*Table structure for table `gateway` */

DROP TABLE IF EXISTS `gateway`;

CREATE TABLE `gateway` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gateway_representative` varchar(50) NOT NULL,
  `gateway_type` varchar(20) NOT NULL,
  `gateway_certificates` int(11) NOT NULL,
  `gateway_phone` int(11) NOT NULL,
  `gateway_fax` int(11) DEFAULT NULL,
  `gateway_date` date DEFAULT NULL,
  `gateway_country` varchar(50) DEFAULT NULL,
  `gateway_region` varchar(50) NOT NULL,
  `gateway_city` varchar(50) NOT NULL,
  `gateway_area` varchar(50) NOT NULL,
  `gateway_address` varchar(50) DEFAULT NULL,
  `gateway_remarks` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `gateway` */

insert  into `gateway`(`id`,`gateway_representative`,`gateway_type`,`gateway_certificates`,`gateway_phone`,`gateway_fax`,`gateway_date`,`gateway_country`,`gateway_region`,`gateway_city`,`gateway_area`,`gateway_address`,`gateway_remarks`) values
(1,'小红','国内身份证',2147483647,7552312,6555,'2018-02-22','中国','广东省','深圳市','罗湖区','hhh','ds'),
(2,'小伟','国内身份证',2147483647,623122,5100,'2018-02-23','中国','广东省','广州市','白云区','白云区福祥路','66664'),
(3,'小高','国内身份证',2147483647,831231,5200,'2018-02-24','中国','江西省','南昌市','南林区','吉祥路8号','66663'),
(4,'小李','国内身份证',2147483647,232388,5300,'2018-02-25','中国','广东省','深圳市','白云区','福祥路','66662'),
(5,'小光','国内身份证',2147483647,213123,5400,'2018-02-26','中国','广东省','深圳市','龙岗区','龙岗中心城','5232');

/*Table structure for table `journal` */

DROP TABLE IF EXISTS `journal`;

CREATE TABLE `journal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `journal` */

/*Table structure for table `keywords` */

DROP TABLE IF EXISTS `keywords`;

CREATE TABLE `keywords` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(50) NOT NULL,
  `user_id` int(11) NOT NULL,
  `service_Type_id` int(11) NOT NULL,
  `price` float(10,2) NOT NULL,
  `verifier` int(11) NOT NULL,
  `user_mode` int(11) NOT NULL,
  `Application` int(11) NOT NULL,
  `agent_id` int(11) NOT NULL,
  `keywordDate` date NOT NULL,
  `keywordsOverdue` date NOT NULL,
  `APP_id` int(11) DEFAULT NULL,
  `ageLimit` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `agent_id` (`agent_id`),
  KEY `APP_id` (`APP_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `keywords_ibfk_1` FOREIGN KEY (`agent_id`) REFERENCES `agentcustomer` (`id`),
  CONSTRAINT `keywords_ibfk_2` FOREIGN KEY (`APP_id`) REFERENCES `app` (`id`),
  CONSTRAINT `keywords_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `keywords` */

insert  into `keywords`(`id`,`keyword`,`user_id`,`service_Type_id`,`price`,`verifier`,`user_mode`,`Application`,`agent_id`,`keywordDate`,`keywordsOverdue`,`APP_id`,`ageLimit`) values
(1,'你好',1,1,300.00,0,1,0,3,'2018-02-11','2018-02-11',1,1),
(2,'NSA',1,0,6000.00,0,1,0,3,'2019-02-11','2018-02-11',1,1),
(4,'55555',1,0,55555.00,0,1,0,3,'2018-02-13','2019-02-13',-1,1),
(5,'22222',1,0,66666.00,0,1,0,4,'2018-02-13','2019-02-13',-1,1);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;
;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `uthorityId` int(11) NOT NULL,
  `type` varchar(10) NOT NULL,
  `fristDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uthorityId` (`uthorityId`),
  CONSTRAINT `role_ibfk_1` FOREIGN KEY (`uthorityId`) REFERENCES `authoritylist` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`NAME`,`uthorityId`,`type`,`fristDate`) values
(1,'系统管理员',1,'启用','2018-03-01'),
(2,'代理商用户',2,'启用','2018-03-01'),
(3,'财务用户',3,'启用','2018-03-01'),
(4,'渠道经理',4,'启用','2018-03-01'),
(5,'市场',5,'启用','2018-03-01'),
(6,'大区经理',6,'启用','2018-03-01'),
(7,'客服人员',7,'启用','2018-03-01');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(20) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `roleId` int(11) NOT NULL,
  `isDelete` int(1) NOT NULL,
  `type` varchar(10) NOT NULL,
  `fristDate` date DEFAULT NULL,
  `phone` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `authoritylist` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`userId`,`NAME`,`PASSWORD`,`roleId`,`isDelete`,`type`,`fristDate`,`phone`) values
(1,'zhangsan','张三','zhangsan',1,0,'启用','2018-03-01',NULL),
(2,'lisi','李四','lisi',2,0,'启用','2018-03-01',NULL),
(3,'wangwu','王五','wangwu',3,0,'启用','2018-03-01',NULL),
(4,'zhaoliu','赵六','zhaoliu',4,0,'启用','2018-03-01',NULL),
(5,'tianqi','田七','tianqi',5,0,'启用','2018-03-01',NULL),
(6,'wangba','王八','wangba',6,0,'启用','2018-03-01',NULL),
(7,'jiumei','九妹','jiumei',7,0,'启用','2018-03-01',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
