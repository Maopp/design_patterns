package com.catpp.design_patterns.creation_type_5.builder_pattern.entity;

import com.catpp.design_patterns.creation_type_5.builder_pattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.creation_type_5.builder_pattern.entity
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 套餐实体类
 */
public class Meal {

    /**
     * 食物条目集合
     */
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.err.print("Item：" + item.name());
            System.err.print("，Packing：" + item.packing());
            System.err.println("，Price：" + item.price());
        }
    }
}
