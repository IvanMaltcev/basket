package com.sky.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Component
@SessionScope
public class Basket {

    private final Set<Integer> items;

    public Basket(Set<Integer> items) {
        this.items = items;
    }

    public Set<Integer> getItems() {
        return items;
    }

    public void addItemsToBasket(Set<Integer> goodsId) {
        items.addAll(goodsId);
    }
}
