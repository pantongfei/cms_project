package com.briup.cms_project.service.impl;

import com.briup.cms_project.bean.Customer;
import com.briup.cms_project.dao.ICustomerDao;
import com.briup.cms_project.exception.CustomerException;
import com.briup.cms_project.service.ICustomerService;
import com.briup.cms_project.untils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerDao customerDao;

    @Override
    public Customer LoginCustomer(String userName, String password) throws CustomerException {
        Customer byUsernameAndPassword = customerDao.findByUsernameAndPassword(userName, password);
        if (byUsernameAndPassword == null) {
            throw new CustomerException(CodeUtils.NOT_USER, "用户名或者密码错误");
        }
        return byUsernameAndPassword;
    }

    @Override
    public void registerCustomer(Customer customer) throws CustomerException {
        if (customer == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        } else {
            Customer customer1 = customerDao.findById(customer.getId());
            if (customer1 == null) {
                customerDao.save(customer);
            } else {
                throw new CustomerException(CodeUtils.EXIT, "用户已存在");
            }
        }
    }

    @Override
    public Customer findByUserName(String name) throws CustomerException {
        Customer byUsername = customerDao.findByUsername(name);
        return byUsername;
    }


}
