package com.briup.cms_project.web.Controller;

import com.briup.cms_project.bean.Category;
import com.briup.cms_project.bean.ex.CategoryEX;
import com.briup.cms_project.service.ICategoryService;
import com.briup.cms_project.untils.Message;
import com.briup.cms_project.untils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
JPA一对多查询，一的一方有list提供get和set方法报错
解决1：换swagger版本到2.92
解决2：再写有一个类，如下方所示

 */
import java.util.List;

@RestController
@RequestMapping("/index")
@Api(description ="首页管理")
public class IndexController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/showIndex")
    @ApiOperation("首页数据")
    //方法1
    /*public Message<List<Category>>showIndex(){
        return MessageUtil.success(categoryService.queryAllCategory());
    }*/
    //方法2
    public  Message<List<CategoryEX>> showIndex(){
        return MessageUtil.success(categoryService.findAllCategoryEx());
    }
}
