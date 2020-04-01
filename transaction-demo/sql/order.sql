USE test;

CREATE TABLE IF NOT EXISTS t_order (
  id INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    user_id VARCHAR(255) NOT NULL COMMENT '用户id',
  product_id INT(11) NOT NULL COMMENT '产品表product主键',
  quantity INT NOT NULL DEFAULT 0 COMMENT '购买数量',
  pay_amount double NOT NULL DEFAULT 0 COMMENT '支付金额',
  PRIMARY KEY (id)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO t_order(product_id,user_id,quantity,pay_amount) VALUES(1,'zhangsan2',2,400);
