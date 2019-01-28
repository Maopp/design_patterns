package com.catpp.design_patterns.behaivor_type_12.visitor_pattern.visitor.impl;

import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl.Computer;
import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl.Keyboard;
import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl.Monitor;
import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl.Mouse;
import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.visitor.ComputerPartVisitor;

/**
 * com.catpp.design_patterns.behaivor_type_12.visitor_pattern.visitor.impl
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
