package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbProdAttr;

public interface DbProdAttrMapper {
    int insert(DbProdAttr record);

    int insertSelective(DbProdAttr record);
}