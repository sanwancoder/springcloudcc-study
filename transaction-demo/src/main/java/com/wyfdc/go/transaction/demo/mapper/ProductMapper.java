package com.wyfdc.go.transaction.demo.mapper;

import com.wyfdc.go.transaction.demo.dto.Product;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:
 */
@Mapper
public interface ProductMapper {

  public void saveProduct(Product product);

  public List<Product> getProduct(@Param("productID") String productID,@Param("code") String code);

  public void updateProduct(@Param("productID") String productID,@Param("amount") int amount);
}
