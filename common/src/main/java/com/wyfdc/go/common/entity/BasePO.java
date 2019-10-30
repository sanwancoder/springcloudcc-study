package com.wyfdc.go.common.entity;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import lombok.Data;

/**
 * @Author: Woo
 */
@Data
public class BasePO {

  @Id
  private String id;

  @ApiModelProperty(value = "创建人")
  @Column(name="created_by")
  private String createdBy;

  @ApiModelProperty(value = "创建时间")
  @Column(name="created_date")
  private Date createdDate;

  @ApiModelProperty(value = "更新人")
  @Column(name="updated_by")
  private String updatedBy;

  @ApiModelProperty(value = "更新时间")
  @Column(name="updated_date")
  private Date updatedDate;

}
