package com.catpp.design_patterns.creation_type_5.prototype_pattern.cache;

import com.catpp.design_patterns.creation_type_5.prototype_pattern.Shape;
import com.catpp.design_patterns.creation_type_5.prototype_pattern.impl.Circle;
import com.catpp.design_patterns.creation_type_5.prototype_pattern.impl.Rectangle;
import com.catpp.design_patterns.creation_type_5.prototype_pattern.impl.Square;

import java.util.Hashtable;

/**
 * com.catpp.design_patterns.creation_type_5.prototype_pattern.cache
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 缓存对象
 */
public class ShapeCache {

    /**
     * 维护一张Hashtable存储shape
     */
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        try {
            return (Shape) cacheShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     * shapeMap.put(shapeKey, shape)
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
