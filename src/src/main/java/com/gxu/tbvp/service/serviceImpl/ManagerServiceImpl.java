package com.gxu.tbvp.service.serviceImpl;

import com.gxu.tbvp.domain.Manager;
import com.gxu.tbvp.service.ManagerService;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("managerService")
public class ManagerServiceImpl extends BaseService<Manager> implements ManagerService {
    @Override
    public Manager selectByUsername(String username){
        Example example = new Example(Manager.class);
        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo("username", username);
        List<Manager> managerList = selectByExample(example);
        if(managerList.size()>0){
            return managerList.get(0);
        }
        return null;
    }

}
