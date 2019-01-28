package com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl;

import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.ComputerPart;
import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.visitor.ComputerPartVisitor;

/**
 * com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj.impl
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[] {new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
