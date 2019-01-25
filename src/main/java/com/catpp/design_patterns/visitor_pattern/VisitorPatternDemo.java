package com.catpp.design_patterns.visitor_pattern;

import com.catpp.design_patterns.visitor_pattern.obj.ComputerPart;
import com.catpp.design_patterns.visitor_pattern.obj.impl.Computer;
import com.catpp.design_patterns.visitor_pattern.visitor.impl.ComputerPartDisplayVisitor;

/**
 * com.catpp.design_patterns.visitor_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computerPart = new Computer();

        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
