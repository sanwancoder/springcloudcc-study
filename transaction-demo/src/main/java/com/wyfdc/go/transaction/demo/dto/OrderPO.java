package com.wyfdc.go.transaction.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author:
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_order")
public class OrderPO {

  private String id;

  @Column(name = "user_id")
  private String userID;

  @Column(name = "product_id")
  private String productID;

  //数量
  @Column(name = "quantity")
  private Integer quantity;

  //支付金额
  @Column(name = "pay_amount")
  private Double payAmount;

  public OrderPO(String userID,
                 String productID,
                 Integer quantity, Double payAmount){
    this.userID = userID;
    this.productID = productID;
    this.quantity = quantity;
    this.payAmount = payAmount;
  }




}
