package com.catpp.design_patterns.factory_pattern.factory;

import com.catpp.design_patterns.factory_pattern.Shape;
import com.catpp.design_patterns.factory_pattern.impl.Circle;
import com.catpp.design_patterns.factory_pattern.impl.Rectangle;
import com.catpp.design_patterns.factory_pattern.impl.Square;

/**
 * com.catpp.design_patterns.factory_pattern.factory
 *
 * @Author cat_pp
 * @Date 2019/1/15
 * @Description 工厂类，生成基于给定信息的实体类的对象
 */
public class ShapeFactory {

    /**
     * 根据传入的参数类型创建不同的实体类
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (null == shapeType) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
