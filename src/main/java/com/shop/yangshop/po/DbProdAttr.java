package com.shop.yangshop.po;

import java.io.Serializable;
import lombok.Data;

/**
 * DB_PROD_ATTR
 * @author 
 */
@Data
public class DbProdAttr implements Serializable {
    private Integer prodId;

    private Integer attrId;

    private String attrValue;

    private static final long serialVersionUID = 1L;
}