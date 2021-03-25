package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbUser;

public interface DbUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(DbUser record);

    int insertSelective(DbUser record);

    DbUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(DbUser record);

    int updateByPrimaryKey(DbUser record);
}