package com.example.mall.service.impl;

import com.example.mall.bean.Goods;
import com.example.mall.mapper.GoodsMapper;
import com.example.mall.service.IGoodsService;
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
 * @since 2020-07-28
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Map<String, Object>> featured(int tid) {
        return goodsMapper.featured(tid);
    }

    @Override
    public List<Map<String, Object>> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public Map<String, Object> find(int gid) {
        return goodsMapper.find(gid);
    }
}
