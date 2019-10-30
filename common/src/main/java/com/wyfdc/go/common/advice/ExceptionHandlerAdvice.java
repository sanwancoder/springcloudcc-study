package com.wyfdc.go.common.advice;

import com.wyfdc.go.common.codes.ResponseCode;
import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.common.response.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Woo
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

  /**
   * Description : 全局异常捕捉处理
   */
  @ExceptionHandler(value = { Exception.class })
  public ResponseData<String> apiExceptionHandler(Exception ex) {
    log.error("ExceptionHandlerAdvice 异常抛出: {}", ex);
    return new ResponseData<String>(ex.getMessage(), ResponseCode.SERVER_ERROR);
  }


  @ExceptionHandler(value = { IllegalArgumentException.class })
  public ResponseData<String> illegalExceptionHandler(Exception ex) {
    log.error("ExceptionHandlerAdvice 异常抛出: {}", ex);
    return new ResponseData<String>(ex.getMessage(), ResponseCode.SERVER_ERROR.getCode(),
        ex.getMessage());
  }

  /**
   * 业务异常
   */
  @ExceptionHandler(value = BizException.class)
  public ResponseData<String> defaultErrorHandler(BizException e) {
    log.error("ExceptionHandlerAdvice 异常抛出: {}", e);
    return new ResponseData(e.getMessage(), e.getCode(),e.getMessage());
  }

}
