package com.briup.cms_project.service;

import com.briup.cms_project.bean.Customer;
import com.briup.cms_project.exception.CustomerException;

public interface ICustomerService {
    //用户登录
    Customer LoginCustomer(String userName, String password) throws CustomerException;

    //用户注册
    void registerCustomer(Customer customer) throws CustomerException;

    //通过名字查找用户
    Customer findByUserName(String name) throws CustomerException;
}
