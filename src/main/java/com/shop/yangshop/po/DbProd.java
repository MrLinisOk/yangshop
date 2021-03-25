package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * DB_PROD
 * @author 
 */
@Data
public class DbProd implements Serializable {
    private Integer prodId;

    private String prodName;

    private String prodImgs;

    private String prodType;

    private String state;

    private Date createDate;

    private Date modDate;

    private String prodDesc;

    private String remarks;

    private String ext1;

    private String ext2;

    private String ext3;

    private String opId;

    private static final long serialVersionUID = 1L;
}