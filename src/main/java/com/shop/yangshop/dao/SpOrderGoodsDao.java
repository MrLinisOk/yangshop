package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpOrderGoods;

public interface SpOrderGoodsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpOrderGoods record);

    int insertSelective(SpOrderGoods record);

    SpOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpOrderGoods record);

    int updateByPrimaryKey(SpOrderGoods record);
}