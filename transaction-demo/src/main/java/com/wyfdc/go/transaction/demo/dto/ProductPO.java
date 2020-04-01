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
@Table(name = "t_Product")
public class ProductPO {
  //主键
  @Column(name ="product_id" )
  private Long productID;

  //产品名称
  @Column(name = "NAME")
  private String name;


  //价格
  @Column(name = "price")
  private double price;

  // 数量
  @Column(name = "stock_quantity")
  private int stockQuantity;


  public ProductPO(String name, double price, int amount) {
    this.name = name;
    this.price = price;
    this.stockQuantity = amount;
  }
}
