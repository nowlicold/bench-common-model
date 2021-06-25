package com.bench.common.enums;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 *
 */
public interface EnumBase {

    /**
     * 获取枚举名
     *
     * @return
     */
    public String name();

    /**
     * 获取枚举消息
     *
     * @return
     */
    public String message();

    /**
     * 获取枚举值
     *
     * @return
     */
    public Number value();


}