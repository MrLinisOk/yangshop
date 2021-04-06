package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpExpress;

public interface SpExpressDao {
    int deleteByPrimaryKey(Integer expressId);

    int insert(SpExpress record);

    int insertSelective(SpExpress record);

    SpExpress selectByPrimaryKey(Integer expressId);

    int updateByPrimaryKeySelective(SpExpress record);

    int updateByPrimaryKey(SpExpress record);
}