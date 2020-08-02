package com.example.mall.service;

import com.example.mall.bean.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
public interface IGoodsService extends IService<Goods> {
    List<Map<String,Object>> featured(int tid);

    List<Map<String, Object>> findAll();

    Map<String, Object> find(int gid);
}
