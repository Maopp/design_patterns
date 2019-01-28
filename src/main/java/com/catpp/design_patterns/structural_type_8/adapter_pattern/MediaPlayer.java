package com.catpp.design_patterns.structural_type_8.adapter_pattern;

/**
 * com.catpp.design_patterns.structural_type_8.adapter_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description mp3 播放器接口类
 */
public interface MediaPlayer {

    void play(String audioType, String fileName);
}
