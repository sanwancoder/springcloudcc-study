package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.transaction.demo.dto.OrderDTO;
import com.wyfdc.go.transaction.demo.mapper.OrderMapper;
import com.wyfdc.go.transaction.demo.service.AccountService;
import com.wyfdc.go.transaction.demo.service.OrderService;
import com.wyfdc.go.transaction.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderMapper orderMapper;

  @Override
  public void saveOrder(OrderDTO orderDTO) {
    orderMapper.saveOrder(orderDTO);
  }

  @Override
  public String buyProduct(String userID, String productID) {
    return null;
  }
}
