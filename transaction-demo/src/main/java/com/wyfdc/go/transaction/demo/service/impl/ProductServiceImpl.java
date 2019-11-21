package com.wyfdc.go.transaction.demo.service.impl;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.Product;
import com.wyfdc.go.transaction.demo.mapper.ProductMapper;
import com.wyfdc.go.transaction.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author:
 */
@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductMapper productMapper;

  @Override
  public void saveProduct(Product product) throws BizException {
    productMapper.saveProduct(product);
  }

  @Override
  public void updateProduct(String productID, int amount) throws BizException {
    if(StringUtils.isEmpty(productID)){
      throw new BizException("All params are null");
    }
    productMapper.updateProduct(productID,amount);
  }


  @Override
  public List<Product> getProduct(String productID,String code) throws BizException {
    if(StringUtils.isEmpty(productID)&& StringUtils.isEmpty(code)){
      throw new BizException("All params are null");
    }
    return productMapper.getProduct(productID, code);
  }


}
