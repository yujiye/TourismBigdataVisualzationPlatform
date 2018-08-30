package com.gxu.tbvp.controller;

import com.gxu.tbvp.domain.Mapperdemo;
import com.gxu.tbvp.domain.Region;
import com.gxu.tbvp.mapper.MapperdemoMapper;
import com.gxu.tbvp.service.RegionService;
import org.n3r.idworker.Sid;
import com.gxu.tbvp.exception.SelfJSONResult;
import com.gxu.tbvp.service.MapperDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("testmapper")
public class MapperDemoController {

    @Resource
    private MapperDemoService mapperDemoService;

    @Resource
    private RegionService regionService;

//    @Autowired
//    private Sid sid;
    @RequestMapping("/saveMapperDemo")
    public SelfJSONResult saveMapperDemo() throws Exception {
//        String userId = sid.nextShort();

        Mapperdemo mapperdemo = new Mapperdemo();
        mapperdemo.setUserId("zxcv");
        mapperdemo.setUserEmail("97@qq.com");
        mapperdemo.setUserName("testmapper");
        mapperdemo.setUserPassword("123");
        mapperdemo.setUserPhone("123456");
        mapperdemo.setUserCreatedTime(new Date());

        mapperDemoService.saveMapperDemo(mapperdemo);

        return SelfJSONResult.ok("save success!");
    }

    //随机生成start-end之间的数
    public static int getNum(int start, int end) {
        return (int)(Math.random()*(end - start +1)+start);
    }

    /*
    返回用户地址
    */
    @RequestMapping("/testadd")
    public Region getAddress(){
        List<Region> regionList = new ArrayList<>();
        regionList = regionService.selectProvince();
        //35省
        int index = getNum(0, 34);
        return regionList.get(index);
    }

}
