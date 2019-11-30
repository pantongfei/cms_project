package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILinkDao extends JpaRepository<Link, Integer> {
    Link findById(int id);
}
