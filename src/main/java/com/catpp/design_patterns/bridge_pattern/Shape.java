package com.catpp.design_patterns.bridge_pattern;

/**
 * com.catpp.design_patterns.bridge_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description 使用桥接接口创建抽象类
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
