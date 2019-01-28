package com.catpp.design_patterns.structural_type_8.fly_weight_pattern.impl;

import com.catpp.design_patterns.structural_type_8.fly_weight_pattern.Shape;

/**
 * com.catpp.design_patterns.structural_type_8.fly_weight_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class Circle implements Shape {

    private String color;

    private int x, y, radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
