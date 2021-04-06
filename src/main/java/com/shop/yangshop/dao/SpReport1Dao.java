package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpReport1;

public interface SpReport1Dao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport1 record);

    int insertSelective(SpReport1 record);

    SpReport1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport1 record);

    int updateByPrimaryKey(SpReport1 record);
}