package com.catpp.design_patterns.abstruct_factory_pattern.factory;

import com.catpp.design_patterns.abstruct_factory_pattern.color.Color;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.Shape;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.impl.Circle;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.impl.Rectangle;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.impl.Square;

/**
 * com.catpp.design_patterns.abstruct_factory_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 工厂类
 */
public class ShapeFactory extends AbstructFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (null == shape) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
