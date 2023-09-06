package com.easyquery.sample.sharding.route;

import com.easy.query.core.sharding.api.route.mod.AbstractModTableRoute;
import com.easyquery.sample.domain.OrderEntity;
import com.easyquery.sample.domain.TDsOrderEntity;
import org.springframework.stereotype.Component;

/**
 * create time 2023/9/2 15:08
 * 文件说明
 *
 * @author xuejiaming
 */
@Component
public class TDsOrderTableRoute extends AbstractModTableRoute<TDsOrderEntity> {
    @Override
    protected int mod() {
        return 2;
    }

    @Override
    protected int tailLength() {
        return 2;
    }
}
