package com.example.mall.service;

import com.example.mall.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
public interface IUserService extends IService<User> {

    User getByName(String name);
}
