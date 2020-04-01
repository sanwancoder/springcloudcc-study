package com.wyfdc.go.transaction.demo.service;


import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.Account;

/**
 * @Author:
 */
public interface AccountService {

   void saveAccount(Account account);

   Account getAccountByUserId(String userID);

   void updateAccountBalance(String userID, int balance) throws BizException;


}
