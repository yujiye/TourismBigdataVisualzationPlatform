package com.gxu.tbvp.service;

import com.github.pagehelper.PageInfo;
import com.gxu.tbvp.domain.User;

import java.util.List;

public interface UserService extends IService<User>{

    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

    int insertBach(List<User> userList);
}
