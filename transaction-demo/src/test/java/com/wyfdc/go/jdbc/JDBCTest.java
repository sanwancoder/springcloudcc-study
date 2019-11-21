package com.wyfdc.go.jdbc;

import com.wyfdc.go.TransactionDemoApp;
import com.wyfdc.go.transaction.demo.utils.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TransactionDemoApp.class)
public class JDBCTest {

  @Test
  public void testJDBC(){
    Connection conn = ConnectionUtil.getConnection();
    int i = 0;
    String sql = "INSERT INTO account(user_id,user_name,balance) VALUES (?,?,?)";
    PreparedStatement pstmt;
    try {
      pstmt = (PreparedStatement) conn.prepareStatement(sql);
      pstmt.setString(1, "wangwu001");
      pstmt.setString(2, "王五");
      pstmt.setInt(3, 1000);
      i = pstmt.executeUpdate();
      pstmt.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    System.out.println(" ---->>> " + i);
  }

}
