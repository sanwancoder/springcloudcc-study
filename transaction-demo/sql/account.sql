USE test;


CREATE TABLE IF NOT EXISTS account (
  id INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  user_id VARCHAR(255) NOT NULL COMMENT '用户id',
  user_name VARCHAR(255) NOT NULL COMMENT '用户姓名',
  balance INT NOT NULL DEFAULT 0.0,
  PRIMARY KEY (id)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


ALTER TABLE test.`account` ADD UNIQUE (`user_id`);

SHOW INDEX FROM test.`account`;

SELECT * FROM test.`account`;

UPDATE test.account a SET a.balance = 890 WHERE a.user_id = 'zhangsan001';

DELETE  FROM test.account WHERE account.id=2;

INSERT INTO account VALUES (1,"zhangsan001","张三",100);

INSERT INTO account(user_id,user_name,balance) VALUES ("zhangsan2","张三",200);

INSERT INTO account(user_id,user_name,balance) VALUES ("lisi001","李四",200);


SELECT id AS id,
           user_name AS userName,
           user_id AS userID,
           balance AS balance
       FROM account a
       WHERE a.user_id='lisi';