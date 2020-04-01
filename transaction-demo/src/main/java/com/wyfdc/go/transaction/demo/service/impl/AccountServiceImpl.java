package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.UserPO;
import com.wyfdc.go.transaction.demo.mapper.AccountMapper;
import com.wyfdc.go.transaction.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author: woo
 */
@Service
public class AccountServiceImpl implements AccountService {

  @Resource
  private AccountMapper accountMapper;

  @Override
  public void saveAccount(UserPO account) {
    accountMapper.insert(account);
  }



}
