package com.catpp.design_patterns.jdk_dynamic_proxy;

import com.catpp.design_patterns.jdk_dynamic_proxy.service.FemaleArtist;

/**
 * com.catpp.design_patterns.jdk_dynamic_proxy
 *
 * @Author cat_pp
 * @Date 2019/1/10
 * @Description 土豪，打算和范冰冰约会
 */
public class TuHao {

    private float height;

    public TuHao(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void dating(FemaleArtist femaleArtist) {
        femaleArtist.dating(height);
    }
}
