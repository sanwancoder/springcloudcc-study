package com.wyfdc.go.transaction.demo.mapper;

import com.wyfdc.go.transaction.demo.dto.UserPO;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author:
 */
public interface UserMapper extends Mapper<UserPO> {

    void updateAccountBalance(@Param("userID")String userID,@Param("balance") Double balance);

}
