package com.wyfdc.go.transaction.demo.service;


import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.Account;

/**
 * @Author:
 */
public interface AccountService {

  public void saveAccount(Account account);

  public Account getAccountByUserId(String userID);

  public void updateAccountBalance(String userID, int balance) throws BizException;


}
