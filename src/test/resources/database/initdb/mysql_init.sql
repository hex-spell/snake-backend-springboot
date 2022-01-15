CREATE DATABASE IF NOT EXISTS `snake-db`;
USE `snake-db`;
CREATE TABLE IF NOT EXISTS `highscore` (
   id INT AUTO_INCREMENT,
   username VARCHAR(255) NOT NULL,
   points INT NOT NULL,
   PRIMARY KEY (id)
);