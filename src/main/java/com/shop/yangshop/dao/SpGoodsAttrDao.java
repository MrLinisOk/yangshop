package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpGoodsAttr;

public interface SpGoodsAttrDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpGoodsAttr record);

    int insertSelective(SpGoodsAttr record);

    SpGoodsAttr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpGoodsAttr record);

    int updateByPrimaryKeyWithBLOBs(SpGoodsAttr record);

    int updateByPrimaryKey(SpGoodsAttr record);
}