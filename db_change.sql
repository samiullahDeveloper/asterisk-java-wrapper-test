--liquibase formatted sql
--changeset sami:create-activity-table

CREATE TABLE `activity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cellno` varchar(12) DEFAULT NULL,
  `dt` datetime DEFAULT NULL,
  `activity_type` varchar(170) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `dtmf` varchar(2) DEFAULT NULL,
  `context` varchar(170) DEFAULT NULL,
  `unique_id` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin1;


--rollback DROP TABLE
--rollback activity
