package com.briup.cms_project.service;

import com.briup.cms_project.bean.Link;
import com.briup.cms_project.exception.CustomerException;

import java.util.List;

public interface ILinkServcie {
    void addLink(Link link) throws CustomerException;

    void updateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link queryLinkById(int id) throws CustomerException;

    List<Link> queryAllLink() throws CustomerException;
}
