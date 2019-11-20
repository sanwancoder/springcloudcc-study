package com.wyfdc.go.entity.po;


import com.wyfdc.go.common.entity.BasePO;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection="book")
public class Book extends BasePO {

  @Indexed
  private String bookName;

  private String isbn;

  private String author;

  private double  price;

}
