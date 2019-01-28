package com.catpp.design_patterns.structural_type_8.decorator_pattern.decorator;

import com.catpp.design_patterns.structural_type_8.decorator_pattern.Shape;

/**
 * com.catpp.design_patterns.structural_type_8.decorator_pattern.decorator
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description 接口的抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
