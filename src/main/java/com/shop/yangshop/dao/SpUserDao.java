package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpUser;

public interface SpUserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(SpUser record);

    int insertSelective(SpUser record);

    SpUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SpUser record);

    int updateByPrimaryKeyWithBLOBs(SpUser record);

    int updateByPrimaryKey(SpUser record);
}