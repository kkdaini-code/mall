package com.example.mall.mapper;

import com.example.mall.bean.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-30
 */
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

    List<Map<String, Object>> find(Integer id);
}
