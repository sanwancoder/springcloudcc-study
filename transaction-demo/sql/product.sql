USE test;


CREATE TABLE IF NOT EXISTS t_Product (
  product_id INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  NAME VARCHAR(255) NOT NULL COMMENT '产品名称',
  price DOUBLE NOT NULL DEFAULT 0.0,
  stock_quantity INT NOT NULL DEFAULT 0,
  PRIMARY KEY (product_id)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO t_Product(product_id,NAME,price,stock_quantity) VALUES(1,'N95口罩',200,10000);



