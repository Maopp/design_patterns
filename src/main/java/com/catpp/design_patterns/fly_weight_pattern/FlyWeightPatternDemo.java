package com.catpp.design_patterns.fly_weight_pattern;

import com.catpp.design_patterns.fly_weight_pattern.factory.ShapeFactory;
import com.catpp.design_patterns.fly_weight_pattern.impl.Circle;

/**
 * com.catpp.design_patterns.fly_weight_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class FlyWeightPatternDemo {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                createCircle();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                createCircle();
            }
        }).start();
    }

    private synchronized static void createCircle() {
        for (int i = 0;i < 20;i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100 );
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
