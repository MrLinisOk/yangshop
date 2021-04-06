package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpRole;
import com.shop.yangshop.po.SpRoleWithBLOBs;

public interface SpRoleDao {
    int deleteByPrimaryKey(Short roleId);

    int insert(SpRoleWithBLOBs record);

    int insertSelective(SpRoleWithBLOBs record);

    SpRoleWithBLOBs selectByPrimaryKey(Short roleId);

    int updateByPrimaryKeySelective(SpRoleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SpRoleWithBLOBs record);

    int updateByPrimaryKey(SpRole record);
}