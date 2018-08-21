package com.gxu.tbvp.mapper;

import com.gxu.tbvp.domain.UserRole;
import com.gxu.tbvp.utils.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}