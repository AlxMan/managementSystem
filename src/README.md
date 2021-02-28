建表语句：

CREATE TABLE `tb_dept` (
`dept_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT  'dept_id',
`dept_name` VARCHAR(255) NOT NULL COMMENT 'dept_name' ,
`major_name` VARCHAR(255) DEFAULT NULL COMMENT  'major_name',
`telephone` VARCHAR(255) DEFAULT NULL COMMENT  'telephone',
`email` VARCHAR(255) DEFAULT NULL COMMENT  'email',
PRIMARY KEY (`dept_id`),
UNIQUE KEY `部门名` (`dept_name`)
)ENGINE=INNODB AUTO_INCREMENT=3 COMMENT='部门表' DEFAULT CHARSET = utf8;


INSERT INTO `tb_dept`
(`dept_id`,`dept_name`,`major_name`,`telephone`,`email`)
VALUES
(1,"市场部","招聘","17777777777","zhangsan@qq.com"),
(2,"销售部","教育","18888888888","lisi@qq.com");


CREATE TABLE `tb_employee` (
`emp_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT  'emp_id',
`emp_name` VARCHAR(255) DEFAULT NULL COMMENT 'emp_name' ,
`dept_id` INT(11) DEFAULT NULL COMMENT  'dept_id',
`job_name` VARCHAR(255) DEFAULT NULL COMMENT  'job_name',
`join_date` DATE DEFAULT NULL COMMENT  'join_date',
`telephone` VARCHAR(255) DEFAULT NULL COMMENT  'telephone',
PRIMARY KEY (`emp_id`)
)ENGINE=INNODB AUTO_INCREMENT=4 COMMENT='员工表' DEFAULT CHARSET = utf8;


INSERT INTO `tb_employee`
(`emp_id`,`emp_name`,`dept_id`,`job_name`,`join_date`,`telephone`)
VALUES
(1,"小张",1,"客户经理","2020-06-06","17777777776"),
(2,"小王",1,"客户经理","2021-07-07","17777777778"),
(3,"小李",2,"销售经理","2019-08-08","17777777779");

效果演示：

![Watch the video](https://github.com/AlxMan/managementSystem/blob/master/src/main/webapp/img/2021.02.28.02.43.mp4)
