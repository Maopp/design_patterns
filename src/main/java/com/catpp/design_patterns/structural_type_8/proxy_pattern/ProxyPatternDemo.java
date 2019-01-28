package com.catpp.design_patterns.structural_type_8.proxy_pattern;

import com.catpp.design_patterns.structural_type_8.proxy_pattern.proxy.ProxyImage;

/**
 * com.catpp.design_patterns.structural_type_8.proxy_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("picture");

        // 图片将从磁盘加载
        image.display();

        // 图片不需要从磁盘加载
        image.display();
    }
}
