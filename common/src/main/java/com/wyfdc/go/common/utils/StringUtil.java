package com.wyfdc.go.common.utils;


import org.springframework.util.StringUtils;

public class StringUtil {

  public static boolean nonEmpty(String s){
    return !StringUtils.isEmpty(s);
  }

}
