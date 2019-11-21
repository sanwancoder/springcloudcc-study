package com.wyfdc.go.transaction.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author:
 */
//TODO 应该写成线程池的形式，且属性应该予以注入
public class ConnectionUtil {

  public static Connection getConnection() {
    Connection conn = null;
    try {
      // 1、加载驱动
      Class.forName("com.mysql.jdbc.Driver");
      // 2、获取connection
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
          "root", "123456");
      System.out.println(conn);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

}
