package com.wyfdc.go.transaction.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

  //主键
  private Long id;

  //用户id
  private String userID;

  //用户名称
  private String userName;

  //余额
  private int balance;

  public Account(String userID,
      String userName,
      int balance) {
    this.userID = userID;
    this.userName = userName;
    this.balance = balance;
  }

}
