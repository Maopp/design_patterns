package com.catpp.design_patterns.interpreter_pattern.impl;

import com.catpp.design_patterns.interpreter_pattern.Expression;

/**
 * com.catpp.design_patterns.interpreter_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class OrExpression implements Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
