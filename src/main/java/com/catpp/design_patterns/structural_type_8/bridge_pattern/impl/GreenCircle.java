package com.catpp.design_patterns.structural_type_8.bridge_pattern.impl;

import com.catpp.design_patterns.structural_type_8.bridge_pattern.DrawAPI;

/**
 * com.catpp.design_patterns.structural_type_8.bridge_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description 桥接实现类
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.err.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
