package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.ProductPO;
import com.wyfdc.go.transaction.demo.dto.UserPO;
import com.wyfdc.go.transaction.demo.mapper.OrderMapper;
import com.wyfdc.go.transaction.demo.mapper.ProductMapper;
import com.wyfdc.go.transaction.demo.mapper.UserMapper;
import com.wyfdc.go.transaction.demo.service.UserService;
import com.wyfdc.go.transaction.demo.service.BizService;
import com.wyfdc.go.transaction.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author:
 */
@Service
public class BizServiceImpl implements BizService {

  @Autowired
  private UserService accountService;

  @Autowired
  private ProductService productService;

  @Resource
  private OrderMapper orderMapper;

  @Resource
  private ProductMapper productMapper;

  @Resource
  private UserMapper userMapper;

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
    ProductPO record = new ProductPO();
    record.setName("iphoneX");
    record.setPrice(5999.00);
    record.setStockQuantity(10000);
    productMapper.insert(record);

    UserPO userPO = new UserPO();
    userPO.setUserID("fuckDu");
    userPO.setUserName("操读");
    userPO.setBalance(0.0);
    userMapper.insert(userPO);
  }

}
