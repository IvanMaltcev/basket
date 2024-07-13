package com.sky.basket.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Service
public class BasketServiceImp implements BasketService {

    private final Basket basket;

    public BasketServiceImp(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItems(Set<Integer> goodsId) {
        basket.addItemsToBasket(goodsId);
    }

    @Override
    public Collection<Integer> getItems() {

        return Collections.unmodifiableCollection(basket.getItems());
    }
}
