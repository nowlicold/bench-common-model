package com.bench.common.enums.common;

/**
 *
 */
public enum DeviceTypeEnum {

  ANDROID("ANDROID"),

  IOS("IOS"),

  WEB("WEB"),

  H5("H5"),

  ;

  private final String message;

  DeviceTypeEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  /**
   * 根据message信息获取枚举
   * @param message message内容
   * @return 对应的枚举
   */
  public static DeviceTypeEnum fromMessage(String message) {
    for (DeviceTypeEnum v : DeviceTypeEnum.values()) {
      if (v.message.equalsIgnoreCase(message)) {
        return v;
      }

      if ("w".equalsIgnoreCase(message)) {
        return WEB;
      }
    }
    return null;
  }
}
