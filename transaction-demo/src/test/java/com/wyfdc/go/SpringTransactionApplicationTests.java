package com.wyfdc.go;

import com.wyfdc.go.transaction.demo.service.BizService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TransactionDemoApp.class)
public class SpringTransactionApplicationTests {

  @Autowired
  private BizService bizService;

  @Test
  public void insertWithTransaction() {
    bizService.insertWithTransaction();
  }

}
