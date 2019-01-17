package com.catpp.design_patterns.adapter_pattern;

import com.catpp.design_patterns.adapter_pattern.impl.AudioPlayer;

/**
 * com.catpp.design_patterns.adapter_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
