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
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
