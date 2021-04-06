package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpPermissionApi;

public interface SpPermissionApiDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpPermissionApi record);

    int insertSelective(SpPermissionApi record);

    SpPermissionApi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpPermissionApi record);

    int updateByPrimaryKey(SpPermissionApi record);
}