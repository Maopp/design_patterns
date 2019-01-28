package com.catpp.design_patterns.creation_type_5.prototype_pattern;

import com.catpp.design_patterns.creation_type_5.prototype_pattern.cache.ShapeCache;

/**
 * com.catpp.design_patterns.creation_type_5.prototype_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.err.println("Shape：" + circle.getType());

        Shape rectangle = ShapeCache.getShape("2");
        System.err.println("Shape：" + rectangle.getType());

        Shape square = ShapeCache.getShape("3");
        System.err.println("Shape：" + square.getType());
    }
}
