package com.shop.yangshop.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * DB_PROD_PRICE
 * @author 
 */
@Data
public class DbProdPrice implements Serializable {
    private Integer prodId;

    private BigDecimal price;

    private BigDecimal discountPrice;

    private Date createTime;

    private Date modTime;

    private Integer opId;

    private static final long serialVersionUID = 1L;
}