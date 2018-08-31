package com.gxu.tbvp.mapper;

import com.gxu.tbvp.domain.Manager;
import com.gxu.tbvp.utils.MyMapper;

import java.util.List;

public interface ManagerMapper extends MyMapper<Manager> {
    public List<Manager> selectByUsername(String username);
}