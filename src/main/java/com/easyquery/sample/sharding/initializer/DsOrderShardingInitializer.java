package com.easyquery.sample.sharding.initializer;

import com.easy.query.core.enums.ExecuteMethodEnum;
import com.easy.query.core.metadata.EntityMetadata;
import com.easy.query.core.sharding.api.initializer.mod.AbstractShardingTableModInitializer;
import com.easy.query.core.sharding.initializer.EntityShardingInitializer;
import com.easy.query.core.sharding.initializer.ShardingEntityBuilder;
import com.easyquery.sample.domain.DsOrderEntity;
import com.easyquery.sample.domain.OrderEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * create time 2023/9/2 15:07
 * 文件说明
 *
 * @author xuejiaming
 */
@Component
public class DsOrderShardingInitializer implements EntityShardingInitializer<DsOrderEntity> {
    @Override
    public void configure(ShardingEntityBuilder<DsOrderEntity> builder) {
        EntityMetadata entityMetadata = builder.getEntityMetadata();
        String tableName = entityMetadata.getTableName();
        List<String> tables = Collections.singletonList(tableName);
        //设置5个数据源都有对应的表
        LinkedHashMap<String, Collection<String>> initTables = new LinkedHashMap<String, Collection<String>>() {{
            put("ds0", tables);
            put("ds1", tables);
            put("ds2", tables);
            put("ds3", tables);
            put("ds4", tables);
        }};
        builder.actualTableNameInit(initTables);
    }
}