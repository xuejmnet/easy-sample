package com.easyquery.sample.domain;

import com.easy.query.core.annotation.Column;
import com.easy.query.core.annotation.ShardingDataSourceKey;
import com.easy.query.core.annotation.ShardingTableKey;
import com.easy.query.core.annotation.Table;
import com.easyquery.sample.sharding.initializer.DsOrderShardingInitializer;
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
@Table(value = "ds_order",shardingInitializer = DsOrderShardingInitializer.class)
public class DsOrderEntity {
    @Column(primaryKey = true)
    @ShardingDataSourceKey
    private String id;
    private String uid;
    private Integer orderNo;
    private Integer status;
    private LocalDateTime createTime;
}