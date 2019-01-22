package com.catpp.design_patterns.chain_of_responsibility_pattern.sub;

import com.catpp.design_patterns.chain_of_responsibility_pattern.AbstractLogger;

/**
 * com.catpp.design_patterns.chain_of_responsibility_pattern.sub
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
