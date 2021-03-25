package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * DB_USER
 * @author 
 */
@Data
public class DbUser implements Serializable {
    /**
     * 用户编号
     */
    private Integer userId;

    private String userName;

    private String type;

    private String state;

    private Integer billId;

    private Date createDate;

    private Date modDate;

    private Date expireDate;

    private String openId;

    private String nickName;

    private String headImgUrl;

    private String remarks;

    private Integer sex;

    private String province;

    private String city;

    private String country;

    private String ext1;

    private String ext2;

    private String ext3;

    private static final long serialVersionUID = 1L;
}