package com.wyfdc.go.entity.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:  
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class                                                                         UserPO {

  @Id
  @Column(name = "user_id")
  private String userId;

  @Column(name = "user_name")
  private String userName;

}
