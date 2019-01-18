package com.catpp.design_patterns.decorator_pattern.decorator.impl;

import com.catpp.design_patterns.decorator_pattern.Shape;
import com.catpp.design_patterns.decorator_pattern.decorator.ShapeDecorator;

/**
 * com.catpp.design_patterns.decorator_pattern.decorator.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    public void setRedBorder(Shape decoratorShape) {
//        this.redBorder = redBorder;
        System.out.println("Border Color: Red");
    }
}
