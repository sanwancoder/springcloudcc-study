package com.wyfdc.go.transaction.demo.service;

import com.wyfdc.go.transaction.demo.dto.OrderDTO;

/**
 * @Author:
 */
public interface OrderService {

  public void saveOrder(OrderDTO orderDTO);

  public String buyProduct(String userID, String productID);

}
