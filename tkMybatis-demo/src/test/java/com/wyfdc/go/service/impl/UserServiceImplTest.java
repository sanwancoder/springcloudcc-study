package com.wyfdc.go.service.impl;

import static org.junit.Assert.*;

import com.alibaba.fastjson.JSON;
import com.wyfdc.go.TkMybatisDApplication;
import com.wyfdc.go.common.response.PageResultVO;
import com.wyfdc.go.entity.po.UserPO;
import com.wyfdc.go.mapper.UserMapper;
import com.wyfdc.go.service.UserService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TkMybatisDApplication.class )
public class UserServiceImplTest {

  @Resource
  private UserMapper userMapper;

  @Autowired
  private UserService userService;

  @Test
  public void test1(){
    for(int i=0;i<100;i++) {
      UserPO record = new UserPO("zhangsan_"+i,"张三_"+i);
      userMapper.insert(record);
    }
  }


  @Test
  public void test2() {
    PageResultVO<UserPO> usersByPage = userService.getUsersByPage(1, 20);
    System.out.println(JSON.toJSONString(usersByPage));
  }
}
