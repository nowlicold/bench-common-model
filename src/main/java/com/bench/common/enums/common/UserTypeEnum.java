package com.bench.common.enums.common;

/**
 * @author catface
 * @date 2019-02-16
 */
public enum UserTypeEnum {

  OPS("OPS端客户"),

  ERP("ERP端用户"),

  MTS("MTS端用户"),

  C("C端客户"),

  TEMP("临时登录用户"),
  ;

  private final String message;

  UserTypeEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public String getCode() {
    return this.name();
  }

  /**
   * 根据message内容获取枚举
   * @param message message内容
   * @return 对应的枚举
   */
  public static UserTypeEnum fromMessage(String message) {
    for (UserTypeEnum v : UserTypeEnum.values()) {
      if (v.getMessage().equals(message)) {
        return v;
      }
    }

    return null;
  }

  /**
   * 根据枚举code返回枚举
   * @param code 枚举code
   * @return 枚举
   */
  public static UserTypeEnum fromCode(String code) {
    for (UserTypeEnum v: UserTypeEnum.values()) {
      if (v.getCode().equalsIgnoreCase(code)) {
        return v;
      }
    }
    return null;
  }

}
