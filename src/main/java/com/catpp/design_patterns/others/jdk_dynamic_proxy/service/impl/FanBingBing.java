package com.catpp.design_patterns.others.jdk_dynamic_proxy.service.impl;

import com.catpp.design_patterns.others.jdk_dynamic_proxy.service.FemaleArtist;

/**
 * com.catpp.design_patterns.others.jdk_dynamic_proxy.service.impl
 *
 * @Author cat_pp
 * @Date 2019/1/10
 * @Description 女艺人范冰冰
 */
public class FanBingBing implements FemaleArtist {
    @Override
    public boolean dating(float height) {
        if (height >= 1.7f) {
            System.err.println("可以约会啦。。。");
            return true;
        }
        System.err.println("不约。。。");
        return false;
    }
}
