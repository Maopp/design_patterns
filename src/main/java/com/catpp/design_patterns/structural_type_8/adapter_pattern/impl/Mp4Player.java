package com.catpp.design_patterns.structural_type_8.adapter_pattern.impl;

import com.catpp.design_patterns.structural_type_8.adapter_pattern.AdvancedMediaPlayer;

/**
 * com.catpp.design_patterns.structural_type_8.adapter_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.err.println("Playing mp4 file. Name: "+ fileName);
    }
}
