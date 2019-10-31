package com.wyfdc.go.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Woo
 */
@RestController
@RequestMapping("/api/springsession-demo/test")
public class TestContoller {

  @GetMapping("/first")
  public Map<String,Object> fisrstReq(HttpServletRequest request){
    Map<String, Object> map = new HashMap<>();
    request.getSession().setAttribute("request Url", request.getRequestURL());
    String sessionId = request.getSession().getId();
    map.put("request Url", request.getRequestURL());
    map.put("sessionId", sessionId);
    return map;
  }


  @GetMapping(value = "/sessions")
  public Object sessions (HttpServletRequest request){
    Map<String, Object> map = new HashMap<>();
    map.put("sessionId", request.getSession().getId());
    map.put("message", request.getSession().getAttribute("map"));
    return map;
  }

  @GetMapping(value = "/now")
  public Date getNow(){
    return new Date();
  }

}
