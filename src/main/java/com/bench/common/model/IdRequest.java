package com.bench.common.model;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author by catface
 * @date 2020/12/15
 */
@ApiModel(description = "id请求模型")
public class IdRequest {

    @ApiModelProperty(value = "业务ID")
    @NotNull(message = "ID不能为空")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
