package com.wyfdc.go.transaction.demo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author:
 */
//TODO 应该写成线程池的形式，且属性应该予以注入
@Component
public class ConnectionUtil {

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.driverClassName}")
  private String driverName;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  public Connection getConnection() {
    Connection conn = null;
    try {
      // 1、加载驱动
      Class.forName(url);
      // 2、获取connection
      conn = DriverManager.getConnection(
          driverName,
              username, password);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

}
