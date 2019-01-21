package com.catpp.design_patterns.proxy_pattern.impl;

import com.catpp.design_patterns.proxy_pattern.Image;

/**
 * com.catpp.design_patterns.proxy_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/21
 * @Description
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
