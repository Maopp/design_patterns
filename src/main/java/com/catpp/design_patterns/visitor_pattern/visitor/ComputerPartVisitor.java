package com.catpp.design_patterns.visitor_pattern.visitor;

import com.catpp.design_patterns.visitor_pattern.obj.impl.Computer;
import com.catpp.design_patterns.visitor_pattern.obj.impl.Keyboard;
import com.catpp.design_patterns.visitor_pattern.obj.impl.Monitor;
import com.catpp.design_patterns.visitor_pattern.obj.impl.Mouse;

/**
 * com.catpp.design_patterns.visitor_pattern.visitor
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 访问者接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
