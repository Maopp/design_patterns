package com.catpp.design_patterns.singleton_pattern;

/**
 * com.catpp.design_patterns.singleton_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 单例对象
 */
public class SingleObject {

    /**
     * 创建对象
     */
    private static SingleObject intance = new SingleObject();

    /**
     * 构造函数私有化
     */
    private SingleObject() {
    }

    /**
     * 对外提供获取对象的方法
     * @return
     */
    public static SingleObject getIntance() {
        return intance;
    }

    public void showMessage() {
        System.err.println("Hello World!");
    }

}
