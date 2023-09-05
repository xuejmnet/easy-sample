
CREATE DATABASE IF NOT EXISTS easy_sample CHARACTER SET 'utf8mb4';
USE easy_sample;
create table order_00
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';
create table order_01
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';
create table order_02
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';
create table order_03
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';
create table order_04
(
    id varchar(32) not null comment '主键ID'primary key,
    uid varchar(50) not null comment '用户id',
    order_no int not null comment '订单号',
    status int not null comment '订单状态',
    create_time datetime not null comment '创建时间'
)comment '订单表';