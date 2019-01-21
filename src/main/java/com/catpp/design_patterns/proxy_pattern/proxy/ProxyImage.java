package com.catpp.design_patterns.proxy_pattern.proxy;

import com.catpp.design_patterns.proxy_pattern.Image;
import com.catpp.design_patterns.proxy_pattern.impl.RealImage;

/**
 * com.catpp.design_patterns.proxy_pattern.proxy
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
