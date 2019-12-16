package com.wyfdc.go.common.codes;

/**
 * @Author: Woo
 */
public enum SuccessCode implements ResponseCode {
  SUCCESS(0,"成功");

  private Integer code;
  private String message;

  SuccessCode(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  @Override
  public Integer getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
