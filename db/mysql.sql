Drop database if EXISTS aaa;
CREATE SCHEMA `aaa` DEFAULT CHARACTER SET utf8mb4;

use `aaa`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
    `id` int(11) PRIMARY KEY NOT NULL auto_increment,
    `name` varchar(20),
    `password` varchar(50) ,
    `age` int(10) ,
    `tel` varchar(255)
) ;

INSERT INTO `user` VALUES (1, 'tom', 'tom', 3 , '188666888');
INSERT INTO `user` VALUES (2, 'jerry', 'jerry',  4 , '166888666');
INSERT INTO `user` VALUES (3, 'jock', '123456',  41 , '400618400');
INSERT INTO `user` VALUES (4, '传智播客', 'itcast', 23 , '400617500');

select * from user;
select max(id) from user;

