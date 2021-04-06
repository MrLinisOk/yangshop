package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpType;

public interface SpTypeDao {
    int deleteByPrimaryKey(Short typeId);

    int insert(SpType record);

    int insertSelective(SpType record);

    SpType selectByPrimaryKey(Short typeId);

    int updateByPrimaryKeySelective(SpType record);

    int updateByPrimaryKey(SpType record);
}