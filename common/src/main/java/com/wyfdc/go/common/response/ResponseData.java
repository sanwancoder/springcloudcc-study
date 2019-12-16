package com.wyfdc.go.common.response;


import com.wyfdc.go.common.codes.ResponseCode;
import com.wyfdc.go.common.codes.SuccessCode;

/**
 * @Author: Woo
 */

public class ResponseData<T> {

  private T data;

  private Integer code;

  private String message;

  public ResponseData(T data){
    this(data, SuccessCode.SUCCESS);
  }

  public ResponseData(T data, ResponseCode responseCode){
    this(data,responseCode.getCode(),responseCode.getMessage());
  }

  public ResponseData(T data, Integer code, String message) {
    this.data = data;
    this.code = code;
    this.message = message;
  }

  public ResponseData() {
    this(null, SuccessCode.SUCCESS);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
