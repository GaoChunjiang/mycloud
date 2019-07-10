DROP TABLE IF EXISTS dept;
CREATE TABLE dept (
    deptno BIGINT NOT NULL AUTO_INCREMENT COMMENT 'PK',
    dname VARCHAR(100) DEFAULT NULL COMMENT '',
    db_source VARCHAR(50) DEFAULT NULL COMMENT '',
    PRIMARY KEY (deptno)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO dept(dname,db_source) VALUES('开发部', DATABASE());
INSERT INTO dept(dname,db_source) VALUES('人事部', DATABASE());
INSERT INTO dept(dname,db_source) VALUES('财务部', DATABASE());
INSERT INTO dept(dname,db_source) VALUES('市场部', DATABASE());
INSERT INTO dept(dname,db_source) VALUES('运维部', DATABASE());

select * from dept;