package com.wyfdc.go.service.impl;

import com.wyfdc.go.dao.UserMapper;
import com.wyfdc.go.entity.User;
import com.wyfdc.go.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> list = userMapper.selectList(null);
        return list;
    }
}
