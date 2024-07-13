package com.sky.basket.service;

import java.util.Collection;
import java.util.Set;

public interface BasketService {

    void addItems(Set<Integer> goodsId);

    Collection<Integer> getItems();
}
