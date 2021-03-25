package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * DB_ATTR
 * @author 
 */
@Table(name="DB_ATTR")
@Data
public class DbAttr implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer ATTR_ID;

    private String ATTR_NAME;

    private String ATTR_TYPE;

    /**
     * 默认值
     */
    private String ATTR_VALUE;

    private Date CREATE_DATE;

    private Date MOD_DATE;

    private Integer STATE;

    private static final long serialVersionUID = 1L;

}