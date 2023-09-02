package com.easyquery.sample.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * create time 2023/9/2 14:52
 * 文件说明
 *
 * @author xuejiaming
 */

@Getter
@AllArgsConstructor
public enum OrderStatusEnum implements EnumValueOf<OrderStatusEnum> {
    WAIT_PAY(1,"待付款"),
    PAYED(2,"已付款"),
    COMPLETED(3 ,"已完成"),
    CANCELED(4 ,"已取消");
    private final Integer code;
    private final String name;

    @Override
    public OrderStatusEnum enumOf(Integer value) {
        switch (value) {
            case 1 -> {
                return WAIT_PAY;
            }
            case 2 -> {
                return PAYED;
            }
            case 3 -> {
                return COMPLETED;
            }
            case 4 -> {
                return CANCELED;
            }
        }
        throw new IllegalArgumentException("enumOf error:["+value+"]");
    }
}
