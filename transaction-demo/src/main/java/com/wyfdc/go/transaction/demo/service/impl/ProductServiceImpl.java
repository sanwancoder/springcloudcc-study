package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.ProductPO;
import com.wyfdc.go.transaction.demo.mapper.ProductMapper;
import com.wyfdc.go.transaction.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author:
 */
@Service
public class ProductServiceImpl implements ProductService {

  @Resource
  private ProductMapper productMapper;

  @Override
  public void saveProduct(ProductPO product) throws BizException {
    productMapper.insert(product);
  }




}
