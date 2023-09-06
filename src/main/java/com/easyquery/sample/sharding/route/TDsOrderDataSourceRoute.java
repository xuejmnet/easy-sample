package com.easyquery.sample.sharding.route;

import com.easy.query.core.enums.sharding.ShardingOperatorEnum;
import com.easy.query.core.expression.lambda.RouteFunction;
import com.easy.query.core.expression.parser.core.available.TableAvailable;
import com.easy.query.core.sharding.route.datasource.abstraction.AbstractDataSourceRoute;
import com.easyquery.sample.domain.DsOrderEntity;
import com.easyquery.sample.domain.TDsOrderEntity;
import org.springframework.stereotype.Component;

/**
 * create time 2023/9/5 22:34
 * 文件说明
 *
 * @author xuejiaming
 */
@Component
public class TDsOrderDataSourceRoute extends AbstractDataSourceRoute<TDsOrderEntity> {

    @Override
    protected RouteFunction<String> getRouteFilter(TableAvailable table, Object shardingValue, ShardingOperatorEnum shardingOperator, boolean withEntity) {
        int i = shardingValue.toString().hashCode();
        int dsNumber = Math.abs(i % 3); //0-5
        String dataSource = "ds" + dsNumber;
        switch (shardingOperator) {
            case EQUAL: //仅支持==操作
                return ds -> dataSource.compareToIgnoreCase(ds) == 0;
            default:
                return t -> true;
        }
    }
}

