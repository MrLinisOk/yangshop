package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpOrder;

public interface SpOrderDao {
    int deleteByPrimaryKey(Integer orderId);

    int insert(SpOrder record);

    int insertSelective(SpOrder record);

    SpOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SpOrder record);

    int updateByPrimaryKeyWithBLOBs(SpOrder record);

    int updateByPrimaryKey(SpOrder record);
}