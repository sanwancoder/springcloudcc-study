package com.wyfdc.go.mapper;

import com.github.pagehelper.Page;
import com.wyfdc.go.entity.po.UserPO;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author:  
 */
public interface UserMapper extends Mapper<UserPO> {

  Page<UserPO> getUsersByPage();

}
