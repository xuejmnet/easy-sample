package com.easyquery.sample.controller;

import com.easy.query.api4j.client.EasyQuery;
import com.easy.query.core.annotation.EasyQueryTrack;
import com.easyquery.sample.domain.DsOrderEntity;
import com.easyquery.sample.domain.OrderEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * create time 2023/9/4 22:01
 * 文件说明
 *
 * @author xuejiaming
 */
@RestController
@RequestMapping("/orderShardingDataSource")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderShardingDataSourceController {
    private final EasyQuery easyQuery;

    @GetMapping("/add")
    public Object add() {
        ArrayList<DsOrderEntity> orderEntities = new ArrayList<>(100);
        List<String> users = Arrays.asList("xiaoming", "xiaohong", "xiaolan");

        for (int i = 0; i < 10; i++) {
            DsOrderEntity orderEntity = new DsOrderEntity();
            orderEntity.setId(String.valueOf(i));
            int i1 = i % 3;
            String uid = users.get(i1);
            orderEntity.setUid(uid);
            orderEntity.setOrderNo(i);
            orderEntity.setStatus(i1);
            orderEntity.setCreateTime(LocalDateTime.now());
            orderEntities.add(orderEntity);
        }
        long l = easyQuery.insertable(orderEntities).executeRows();
        return "成功插入:"+l;
    }


    @GetMapping("/edit")
    @EasyQueryTrack
    public Object edit() {
        DsOrderEntity orderEntity = easyQuery.queryable(DsOrderEntity.class)
                .asTracking()
                .where(o->o.eq(DsOrderEntity::getId,"1")).firstNotNull("未找到对应的订单");
        orderEntity.setCreateTime(LocalDateTime.now());
        easyQuery.updatable(orderEntity)
                .executeRows();
        return orderEntity;
    }
    @GetMapping("/concurrentEdit")
    @EasyQueryTrack
    public Object concurrentEdit() {
        DsOrderEntity orderEntity = easyQuery.queryable(DsOrderEntity.class)
                .asTracking()
                .where(o->o.eq(DsOrderEntity::getId,"2")).firstNotNull("未找到对应的订单");
        if(!Objects.equals(2,orderEntity.getStatus())){
            throw new RuntimeException("订单状态不是2");
        }
        orderEntity.setCreateTime(LocalDateTime.now());
        orderEntity.setStatus(3);
        easyQuery.updatable(orderEntity)
                .whereColumns(o->o.columnKeys().column(DsOrderEntity::getStatus))
                .executeRows(1,"并发修改失败");
        return orderEntity;
    }
}
