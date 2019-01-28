package com.catpp.design_patterns.structural_type_8.adapter_pattern.adapter;

import com.catpp.design_patterns.structural_type_8.adapter_pattern.AdvancedMediaPlayer;
import com.catpp.design_patterns.structural_type_8.adapter_pattern.MediaPlayer;
import com.catpp.design_patterns.structural_type_8.adapter_pattern.impl.Mp4Player;
import com.catpp.design_patterns.structural_type_8.adapter_pattern.impl.VlcPlayer;

/**
 * com.catpp.design_patterns.structural_type_8.adapter_pattern.adapter
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description 播放器适配器类
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
