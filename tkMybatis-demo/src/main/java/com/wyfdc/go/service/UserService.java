package com.wyfdc.go.service;

import com.wyfdc.go.common.response.PageResultVO;
import com.wyfdc.go.entity.po.UserPO;
import java.util.List;

/**
 * @Author:  
 */
public interface UserService {

  List<UserPO> getUserPOs();

  PageResultVO<UserPO> getUsersByPage(Integer page, Integer pageSize);
}
