package com.wyfdc.go.common.exception;


import com.wyfdc.go.common.codes.Codes;
import com.wyfdc.go.common.codes.ResponseCode;

/**
 * @Author: Woo
 */
public class BizException extends RuntimeException {

  private Integer code;
  private String message;

  public BizException() {
    super();
  }

  public BizException(final String msg){
    super(msg);
    this.code = ResponseCode.FAILED.getCode();
  }

  public BizException(final String detailedMessage,Integer code,String msg){
    super(detailedMessage);
    this.code = code;
    this.message = msg;
  }

  public BizException(final String msg,Integer code){
    this(msg,code,msg);
  }

  public BizException(final String detailedMessage, Codes codes){
    this(detailedMessage,codes.getCode(),codes.getMessage());
  }

  public BizException(Codes codes){
    this(null,codes);
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
