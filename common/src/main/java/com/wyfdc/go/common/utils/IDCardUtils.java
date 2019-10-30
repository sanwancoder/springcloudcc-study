package com.wyfdc.go.common.utils;

import java.util.Calendar;
import org.springframework.util.StringUtils;

/**
 * @Author: Woo
 */
public class IDCardUtils {

  /**
   * 根据身份证号获取出生年份
   * @param idCard
   * @return
   */
  public static String getBirthYear(String idCard){
    String year = null;
    if(StringUtil.nonEmpty(idCard)&&idCard.length()==18){
      year = idCard.substring(6,10);
    }
    return year;
  }

  /**
   * 根据身份证号获取出生月份
   * @param idCard
   * @return
   */
  public static String getBirthMonth(String idCard){
    String month = null;
    if(StringUtil.nonEmpty(idCard)&&idCard.length()==18){
      month = idCard.substring(10,12);
    }
    return month;
  }

  /**
   * 根据身份证号获取出生具体哪一天
   * @param idCard
   * @return
   */
  public static String getBirthDay(String idCard){
    String month = null;
    if(StringUtil.nonEmpty(idCard)&&idCard.length()==18){
      month = idCard.substring(12,14);
    }
    return month;
  }


  /**
   * 根据身份证号获取年龄
   * @param idCard
   * @return
   */
  public static String getAge(String idCard){
    String year = getBirthYear(idCard);
    if (StringUtils.isEmpty(year)){
      return null;
    }
    Calendar cal = Calendar.getInstance();
    int nowYear = cal.get(Calendar.YEAR);
    int birthYear = Integer.parseInt(year);
    return Integer.toString(nowYear - birthYear) ;
  }


  public static void main(String[] args) {
//    String idCard = "42100119911012202";
    String idCard = "421001199110122012";
    System.out.println(getBirthYear(idCard));
    System.out.println(getBirthMonth(idCard));
    System.out.println(getBirthDay(idCard));
    System.out.println(getAge(idCard));
  }


}
