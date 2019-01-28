package com.catpp.design_patterns.structural_type_8.fly_weight_pattern.factory;

import com.catpp.design_patterns.structural_type_8.fly_weight_pattern.Shape;
import com.catpp.design_patterns.structural_type_8.fly_weight_pattern.impl.Circle;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * com.catpp.design_patterns.structural_type_8.fly_weight_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new WeakHashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
