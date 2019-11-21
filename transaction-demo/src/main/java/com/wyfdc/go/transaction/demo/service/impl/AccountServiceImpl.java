package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.Account;
import com.wyfdc.go.transaction.demo.mapper.AccountMapper;
import com.wyfdc.go.transaction.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author: woo
 */
@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountMapper accountMapper;

  @Override
  public void saveAccount(Account account) {
    accountMapper.saveAccount(account);
  }

  @Override
  public Account getAccountByUserId(String userID) {
    return accountMapper.getAccountByUserId(userID);
  }

  @Override
  public void updateAccountBalance(String userID, int balance) throws BizException {
    if(StringUtils.isEmpty(userID)|| StringUtils.isEmpty(balance)){
      throw new BizException("param is null");
    }
    accountMapper.updateAccountBalance(userID,balance);
  }


}
