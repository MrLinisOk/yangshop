package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpAttribute;

public interface SpAttributeDao {
    int deleteByPrimaryKey(Short attrId);

    int insert(SpAttribute record);

    int insertSelective(SpAttribute record);

    SpAttribute selectByPrimaryKey(Short attrId);

    int updateByPrimaryKeySelective(SpAttribute record);

    int updateByPrimaryKeyWithBLOBs(SpAttribute record);

    int updateByPrimaryKey(SpAttribute record);
}