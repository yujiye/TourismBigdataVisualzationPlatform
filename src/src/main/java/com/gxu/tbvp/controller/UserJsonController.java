package com.gxu.tbvp.controller;

import com.gxu.tbvp.domain.User;
import com.gxu.tbvp.exception.SelfJSONResult;
import com.gxu.tbvp.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserJsonController {

    @Resource
    private UserService userService;

    @RequestMapping("/getSexJson")
    public SelfJSONResult getSexJson() {
        User user =new User();
        user.setProvince("广西");
        Map<String,String> sexMap = new HashMap<String, String>();
        int ui = userService.countSex(user);
        return SelfJSONResult.ok(ui);
    }
}
