package com.wyfdc.go.transaction.demo.service;

import com.wyfdc.go.common.exception.BizException;
/**
 * @Author:
 */
public interface BizService {

  public void insertWithoutTransaction() throws BizException;

  public void insertWithTransaction() throws BizException;

}
