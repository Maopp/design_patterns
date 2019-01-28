package com.catpp.design_patterns.creation_type_5.factory_pattern;

import com.catpp.design_patterns.creation_type_5.factory_pattern.factory.ShapeFactory;

/**
 * com.catpp.design_patterns.creation_type_5.factory_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
