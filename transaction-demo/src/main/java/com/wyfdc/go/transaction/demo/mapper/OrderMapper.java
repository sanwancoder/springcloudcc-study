package com.wyfdc.go.transaction.demo.mapper;

import com.wyfdc.go.transaction.demo.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:
 */
@Mapper
public interface OrderMapper {

  public void saveOrder(@Param("orderDTO") OrderDTO orderDTO);

}
