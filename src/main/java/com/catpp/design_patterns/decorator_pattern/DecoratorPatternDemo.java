package com.catpp.design_patterns.decorator_pattern;

import com.catpp.design_patterns.decorator_pattern.decorator.impl.RedShapeDecorator;
import com.catpp.design_patterns.decorator_pattern.impl.Circle;
import com.catpp.design_patterns.decorator_pattern.impl.Rectangle;

/**
 * com.catpp.design_patterns.decorator_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println(System.getProperty("line.separator") + "Circle of red border");
        redCircle.draw();

        System.out.println(System.getProperty("line.separator") + "Rectangle of red border");
        redRectangle.draw();
    }
}
