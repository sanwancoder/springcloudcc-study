package com.wyfdc.go.action;

import com.wyfdc.go.common.response.PageResultVO;
import com.wyfdc.go.common.response.ResponseData;
import com.wyfdc.go.entity.po.UserPO;
import com.wyfdc.go.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:  
 */
@RestController
@RequestMapping("/api/user")
public class UserAction {

  @Autowired
  private UserService userService;

  @GetMapping("/all")
  public ResponseData<List<UserPO>> getUsers(){
    List<UserPO> userPOs = userService.getUserPOs();
    return new ResponseData<>(userPOs);
  }

  @GetMapping("/page/{pageNum}/{pageSize}")
  public ResponseData<PageResultVO<UserPO>> getUsersByPage(@PathVariable("pageNum") Integer pageNum,
      @PathVariable("pageSize") Integer pageSize){
    PageResultVO<UserPO> users = userService.getUsersByPage(pageNum,pageSize);
    return new ResponseData<>(users);
  }


}
