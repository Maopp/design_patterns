package com.catpp.design_patterns.abstruct_factory_pattern.factory;

import com.catpp.design_patterns.abstruct_factory_pattern.color.Color;
import com.catpp.design_patterns.abstruct_factory_pattern.color.impl.Blue;
import com.catpp.design_patterns.abstruct_factory_pattern.color.impl.Green;
import com.catpp.design_patterns.abstruct_factory_pattern.color.impl.Red;
import com.catpp.design_patterns.abstruct_factory_pattern.shape.Shape;

/**
 * com.catpp.design_patterns.abstruct_factory_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 工厂类
 */
public class ColorFactory extends AbstructFactory {
    @Override
    public Color getColor(String color) {
        if (null == color) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
