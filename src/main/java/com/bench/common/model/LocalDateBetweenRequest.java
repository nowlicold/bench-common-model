package com.bench.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author hyk
 * @date 2021/1/29
 */

@Data
@ApiModel(description = "时间范围 请求参数")
public class LocalDateBetweenRequest {

  @ApiModelProperty(value = "开始日期", required = true)
  @NotNull(message = "开始日期 不能为空")
  private LocalDate startDate;

  @ApiModelProperty(value = "结束日期", required = true)
  @NotNull(message = "结束日期 不能为空")
  private LocalDate endDate;

}
