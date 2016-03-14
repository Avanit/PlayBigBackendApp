CREATE TABLE `User` (
  `status` enum('ACTIVE','BLACKLISTED') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `userId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `lastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `virtualBalance` decimal(14,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;