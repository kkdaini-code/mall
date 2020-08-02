package com.example.mall.mapper;

import com.example.mall.bean.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    List<Map<String, Object>> featured(int tid);

    List<Map<String, Object>> findAll();

    Map<String, Object> find(int gid);
}
