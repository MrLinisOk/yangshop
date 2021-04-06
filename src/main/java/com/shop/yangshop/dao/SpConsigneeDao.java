package com.shop.yangshop.dao;

import com.shop.yangshop.po.SpConsignee;

public interface SpConsigneeDao {
    int deleteByPrimaryKey(Integer cgnId);

    int insert(SpConsignee record);

    int insertSelective(SpConsignee record);

    SpConsignee selectByPrimaryKey(Integer cgnId);

    int updateByPrimaryKeySelective(SpConsignee record);

    int updateByPrimaryKey(SpConsignee record);
}