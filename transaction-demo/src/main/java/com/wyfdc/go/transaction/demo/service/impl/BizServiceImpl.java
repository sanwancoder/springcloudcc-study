package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.service.UserService;
import com.wyfdc.go.transaction.demo.service.BizService;
import com.wyfdc.go.transaction.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:
 */
@Service
public class BizServiceImpl implements BizService {

  @Autowired
  private UserService accountService;

  @Autowired
  private ProductService productService;

  /**
   * 由于没有加入事务注解 导致被更新掉
   * @throws BizException
   */
  @Override
  public void insertWithoutTransaction() throws BizException {


  }

  /**
   * 加入事务注解 没有被更新掉
   * @throws BizException
   */
  @Override
  @Transactional(rollbackFor = BizException.class)
  public void insertWithinTransaction() throws BizException {

  }

}
