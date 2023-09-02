package com.easyquery.sample.enums;

/**
 * create time 2023/9/2 14:55
 * 文件说明
 *
 * @author xuejiaming
 */
public interface EnumValueOf<T extends EnumValueOf<T>> {
    Integer getCode();
    T enumOf(Integer value);
}
