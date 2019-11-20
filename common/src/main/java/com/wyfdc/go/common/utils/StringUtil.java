package com.wyfdc.go.common.utils;


import org.springframework.util.StringUtils;
/**
 * @Author:  
 */
public class StringUtil {

  public static boolean nonEmpty(String s){
    return !StringUtils.isEmpty(s);
  }

}
