package com.wyfdc.go.transaction.demo.service;

import com.wyfdc.go.common.exception.BizException;
/**
 * @Author:
 */
public interface BizService {

   void insertWithoutTransaction() throws BizException;
   void insertWithinTransaction() throws BizException;

}
