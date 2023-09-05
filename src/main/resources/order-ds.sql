
CREATE DATABASE IF NOT EXISTS easy_sample CHARACTER SET 'utf8mb4';
USE easy_sample;
create table ds_order
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';


CREATE DATABASE IF NOT EXISTS easy_sample1 CHARACTER SET 'utf8mb4';
USE easy_sample1;
create table ds_order
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';


CREATE DATABASE IF NOT EXISTS easy_sample2 CHARACTER SET 'utf8mb4';
USE easy_sample2;
create table ds_order
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';


CREATE DATABASE IF NOT EXISTS easy_sample3 CHARACTER SET 'utf8mb4';
USE easy_sample3;
create table ds_order
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';


CREATE DATABASE IF NOT EXISTS easy_sample4 CHARACTER SET 'utf8mb4';
USE easy_sample4;
create table ds_order
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';