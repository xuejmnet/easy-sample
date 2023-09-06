package com.easyquery.sample.domain;

import com.easy.query.core.annotation.Column;
import com.easy.query.core.annotation.ShardingTableKey;
import com.easy.query.core.annotation.Table;
import com.easy.query.core.annotation.UpdateIgnore;
import com.easyquery.sample.enums.OrderStatusEnum;
import com.easyquery.sample.sharding.initializer.OrderShardingInitializer;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * create time 2023/9/2 14:51
 * 文件说明
 *
 * @author xuejiaming
 */
@Data
@Table(value = "order",shardingInitializer = OrderShardingInitializer.class)
public class OrderEntity {
    @Column(primaryKey = true)
    @ShardingTableKey
    @UpdateIgnore
    private String id;
    private String uid;
    private Integer orderNo;
    private Integer status;
    private LocalDateTime createTime;
}