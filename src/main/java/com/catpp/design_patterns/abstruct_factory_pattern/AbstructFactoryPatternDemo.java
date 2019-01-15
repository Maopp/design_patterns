package com.catpp.design_patterns.abstruct_factory_pattern;

import com.catpp.design_patterns.abstruct_factory_pattern.color.Color;
import com.catpp.design_patterns.abstruct_factory_pattern.factory.AbstructFactory;
import com.catpp.design_patterns.abstruct_factory_pattern.factory.FactoryProducer;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.Shape;

/**
 * com.catpp.design_patterns.abstruct_factory_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description
 */
public class AbstructFactoryPatternDemo {

    public static void main(String[] args) {

        // 获取形状工厂
        AbstructFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        // 获取颜色工厂
        AbstructFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }
}
