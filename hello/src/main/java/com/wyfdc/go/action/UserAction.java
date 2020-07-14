package com.wyfdc.go.action;

import com.wyfdc.go.common.response.ResponseData;
import com.wyfdc.go.entity.User;
import com.wyfdc.go.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserAction {

    @Autowired
    private UserService userService;

    @GetMapping("/list-all")
    public ResponseData<List<User>> list(){
        return new ResponseData<>(userService.list());
    }
}
