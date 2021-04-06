package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpUserCart;

public interface SpUserCartDao {
    int deleteByPrimaryKey(Integer cartId);

    int insert(SpUserCart record);

    int insertSelective(SpUserCart record);

    SpUserCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(SpUserCart record);

    int updateByPrimaryKeyWithBLOBs(SpUserCart record);

    int updateByPrimaryKey(SpUserCart record);
}