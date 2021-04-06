package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpCategory;

public interface SpCategoryDao {
    int deleteByPrimaryKey(Integer catId);

    int insert(SpCategory record);

    int insertSelective(SpCategory record);

    SpCategory selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(SpCategory record);

    int updateByPrimaryKeyWithBLOBs(SpCategory record);

    int updateByPrimaryKey(SpCategory record);
}