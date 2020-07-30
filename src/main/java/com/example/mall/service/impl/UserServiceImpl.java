package com.example.mall.service.impl;

import com.example.mall.bean.User;
import com.example.mall.mapper.UserMapper;
import com.example.mall.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
   private  UserMapper userMapper;

    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }
}
