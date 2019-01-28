package com.catpp.design_patterns.behaivor_type_12.visitor_pattern.obj;

import com.catpp.design_patterns.behaivor_type_12.visitor_pattern.visitor.ComputerPartVisitor;

/**
 * com.catpp.design_patterns.behaivor_type_12.visitor_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 表示电脑元素的接口
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
