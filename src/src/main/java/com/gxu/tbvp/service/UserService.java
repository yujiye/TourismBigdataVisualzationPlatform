package com.gxu.tbvp.service;

import com.github.pagehelper.PageInfo;
import com.gxu.tbvp.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService extends IService<User>{

    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

    int insertBach(List<User> userList);

    int countSex(User user);
}
