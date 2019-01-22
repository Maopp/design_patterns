package com.catpp.design_patterns.cglib_proxy;

import com.catpp.design_patterns.cglib_proxy.proxy.CglibProxy;

/**
 * com.catpp.design_patterns.cglib_proxy
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class CglibProxyDemo {

    public static void main(String[] args) {

        // 生成cglib代理类
        Engineer proxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 会被增强
        proxy.eat();
        // 不会被增强
        proxy.work();
    }
}
