package com.example.mall.controller;


import com.example.mall.bean.Discount;
import com.example.mall.service.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-29
 */
@RestController
public class DiscountController {
    @Autowired
    private IDiscountService discountService;
    @GetMapping("/discount")
    public List<Discount> getDis(){
        return discountService.list();
    }
}
