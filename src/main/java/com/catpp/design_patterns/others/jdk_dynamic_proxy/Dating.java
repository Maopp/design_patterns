package com.catpp.design_patterns.others.jdk_dynamic_proxy;

import com.catpp.design_patterns.others.jdk_dynamic_proxy.proxy.AgentCompany;
import com.catpp.design_patterns.others.jdk_dynamic_proxy.service.FemaleArtist;
import com.catpp.design_patterns.others.jdk_dynamic_proxy.service.impl.FanBingBing;

import java.lang.reflect.Proxy;

/**
 * com.catpp.design_patterns.others.jdk_dynamic_proxy
 *
 * @Author cat_pp
 * @Date 2019/1/10
 * @Description 约会测试类
 */
public class Dating {

    public static void main(String[] args) {
        TuHao tuHao = new TuHao(1.8f);
        FanBingBing fanBingBing = new FanBingBing();
        FemaleArtist proxyInstance = (FemaleArtist) Proxy.newProxyInstance(fanBingBing.getClass().getClassLoader(),
                fanBingBing.getClass().getInterfaces(), new AgentCompany(fanBingBing));

        tuHao.dating(proxyInstance);
    }
}
