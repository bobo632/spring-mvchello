package com.sunyx.controller;

import com.sunyx.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sunyx on 2019/1/25.
 */
@Controller
public class ItemController {
    @RequestMapping("itemList")
    public ModelAndView itemList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1,"电视",1009d,new Date(),"good"));
        items.add(new Item(2,"冰箱",1003d,new Date(),"good"));
        items.add(new Item(3,"ipad",1002d,new Date(),"good"));
        items.add(new Item(4,"iphone",1001d,new Date(),"good"));
        modelAndView.setViewName("itemList");
        modelAndView.addObject("itemList",items);
        return modelAndView;
    }
}
