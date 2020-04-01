package com.wyfdc.go.transaction.demo.service;

import com.wyfdc.go.common.exception.BizException;
import com.wyfdc.go.transaction.demo.dto.ProductPO;
import java.util.List;

/**
 * @Author:
 */
public interface ProductService {

   void saveProduct(ProductPO product) throws BizException;



}
