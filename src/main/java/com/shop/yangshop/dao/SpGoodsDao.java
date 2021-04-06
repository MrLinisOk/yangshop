package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpGoods;

public interface SpGoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(SpGoods record);

    int insertSelective(SpGoods record);

    SpGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(SpGoods record);

    int updateByPrimaryKeyWithBLOBs(SpGoods record);

    int updateByPrimaryKey(SpGoods record);
}