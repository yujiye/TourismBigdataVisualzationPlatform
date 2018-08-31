package com.gxu.tbvp.service.serviceImpl;

import com.gxu.tbvp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gxu.tbvp.domain.Mapperdemo;
import com.gxu.tbvp.mapper.MapperdemoMapper;
import com.gxu.tbvp.service.MapperDemoService;

@Service
public class MapperDemoServiceImpl implements MapperDemoService {

    @Autowired
    private MapperdemoMapper mapperdemoMapper;

    @Override
    public void saveMapperDemo(Mapperdemo mapperdemo) {
        mapperdemoMapper.insert(mapperdemo);
    }
}
