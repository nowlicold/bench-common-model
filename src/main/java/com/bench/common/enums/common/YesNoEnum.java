package com.bench.common.enums.common;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.bench.common.enums.BaseEnum;

/**
 * @author by catface
 * @date 2020/12/18
 */
public enum YesNoEnum implements BaseEnum {

    /**
     * 是否枚举值,兼容mysql的boolean类型
     */
    YES(1, "是"),

    NO(0, "否"),

    ;

    @EnumValue
    private final Integer code;

    private final String desc;

    YesNoEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举值描述
     *
     * @return 枚举值描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 获取枚举值编码
     *
     * @return 枚举值编码
     */
    public Integer getCode() {
        return code;
    }

}
