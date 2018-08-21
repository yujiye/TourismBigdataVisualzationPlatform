package com.gxu.tbvp.mapper;

import com.gxu.tbvp.domain.Role;
import com.gxu.tbvp.utils.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}