package com.gxu.tbvp.controller;

import com.gxu.tbvp.domain.User;
import com.gxu.tbvp.service.UserService;
import com.gxu.tbvp.utils.PasswordHelper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by zqw.
 *
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value="/addUser",method= RequestMethod.GET)
    public String addUser(){
        return "register";
    }

    @RequestMapping(value="/addUser",method=RequestMethod.POST)
    public String login(HttpServletRequest request, User user, Model model){
        User u = userService.selectByUsername(user.getUsername());
        if(u != null)
            return "error";
        try {
            user.setEnable(1);
            PasswordHelper passwordHelper = new PasswordHelper();
            passwordHelper.encryptPassword(user);
            user.setRegisterTime(new Date());
            userService.save(user);
            return "login";
        } catch (Exception e) {
            e.printStackTrace();
            return "404";
        }
    }
}
