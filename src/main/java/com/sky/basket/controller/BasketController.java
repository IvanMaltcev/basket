package com.sky.basket.controller;

import com.sky.basket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") Set<Integer> goodsId) {
        basketService.addItems(goodsId);
    }

    @GetMapping(path = "/get")
    public Collection<Integer> get() {
        return basketService.getItems();
    }
}
