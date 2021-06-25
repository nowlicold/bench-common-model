package com.bench.common.enums.common;

/**
 * @author ds
 * @date 2019-02-16
 */
public enum AppTermEnum {

  /**
   * PC
   */
  PC("PC", "PC"),

  /**
   * android
   */
  ANDROID("ANDROID", "ANDROID"),

  /**
   * ios
   */
  IOS("IOS", "IOS"),

  /**
   * H5
   */
  H5("H5", "H5");

  private final String type;

  private final String message;

  AppTermEnum(String type, String message) {
    this.type = type;
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public String getType() {
    return type;
  }
}
