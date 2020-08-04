package com.example.mall.controller;


import com.example.mall.bean.User;
import com.example.mall.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-30
 */
@RestController
public class ShoppingCartController {
    @Autowired
    private IShoppingCartService shoppingCartService;
    @GetMapping("/shopping-cart")
    public List<Map<String,Object>> cart(HttpSession session){
        User user =(User)session.getAttribute("user");
        Integer id = user.getId();
        return shoppingCartService.find(id);
    }
    @DeleteMapping("/shopping-cart")
    public boolean cart(HttpSession session, @RequestParam List<Integer> gids){
        User user =(User)session.getAttribute("user");
        Integer uid = user.getId();
        return  shoppingCartService.removes(uid,gids);
    }
}
