package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpPermission;

public interface SpPermissionDao {
    int deleteByPrimaryKey(Short psId);

    int insert(SpPermission record);

    int insertSelective(SpPermission record);

    SpPermission selectByPrimaryKey(Short psId);

    int updateByPrimaryKeySelective(SpPermission record);

    int updateByPrimaryKey(SpPermission record);
}