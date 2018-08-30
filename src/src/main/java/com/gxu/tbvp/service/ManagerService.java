package com.gxu.tbvp.service;

import com.gxu.tbvp.domain.Manager;

public interface ManagerService extends IService<Manager>{
    Manager selectByUsername(String username);
}
