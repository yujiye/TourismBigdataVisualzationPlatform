package com.gxu.tbvp.service.serviceImpl;

import com.gxu.tbvp.domain.Region;
import com.gxu.tbvp.mapper.RegionMapper;
import com.gxu.tbvp.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import com.gxu.tbvp.service.serviceImpl.BaseService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("RegionService")
public class RegionServiceImpl extends BaseService<Region> implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> selectProvince() {
        Example example = new Example(Region.class);
        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo("parentId",0);
        List<Region> regionList = selectByExample(example);

        //自定义Mapper函数
        //List<Region> regionList =regionMapper.getProvinceMsg();、

        if (regionList != null) {
            return regionList;
        } else {
            return null;
        }
    }
}
