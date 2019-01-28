package com.catpp.design_patterns.structural_type_8.bridge_pattern.entity;

import com.catpp.design_patterns.structural_type_8.bridge_pattern.DrawAPI;
import com.catpp.design_patterns.structural_type_8.bridge_pattern.Shape;

/**
 * com.catpp.design_patterns.structural_type_8.bridge_pattern.entity
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description 实现抽象类的实体类
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
