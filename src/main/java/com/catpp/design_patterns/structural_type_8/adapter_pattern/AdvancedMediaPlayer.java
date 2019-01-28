package com.catpp.design_patterns.structural_type_8.adapter_pattern;

/**
 * com.catpp.design_patterns.structural_type_8.adapter_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description 其他格式播放器接口类
 */
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}
