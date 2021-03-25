package com.shop.yangshop.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * DB_ORD
 * @author 
 */
@Data
public class DbOrd implements Serializable {
    private Integer ordId;

    private Integer userId;

    private Integer prodId;

    private Integer count;

    private BigDecimal realPay;

    private Date createDate;

    private Integer state;

    private String type;

    private static final long serialVersionUID = 1L;
}