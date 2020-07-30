package com.example.mall.mapper;

import com.example.mall.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
public interface UserMapper extends BaseMapper<User> {

    User getByName(String name);
}
