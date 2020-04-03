USE test;


CREATE TABLE IF NOT EXISTS t_user (
  id INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  user_id VARCHAR(255) NOT NULL COMMENT '用户id',
  user_name VARCHAR(255) NOT NULL COMMENT '用户姓名',
  balance double NOT NULL DEFAULT 0.0,
  PRIMARY KEY (id)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


create unique index t_user_userID_IDX on t_user(user_id);

-- drop INDEX t_user_userID_IDX on test.t_user;

-- show INDEX from test.t_user;



INSERT INTO t_user(user_id,user_name,balance) VALUES ("zhangsan2","张三",200.25);

INSERT INTO t_user(user_id,user_name,balance) VALUES ("lisi001","李四",200.22);
