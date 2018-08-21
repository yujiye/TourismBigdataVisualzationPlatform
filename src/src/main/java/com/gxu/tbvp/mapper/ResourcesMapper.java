package com.gxu.tbvp.mapper;

import com.gxu.tbvp.domain.Resources;
import com.gxu.tbvp.utils.MyMapper;

import java.util.List;
import java.util.Map;

public interface ResourcesMapper extends MyMapper<Resources> {

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}