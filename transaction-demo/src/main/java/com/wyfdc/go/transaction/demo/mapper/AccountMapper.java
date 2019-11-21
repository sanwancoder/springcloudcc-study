package com.wyfdc.go.transaction.demo.mapper;

import com.wyfdc.go.transaction.demo.dto.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:
 */
@Mapper
public interface AccountMapper {

  public void saveAccount(@Param(value = "account") Account account);

  public Account getAccountByUserId(@Param("userID") String userID);

  public void updateAccountBalance(@Param("userID") String userID,
      @Param("balance") int balance);
}
