package com.catpp.design_patterns.others.jdk_dynamic_proxy.service;

/**
 * com.catpp.design_patterns.others.jdk_dynamic_proxy
 *
 * @Author cat_pp
 * @Date 2019/1/10
 * @Description 代理接口
 */
public interface FemaleArtist {

    /**
     * 约会接口
     *
     * @param height 身高
     * @return 是否同意约会
     */
    boolean dating(float height);
}
