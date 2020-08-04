package com.example.mall.service;

import com.example.mall.bean.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-30
 */
public interface IShoppingCartService extends IService<ShoppingCart> {

    List<Map<String, Object>> find(Integer id);

    boolean removes(Integer uid, List<Integer> gids);
}
