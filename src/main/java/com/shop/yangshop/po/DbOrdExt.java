package com.shop.yangshop.po;

import java.io.Serializable;
import lombok.Data;

/**
 * DB_ORD_EXT
 * @author 
 */
@Data
public class DbOrdExt implements Serializable {
    private Integer ordId;

    /**
     * 用户下单时备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}