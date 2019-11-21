USE test;

DROP TABLE t_order;

CREATE TABLE IF NOT EXISTS t_order (
  id INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  product_id INT(11) NOT NULL COMMENT '产品表product主键',
  user_id VARCHAR(255) NOT NULL COMMENT '用id',
  amount INT NOT NULL DEFAULT 0 COMMENT '购买数量',
  PRIMARY KEY (id)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


SELECT * FROM test.`t_order`;

INSERT INTO t_order(product_id,user_id,amount) VALUES(1000,1000,22);
