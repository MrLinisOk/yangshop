package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpReport3;

public interface SpReport3Dao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport3 record);

    int insertSelective(SpReport3 record);

    SpReport3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport3 record);

    int updateByPrimaryKey(SpReport3 record);
}