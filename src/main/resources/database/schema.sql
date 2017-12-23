DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  id int not null primary key COMMENT '唯一标识',
  name VARCHAR(20) COMMENT '名字',
  account VARCHAR(200) COMMENT '账号',
  password VARCHAR(200) COMMENT '密码',
  createTime DATETIME COMMENT '创建时间'
);
