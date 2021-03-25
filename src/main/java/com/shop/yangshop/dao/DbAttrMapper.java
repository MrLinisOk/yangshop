package com.shop.yangshop.dao;

import com.shop.yangshop.po.DbAttr;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

@Repository
public interface DbAttrMapper {
    int deleteByPrimaryKey(Integer ATTR_ID);

    int insert(DbAttr record);

    int insertSelective(DbAttr record);

    DbAttr selectByPrimaryKey(Integer ATTR_ID);

    int updateByPrimaryKeySelective(DbAttr record);

    int updateByPrimaryKey(DbAttr record);
}