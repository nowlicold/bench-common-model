package com.bench.common.enums.common;


public enum LoginTypeEnum {


  ACCOUNT_PWD("账号密码登录");

  private final String message;

  LoginTypeEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }}
