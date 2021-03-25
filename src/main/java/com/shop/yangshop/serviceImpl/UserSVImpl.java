package com.shop.yangshop.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.shop.yangshop.po.DbUser;
import com.shop.yangshop.service.IUserSV;

public class UserSVImpl implements IUserSV {

    @Override
    public int insertUser(String reqJson) {
        //json 转实体类/map
        reqJson = "{\n" +
                "\t\"USER_NAME\":\"林新杰\",\n" +
                "\n" +
                "\t\"TYPE\":\"1\",\n" +
                "\n" +
                "\t\"BILL_ID\":\"18900098890\",\n" +
                "\n" +
                "\t\"OPEN_ID\":\"DFHI&234234YFDSHUIF&&7923487\",\n" +
                "\n" +
                "\t\"NICK_NAME\":\"我叫林新杰\",\n" +
                "\n" +
                "\t\"HEAD_IMG_URL\":\"http://www.baidu.com\",\n" +
                "\n" +
                "\t\"REMARKS\":\"我是你爸爸\",\n" +
                "\n" +
                "\t\"SEX\":\"1\",\n" +
                "\n" +
                "\t\"PROVINCE\":\"571\",\n" +
                "\n" +
                "\t\"CITY\":\"574\",\n" +
                "\n" +
                "\t\"COUNTRY\":\"5741\",\n" +
                "\n" +
                "}";

        JSON.parseObject(reqJson, DbUser.class);
        return 0;
    }

    @Override
    public int deleteUser(String reqJson) {
        return 0;
    }

    @Override
    public int updateUser(String reqJson) {

        return 0;
    }

    @Override
    public String queryUser(String reqJson) {
        return null;
    }
}
