package com.example.mall.controller;


import com.example.mall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
@RestController
@RequestMapping("//pu")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/goods")
    public List<Map<String, Object>> getGoods(){
        return goodsService.listMaps();
    }
}
