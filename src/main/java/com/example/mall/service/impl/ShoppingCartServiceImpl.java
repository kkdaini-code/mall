package com.example.mall.service.impl;

import com.example.mall.bean.ShoppingCart;
import com.example.mall.mapper.ShoppingCartMapper;
import com.example.mall.service.IShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-30
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements IShoppingCartService {
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public List<Map<String, Object>> find(Integer id) {
        return shoppingCartMapper.find(id);
    }

    @Override
    public boolean removes(Integer uid, List<Integer> gids) {
        return shoppingCartMapper.removes(uid,gids);
    }
}
