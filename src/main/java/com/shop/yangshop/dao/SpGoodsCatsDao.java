package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpGoodsCats;

public interface SpGoodsCatsDao {
    int deleteByPrimaryKey(Integer catId);

    int insert(SpGoodsCats record);

    int insertSelective(SpGoodsCats record);

    SpGoodsCats selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(SpGoodsCats record);

    int updateByPrimaryKey(SpGoodsCats record);
}