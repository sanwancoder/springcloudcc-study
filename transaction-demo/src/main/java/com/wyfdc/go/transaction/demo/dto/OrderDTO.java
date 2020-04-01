package com.wyfdc.go.transaction.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

/**
 * @Author:
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

  private String id;

  private String userID;

  private String productID;

  //数量
  private int amount;

  public OrderDTO(String userID,
      String productID,
      int amount){
    this.userID = userID;
    this.productID = productID;
    this.amount = amount;
  }




}
