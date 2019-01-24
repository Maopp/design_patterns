package com.catpp.design_patterns.strategy_pattern;

import com.catpp.design_patterns.strategy_pattern.impl.OperationAdd;
import com.catpp.design_patterns.strategy_pattern.impl.OperationMultiply;
import com.catpp.design_patterns.strategy_pattern.impl.OperationSubstract;

/**
 * com.catpp.design_patterns.strategy_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
