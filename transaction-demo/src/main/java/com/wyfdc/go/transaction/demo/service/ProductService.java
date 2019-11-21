package com.wyfdc.go.transaction.demo.service;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.Product;
import java.util.List;

/**
 * @Author:
 */
public interface ProductService {

  public void saveProduct(Product product) throws BizException;

  public void updateProduct(String productID, int amount) throws BizException;

  public List<Product> getProduct(String productID, String code) throws BizException;

}
