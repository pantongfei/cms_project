package com.briup.cms_project.web.Controller;

import com.briup.cms_project.bean.Link;
import com.briup.cms_project.service.ILinkServcie;
import com.briup.cms_project.untils.Message;
import com.briup.cms_project.untils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Link")
@Api(description = "链接管理")
public class LinkController {
    @Autowired
    private ILinkServcie linkServcie;

    @GetMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkServcie.addLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/update")
    @ApiOperation("修改链接")
    public Message updateLink(Link link) {
        linkServcie.updateLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/deleteLink")
    @ApiOperation("删除链接")
    public Message deleteLink(int id) {
        linkServcie.deleteLink(id);
        return MessageUtil.success();
    }

    @GetMapping("queryLinkById")
    @ApiOperation("查询链接")
    public Link queryLinkById(int id) {
        return linkServcie.queryLinkById(id);
        // return  MessageUtil.success();
    }

    @GetMapping("queryAllLink")
    @ApiOperation("查询所有链接")
    public List<Link> queryAllLink() {
        return linkServcie.queryAllLink();
        // return  MessageUtil.success();
    }
}
