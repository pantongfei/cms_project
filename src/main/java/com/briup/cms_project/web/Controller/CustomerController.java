package com.briup.cms_project.web.Controller;

import com.briup.cms_project.bean.Customer;
import com.briup.cms_project.service.ICustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(description = "客户管理")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping("/authentication/form")
    @ApiOperation("登陆逻辑")
    public void login(String username,String password) {

    }
    /*@GetMapping("/getUserDetailByToken")
    @ApiOperation(value = "根据token得到用户信息")
    public Message<UserDetails> getUserDetailByToken(HttpServletRequest request, HttpServletResponse response) {
        String token = request.getHeader(JwtTokenUtils.TOKEN_HEADER);
        response.setContentType("application/json;charset=UTF-8");
        if (token != null && StringUtils.startsWith(token, JwtTokenUtils.TOKEN_PREFIX)) {
            token = StringUtils.substring(token, JwtTokenUtils.TOKEN_PREFIX.length());
            UserDetails details = userDetailService.loadUserByUsername(JwtTokenUtils.getUsername(token));
            return MessageUtil.success(details);
        } else {
            return MessageUtil.error(401, "token失效");
        }
    }*/

    /*@GetMapping("/login1")
    @ApiOperation("客户登录")
    public Message<Customer>loginCustomer(String userName, String password){
        Customer customer = iCustomerService.LoginCustomer(userName, password);
        return MessageUtil.success(customer);
    }*/
 /*   @GetMapping("registerCustomer")
    @ApiOperation("注册用户")
    public Message registerCustomer(Customer customer){
        iCustomerService.registerCustomer(customer);
        return  MessageUtil.success();
    }*/
}

