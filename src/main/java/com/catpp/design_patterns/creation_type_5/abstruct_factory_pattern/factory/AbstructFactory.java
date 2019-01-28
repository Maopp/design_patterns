package com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.factory;

import com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.color.Color;
import com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.shape.Shape;

/**
 * com.catpp.design_patterns.creation_type_5.abstruct_factory_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 抽象工厂获取实体类
 */
public abstract class AbstructFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
