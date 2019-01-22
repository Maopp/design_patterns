package com.catpp.design_patterns.chain_of_responsibility_pattern.sub;

import com.catpp.design_patterns.chain_of_responsibility_pattern.AbstractLogger;

/**
 * com.catpp.design_patterns.chain_of_responsibility_pattern.sub
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
