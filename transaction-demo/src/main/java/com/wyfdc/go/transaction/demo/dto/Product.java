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
public class Product {
  //主键
  private Long productID;

  //产品名称
  private String name;

  //产品编码
  private String code;

  //价格
  private double price;

  // 数量
  private int amount;

  public Product(String name, String code, double price, int amount) {
    this.name = name;
    this.code = code;
    this.price = price;
    this.amount = amount;
  }
}
