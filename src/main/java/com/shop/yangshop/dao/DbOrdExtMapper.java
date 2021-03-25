package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbOrdExt;

public interface DbOrdExtMapper {
    int insert(DbOrdExt record);

    int insertSelective(DbOrdExt record);
}