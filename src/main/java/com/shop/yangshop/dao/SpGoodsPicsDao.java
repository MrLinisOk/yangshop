package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpGoodsPics;

public interface SpGoodsPicsDao {
    int deleteByPrimaryKey(Integer picsId);

    int insert(SpGoodsPics record);

    int insertSelective(SpGoodsPics record);

    SpGoodsPics selectByPrimaryKey(Integer picsId);

    int updateByPrimaryKeySelective(SpGoodsPics record);

    int updateByPrimaryKey(SpGoodsPics record);
}