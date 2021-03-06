package com.catpp.design_patterns.behaivor_type_12.interpreter_pattern;

/**
 * com.catpp.design_patterns.behaivor_type_12.interpreter_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 表达式接口
 */
public interface Expression {

    public boolean interpret(String context);
}
