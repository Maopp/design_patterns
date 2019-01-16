package com.catpp.design_patterns.builder_pattern;

import com.catpp.design_patterns.builder_pattern.builder.MealBuilder;
import com.catpp.design_patterns.builder_pattern.entity.Meal;

/**
 * com.catpp.design_patterns.builder_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.err.println("Veg Meal");
        vegMeal.showItems();
        System.err.println("Total Cost：" + vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.err.println(System.getProperty("line.separator") + "Chicken Meal");
        chickenMeal.showItems();
        System.err.println("Total Cost：" + chickenMeal.getCost());
    }
}
