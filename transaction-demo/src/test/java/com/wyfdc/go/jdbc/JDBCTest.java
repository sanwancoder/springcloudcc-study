package com.wyfdc.go.jdbc;

import com.wyfdc.go.TransactionDemoApp;
import com.wyfdc.go.transaction.demo.utils.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TransactionDemoApp.class)
public class JDBCTest {

  @Autowired
  private ConnectionUtil connectionUtil;

  @Test
  public void testJDBC(){
    Connection conn = connectionUtil.getConnection();
    int i = 0;
    String sql = "INSERT INTO t_user(user_id,user_name,balance) VALUES (?,?,?)";
    PreparedStatement pstmt;
    try {
      pstmt = (PreparedStatement) conn.prepareStatement(sql);
      pstmt.setString(1, "wangwu001");
      pstmt.setString(2, "王五");
      pstmt.setDouble(3, 100.78);
      i = pstmt.executeUpdate();
      pstmt.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {

    }
    System.out.println(" ---->>> " + i);
  }

}
