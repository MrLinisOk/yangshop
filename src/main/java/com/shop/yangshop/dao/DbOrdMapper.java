package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbOrd;

public interface DbOrdMapper {
    int deleteByPrimaryKey(Integer ordId);

    int insert(DbOrd record);

    int insertSelective(DbOrd record);

    DbOrd selectByPrimaryKey(Integer ordId);

    int updateByPrimaryKeySelective(DbOrd record);

    int updateByPrimaryKey(DbOrd record);
}