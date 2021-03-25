package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbProdPrice;

public interface DbProdPriceMapper {
    int insert(DbProdPrice record);

    int insertSelective(DbProdPrice record);
}