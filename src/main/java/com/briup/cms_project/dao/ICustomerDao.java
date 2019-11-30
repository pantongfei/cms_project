package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<Customer, Integer> {
    Customer findByUsernameAndPassword(String userName, String password);

    Customer findById(int id);

    Customer findByUsername(String userName);
}
