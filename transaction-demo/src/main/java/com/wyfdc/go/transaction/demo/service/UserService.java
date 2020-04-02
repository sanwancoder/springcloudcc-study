package com.wyfdc.go.transaction.demo.service;


import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.UserPO;

/**
 * @Author:
 */
public interface UserService {


   void saveAccount(UserPO account);
}
