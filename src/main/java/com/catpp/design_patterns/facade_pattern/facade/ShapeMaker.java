package com.catpp.design_patterns.facade_pattern.facade;

import com.catpp.design_patterns.facade_pattern.Shape;
import com.catpp.design_patterns.facade_pattern.impl.Circle;
import com.catpp.design_patterns.facade_pattern.impl.Rectangle;
import com.catpp.design_patterns.facade_pattern.impl.Square;

/**
 * com.catpp.design_patterns.facade_pattern.facade
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description 外观类
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * 重写空参构造函数
     */
    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
