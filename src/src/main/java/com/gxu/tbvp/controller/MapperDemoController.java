package com.gxu.tbvp.controller;

import com.gxu.tbvp.domain.Mapperdemo;
import org.n3r.idworker.Sid;
import com.gxu.tbvp.exception.SelfJSONResult;
import com.gxu.tbvp.service.MapperDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("testmapper")
public class MapperDemoController {

    @Autowired
    private MapperDemoService mapperDemoService;

//    @Autowired
//    private Sid sid;

    @RequestMapping("/saveMapperDemo")
    public SelfJSONResult saveMapperDemo() throws Exception {
//        String userId = sid.nextShort();

        Mapperdemo mapperdemo = new Mapperdemo();
        mapperdemo.setUserId("ears");
        mapperdemo.setUserEmail("97@qq.com");
        mapperdemo.setUserName("testmapper");
        mapperdemo.setUserPassword("123");
        mapperdemo.setUserPhone("123456");
        mapperdemo.setUserCreatedTime(new Date());

        mapperDemoService.saveMapperDemo(mapperdemo);

        return SelfJSONResult.ok("save success!");
    }

}
