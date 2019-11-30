package com.briup.cms_project.service.impl;

import com.briup.cms_project.bean.Link;
import com.briup.cms_project.dao.ILinkDao;
import com.briup.cms_project.exception.CustomerException;
import com.briup.cms_project.service.ILinkServcie;
import com.briup.cms_project.untils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements ILinkServcie {
    @Autowired
    private ILinkDao iLinkDao;

    @Override
    public void addLink(Link link) throws CustomerException {
        if (link == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        }
        iLinkDao.save(link);
    }

    @Override
    public void updateLink(Link link) throws CustomerException {
        if (link == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        }
        Link dataLink = iLinkDao.findById(link.getId());
        dataLink.setName(link.getName());
        dataLink.setUrl(link.getUrl());
        iLinkDao.save(dataLink);
    }

    @Override
    public void deleteLink(int id) throws CustomerException {
        if (id == 0) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        }
        iLinkDao.deleteById(id);
    }

    @Override
    public Link queryLinkById(int id) throws CustomerException {
        if (id == 0) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        }
        Link dataLink = iLinkDao.findById(id);
        return dataLink;
    }

    @Override
    public List<Link> queryAllLink() throws CustomerException {
        return iLinkDao.findAll();
    }
}
