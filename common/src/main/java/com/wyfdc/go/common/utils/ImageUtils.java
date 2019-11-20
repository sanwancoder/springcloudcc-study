package com.wyfdc.go.common.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 * @Author: Woo
 */
@Slf4j
public class ImageUtils {

  /**
   * 获取从网络上的图片的字节流
   */
  public static byte[] getFileByNetwork(String url) {
    try {
      URL urlConet = new URL(url);
      HttpURLConnection con = null;
      con = (HttpURLConnection) urlConet.openConnection();
      con.setRequestMethod("GET");
      con.setConnectTimeout(4 * 1000);
      //通过输入流获取图片数据
      InputStream inStream = con.getInputStream();
      ByteArrayOutputStream outStream = new ByteArrayOutputStream();
      byte[] buffer = new byte[2048];
      int len = 0;
      while ((len = inStream.read(buffer)) != -1) {
        outStream.write(buffer, 0, len);
      }
      inStream.close();
      byte[] data = outStream.toByteArray();
      return data;
    } catch (IOException e) {
      log.error("getFileByNetwork error. " + url, e);
    }finally {

    }
    return null;
  }

  /**
   * 获取从本地图片的字节流
   */
  public static byte[] getImageFromLocal(String url) {
    BufferedInputStream in = null;
    try {
      in = new BufferedInputStream(new FileInputStream(url));
      ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
      byte[] temp = new byte[2048];
      int size = 0;
      while ((size = in.read(temp)) != -1) {
        out.write(temp, 0, size);
      }
      in.close();
      byte[] content = out.toByteArray();
      return content;
    } catch (IOException e) {
      log.error("getImageFromLocal error. " + url, e);
    }
    return null;
  }

  /**
   * 读取网络图片，转换成base64
   *
   * @param imgUrl 网络图片地址
   */
  public static String getUrlImgToBase64(String imgUrl) throws Exception {
    return getBase64StrFromByte(readImgUrlToByteArray(imgUrl));
  }

  public static String getBase64StrFromByte(byte[] b) {
    return Base64.encodeBase64String(b);
  }

  /**
   * 读取网络图片，转换成byte数组
   *
   * @param imgUrl 网络图片地址
   */
  public static byte[] readImgUrlToByteArray(String imgUrl) throws Exception {
    URL url = new URL(imgUrl);// 构造URL
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");// 设置请求方式为"GET"
    con.setConnectTimeout(5 * 1000);// 超时响应时间为5秒

    InputStream is = con.getInputStream();// 输入流
    byte[] bs = new byte[1024];// 1K的数据缓冲
    int len = 0;// 读取到的数据长度

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    // 开始读取
    while ((len = is.read(bs)) != -1) {
      outputStream.write(bs, 0, len);
    }

    is.close();

    return outputStream.toByteArray();
  }



}
