package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbUserAddress;

public interface DbUserAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbUserAddress record);

    int insertSelective(DbUserAddress record);

    DbUserAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbUserAddress record);

    int updateByPrimaryKey(DbUserAddress record);
}