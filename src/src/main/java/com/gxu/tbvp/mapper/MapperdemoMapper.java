package com.gxu.tbvp.mapper;

import com.gxu.tbvp.domain.Mapperdemo;
import com.gxu.tbvp.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper

@Component(value = "MapperdemoMapper")
public interface MapperdemoMapper extends MyMapper<Mapperdemo> {
}