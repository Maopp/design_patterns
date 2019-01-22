package com.catpp.design_patterns.cglib_proxy;

/**
 * com.catpp.design_patterns.cglib_proxy
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 可以被代理的类
 */
public class Engineer {

    /**
     * 可以被代理的方法
     */
    public void eat() {
        System.out.println("工程师正在吃饭");
    }

    /**
     * final方法不能被子类覆盖
     */
    public final void work() {
        System.out.println("工程师正在工作");
    }

    /**
     * private方法不能被子类覆盖
     */
    private void play() {
        System.out.println("This engineer is playing game.");
    }
}
