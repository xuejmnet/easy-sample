package com.easyquery.sample.conversion;

import com.easy.query.core.basic.extension.conversion.ValueConverter;
import com.easyquery.sample.enums.EnumValueOf;
import org.springframework.stereotype.Component;

/**
 * create time 2023/9/2 14:59
 * 文件说明
 *
 * @author xuejiaming
 */
@Component
public class EnumValueConverter implements ValueConverter<EnumValueOf<?>,Integer> {
    @Override
    public Integer serialize(EnumValueOf<?> enumValueOf) {
        return enumValueOf.getCode();
    }

    @Override
    public EnumValueOf<?> deserialize(Class<EnumValueOf<?>> enumValueOfClass, Integer integer) {
        EnumValueOf<?>[] enumConstants = enumValueOfClass.getEnumConstants();
        if(enumConstants.length>0){
            return enumConstants[0].enumOf(integer);
        }
        throw new IllegalArgumentException("Invalid integer value for enum: " + integer);
    }
}
