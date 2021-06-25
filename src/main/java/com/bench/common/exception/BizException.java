package com.bench.common.exception;

import lombok.Data;

/**
 * @author ds
 * @date 2019-01-23
 */
@Data
public class BizException extends RuntimeException {

  private String errorCode;

  private String errorMessage;

  public BizException(BaseErrorEnum baseErrorEnum) {
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public BizException(String errorCode, String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public BizException(BaseErrorEnum baseErrorEnum, Throwable cause) {
    super(cause);
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
