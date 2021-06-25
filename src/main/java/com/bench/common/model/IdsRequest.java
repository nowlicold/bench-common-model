package com.bench.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author hyk
 * @date 2021/1/28
 */

@ApiModel(description = "ids请求模型")
public class IdsRequest {

    @ApiModelProperty(value = "业务IDs", required = true)
    @NotEmpty(message = "IDs不能为空")
    private Set<Long> ids;

    public Set<Long> getIds() {
        return ids;
    }

    public void setIds(Set<Long> ids) {
        this.ids = ids;
    }
}
