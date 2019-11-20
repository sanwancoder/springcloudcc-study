package com.wyfdc.go.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wyfdc.go.common.response.PageResultVO;
import com.wyfdc.go.entity.po.UserPO;
import com.wyfdc.go.mapper.UserMapper;
import com.wyfdc.go.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<UserPO> getUserPOs(){
    return userMapper.selectAll();
  }

  @Override
  public PageResultVO<UserPO> getUsersByPage(Integer page, Integer pageSize){
    PageHelper.startPage(page, pageSize);
    Page<UserPO> users = userMapper.getUsersByPage();
    PageResultVO<UserPO> res = new PageResultVO<>();
    res.setPageNo(page);
    res.setPageSize(pageSize);
    res.setTotal(users.getTotal());
    res.setRecords(users.getResult());
    return res;
  }

}
