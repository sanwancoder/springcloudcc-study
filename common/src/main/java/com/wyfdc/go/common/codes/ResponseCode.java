package com.wyfdc.go.common.codes;

/**
 * @Author: Woo
 */
public enum ResponseCode implements Codes {
  SUCCESS(0,"成功"),
  SERVER_ERROR(600,"服务器内部错误"),
  FAILED(700,"关联系统内部错误")
  ;

  private Integer code;
  private String message;

  ResponseCode(Integer code, String message) {
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

  public void setCode(Integer code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
