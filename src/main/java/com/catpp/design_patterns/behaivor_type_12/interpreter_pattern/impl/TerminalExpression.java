package com.catpp.design_patterns.behaivor_type_12.interpreter_pattern.impl;

import com.catpp.design_patterns.behaivor_type_12.interpreter_pattern.Expression;

/**
 * com.catpp.design_patterns.behaivor_type_12.interpreter_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
