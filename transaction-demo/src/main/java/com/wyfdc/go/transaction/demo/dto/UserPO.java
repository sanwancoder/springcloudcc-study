package com.wyfdc.go.transaction.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_user")
public class UserPO {

  //主键
  private Long id;

  //用户id
  @Column(name = "user_id")
  private String userID;

  //用户名称
  @Column(name = "user_name")
  private String userName;

  //余额
  @Column(name = "balance")
  private int balance;

  public UserPO(String userID,
                String userName,
                int balance) {
    this.userID = userID;
    this.userName = userName;
    this.balance = balance;
  }

}
