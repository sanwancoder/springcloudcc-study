package com.wyfdc.go.common.response;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Woo
 */
public class PageResultVO<T> {

  private List<T> records = Collections.emptyList();;

  private Long total;

  private Long pages;

  private Integer pageNo;

  private Integer pageSize;

  public PageResultVO(List<T> records, Long total, Integer pageNo, Integer pageSize) {
    this.records = records;
    this.total = total;
    this.pageNo = pageNo;
    this.pageSize = pageSize;
  }

  public PageResultVO(List<T> records, Long total, Long pages, Integer pageNo,
      Integer pageSize) {
    this.records = records;
    this.total = total;
    this.pages = pages;
    this.pageNo = pageNo;
    this.pageSize = pageSize;
  }

  public Long getPages() {
    return pages;
  }

  public void setPages(Long pages) {
    this.pages = pages;
  }

  public PageResultVO() {
  }

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public List<T> getRecords() {
    return records;
  }

  public void setRecords(List<T> records) {
    this.records = records;
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }
}
