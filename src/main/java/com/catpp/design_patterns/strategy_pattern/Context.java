package com.catpp.design_patterns.strategy_pattern;

/**
 * com.catpp.design_patterns.strategy_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/24
 * @Description
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return this.strategy.doOperation(num1, num2);
    }
}
