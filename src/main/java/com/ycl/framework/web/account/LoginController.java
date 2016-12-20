package com.ycl.framework.web.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yao on 2016/11/15.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(LoginController.class);

    public LoginController() {
        log.info("LoginController init...");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        log.info("enter login");
        return "account/login";
    }

    @RequestMapping(value="error",method = RequestMethod.GET)
    @ResponseBody
    public String error(){
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        log.error("invoke error");
        return "error";
    }
}
