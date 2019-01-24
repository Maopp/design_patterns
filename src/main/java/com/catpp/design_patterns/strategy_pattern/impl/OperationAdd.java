package com.catpp.design_patterns.strategy_pattern.impl;

import com.catpp.design_patterns.strategy_pattern.Strategy;

/**
 * com.catpp.design_patterns.strategy_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/24
 * @Description
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
