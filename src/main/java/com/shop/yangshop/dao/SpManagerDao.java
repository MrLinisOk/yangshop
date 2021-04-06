package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpManager;

public interface SpManagerDao {
    int deleteByPrimaryKey(Integer mgId);

    int insert(SpManager record);

    int insertSelective(SpManager record);

    SpManager selectByPrimaryKey(Integer mgId);

    int updateByPrimaryKeySelective(SpManager record);

    int updateByPrimaryKey(SpManager record);
}