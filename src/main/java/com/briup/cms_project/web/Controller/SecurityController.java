package com.briup.cms_project.web.Controller;

import com.briup.cms_project.untils.Message;
import com.briup.cms_project.untils.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class SecurityController {
    @GetMapping("/authenticaion/login")
    public Message logg() {
        return MessageUtil.error(403,"该用户没有登陆，请跳转到登陆页面");
    }
}
