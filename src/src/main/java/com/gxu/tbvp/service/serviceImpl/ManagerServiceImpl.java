package com.gxu.tbvp.service.serviceImpl;

import com.gxu.tbvp.domain.Manager;
import com.gxu.tbvp.mapper.ManagerMapper;
import com.gxu.tbvp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("managerService")
public class ManagerServiceImpl extends BaseService<Manager> implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager selectByUsername(String username){
        List<Manager> managerList = managerMapper.selectByUsername(username);
        if(managerList.size()>0){
            return managerList.get(0);
        }
        return null;
    }

}
