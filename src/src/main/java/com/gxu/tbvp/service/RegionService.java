package com.gxu.tbvp.service;

import com.gxu.tbvp.domain.Region;

import java.util.List;

public interface RegionService extends IService<Region>{
    public List<Region> selectProvince();
}
