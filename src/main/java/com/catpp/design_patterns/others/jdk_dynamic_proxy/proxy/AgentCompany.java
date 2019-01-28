package com.catpp.design_patterns.others.jdk_dynamic_proxy.proxy;

import com.catpp.design_patterns.others.jdk_dynamic_proxy.service.FemaleArtist;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * com.catpp.design_patterns.others.jdk_dynamic_proxy.proxy
 *
 * @Author cat_pp
 * @Date 2019/1/10
 * @Description 经纪人公司，代理艺人活动
 */
public class AgentCompany implements InvocationHandler {

    protected FemaleArtist femaleArtist;

    public AgentCompany(FemaleArtist femaleArtist) {
        this.femaleArtist = femaleArtist;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 约会之前
        beforeDating();
        Object invoke = method.invoke(femaleArtist, args);
        // 约会之后
        afterDating();
        return invoke;
    }

    private void afterDating() {
        System.err.println("约会之前要打扮一下哦。。。");
    }

    private void beforeDating() {
        System.err.println("约会之后洗个澡吧。。。");
    }
}
