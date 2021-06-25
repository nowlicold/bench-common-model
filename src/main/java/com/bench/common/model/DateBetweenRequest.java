package com.bench.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author hyk
 * @date 2021/1/28
 */

@ApiModel(description = "时间范围 请求参数")
@Data
public class DateBetweenRequest {

  @ApiModelProperty(value = "开始时间", required = true)
  @NotNull(message = "开始时间 不能为空")
  private Date startTime;

  @ApiModelProperty(value = "结束时间", required = true)
  @NotNull(message = "结束时间 不能为空")
  private Date endTime;

}
