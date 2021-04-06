package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpReport2;

public interface SpReport2Dao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport2 record);

    int insertSelective(SpReport2 record);

    SpReport2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport2 record);

    int updateByPrimaryKey(SpReport2 record);
}