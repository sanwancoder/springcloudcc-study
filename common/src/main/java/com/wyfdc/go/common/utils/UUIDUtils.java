package com.wyfdc.go.common.utils;

import java.util.UUID;

/**
 * @Author: Woo
 */
public class UUIDUtils {

  public static String getUUID(){
    return UUID.randomUUID().toString();
  }

  public static String getUpperUUID(){
    return UUID.randomUUID().toString().replace("-","").toUpperCase();
  }

  public static void main(String[] args) {
    System.out.println(UUIDUtils.getUUID());
    System.out.println(UUIDUtils.getUpperUUID());
  }

}
