package com.wyfdc.go.transaction.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.wyfdc.go.TransactionDemoApp;
import com.wyfdc.go.transaction.demo.dto.OrderPO;
import com.wyfdc.go.transaction.demo.dto.ProductPO;
import com.wyfdc.go.transaction.demo.dto.UserPO;
import com.wyfdc.go.transaction.demo.mapper.OrderMapper;
import com.wyfdc.go.transaction.demo.mapper.ProductMapper;
import com.wyfdc.go.transaction.demo.mapper.UserMapper;
import com.wyfdc.go.transaction.demo.service.BizService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TransactionDemoApp.class)
public class BizServiceImplTest {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ProductMapper productMapper;

    @Resource
    private UserMapper userMapper;

    @Autowired
    private BizService bizService;

    @Test
    public void insertWithTransaction() {
        bizService.insertWithinTransaction();
    }


    @Test
    public void insertWithoutTransaction() {
        bizService.insertWithoutTransaction();
    }


    @Test
    public void test(){

        userMapper.updateAccountBalance("lisi001",300.00);

/*        List<OrderPO> orderPOS = orderMapper.selectAll();
        List<ProductPO> productPOS = productMapper.selectAll();
        List<UserPO> userPOS = userMapper.selectAll();
        orderPOS.stream().forEach(x->{
            System.out.println(JSON.toJSONString(x));
        });
        productPOS.stream().forEach(x->{
            System.out.println(JSON.toJSONString(x));
        });
        userPOS.stream().forEach(x->{
            System.out.println(JSON.toJSONString(x));
        });*/
    }
}