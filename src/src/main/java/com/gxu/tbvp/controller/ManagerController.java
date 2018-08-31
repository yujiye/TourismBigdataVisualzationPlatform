package com.gxu.tbvp.controller;

import com.gxu.tbvp.domain.Manager;
import com.gxu.tbvp.service.ManagerService;
import com.gxu.tbvp.utils.PasswordHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ManagerController {
    @Resource
    private ManagerService managerService;
    @RequestMapping(value="/addManager",method=RequestMethod.POST)
    public String addManager(HttpServletRequest request, Manager manager, Model model){
        Manager m = managerService.selectByUsername(manager.getUsername());
        if(m != null)
            return "error";
        try {
            manager.setRole(0);
            manager.setEnable(1);
            PasswordHelper passwordHelper = new PasswordHelper();
            passwordHelper.encryptPassword(manager);
            manager.setRegisterTime(new Date());
            managerService.save(manager);
            return "login";
        } catch (Exception e) {
            e.printStackTrace();
            return "404";
        }
    }
}
