package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.TransactionDemoApp;
import com.wyfdc.go.transaction.demo.service.BizService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TransactionDemoApp.class)
public class BizServiceImplTest {


    @Autowired
    private BizService bizService;

    @Test
    public void insertWithTransaction() {
        bizService.insertWithTransaction();
    }


    @Test
    public void insertWithoutTransaction() {
        bizService.insertWithoutTransaction();
    }
}