package com.shop.yangshop.service;

public interface IUserSV {
    public int insertUser(String reqJson);
    public int deleteUser(String reqJson);
    public int updateUser(String reqJson);
    public String queryUser(String reqJson);
}
