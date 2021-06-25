package com.bench.common.model;

import com.bench.common.error.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @className BaseResult
 * @autor cold
 * @DATE 2021/5/9 11:23
 **/
@Data
public class BaseResult {
    /**
     * 是否成功
     */
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    /**
     *  错误枚举
     */
    @ApiModelProperty(value = "错误枚举")
    private ErrorCode errorCode;
    /**
     *
     */
    @ApiModelProperty(value = "错误枚举详细信息")
    private String detailMessage;

}
