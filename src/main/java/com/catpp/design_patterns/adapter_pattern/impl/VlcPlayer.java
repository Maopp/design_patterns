package com.catpp.design_patterns.adapter_pattern.impl;

import com.catpp.design_patterns.adapter_pattern.AdvancedMediaPlayer;

/**
 * com.catpp.design_patterns.adapter_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.err.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
