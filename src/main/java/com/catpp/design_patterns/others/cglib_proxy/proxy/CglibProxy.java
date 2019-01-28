package com.catpp.design_patterns.others.cglib_proxy.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * com.catpp.design_patterns.others.cglib_proxy.proxy
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description cglib代理类
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before invocation");
        Object invoke = method.invoke(target, objects);
        System.out.println("after invocation");
        return invoke;
    }

    public static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        // 设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        // 设置代理人
        enhancer.setCallback(new CglibProxy(target));
        return  enhancer.create();
    }
}
