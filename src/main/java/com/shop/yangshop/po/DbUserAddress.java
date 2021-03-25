package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * DB_USER_ADDRESS
 * @author 
 */
@Data
public class DbUserAddress implements Serializable {
    private Integer id;

    private Integer userId;

    private String name;

    private Integer billId;

    private String address;

    private Integer state;

    private Date createDate;

    private Date modDate;

    private static final long serialVersionUID = 1L;
}