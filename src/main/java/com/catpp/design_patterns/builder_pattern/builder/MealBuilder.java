package com.catpp.design_patterns.builder_pattern.builder;

import com.catpp.design_patterns.builder_pattern.entity.Meal;
import com.catpp.design_patterns.builder_pattern.item.entity.ChickenBurger;
import com.catpp.design_patterns.builder_pattern.item.entity.Coke;
import com.catpp.design_patterns.builder_pattern.item.entity.Pepsi;
import com.catpp.design_patterns.builder_pattern.item.entity.VegBurger;

/**
 * com.catpp.design_patterns.builder_pattern.builder
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 套餐建造器
 */
public class MealBuilder {

    /**
     * 创建素食套餐
     *
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 创建鸡肉套餐
     *
     * @return
     */
    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
