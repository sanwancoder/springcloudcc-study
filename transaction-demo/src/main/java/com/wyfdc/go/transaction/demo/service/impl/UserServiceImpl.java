package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.transaction.demo.dto.UserPO;
import com.wyfdc.go.transaction.demo.mapper.UserMapper;
import com.wyfdc.go.transaction.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: woo
 */
@Service
public class UserServiceImpl implements UserService {

  @Resource
  private UserMapper accountMapper;

  @Override
  public void saveAccount(UserPO account) {
    accountMapper.insert(account);
  }



}
