package com.catpp.design_patterns.abstruct_factory_pattern.factory;

/**
 * com.catpp.design_patterns.abstruct_factory_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 工厂创造器/生成器类
 */
public class FactoryProducer {

    public static AbstructFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
