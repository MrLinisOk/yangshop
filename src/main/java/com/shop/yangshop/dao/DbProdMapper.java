package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbProd;

public interface DbProdMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(DbProd record);

    int insertSelective(DbProd record);

    DbProd selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(DbProd record);

    int updateByPrimaryKey(DbProd record);
}