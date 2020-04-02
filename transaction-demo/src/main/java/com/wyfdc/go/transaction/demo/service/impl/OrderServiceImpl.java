package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.transaction.demo.dto.OrderPO;
import com.wyfdc.go.transaction.demo.mapper.OrderMapper;
import com.wyfdc.go.transaction.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Resource
  private OrderMapper orderMapper;

  @Override
  public void saveOrder(OrderPO orderDTO) {
    orderMapper.insert(orderDTO);
  }

}
