package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomer extends JpaRepository<Customer,Integer> {
}
