package com.catpp.design_patterns.adapter_pattern.impl;

import com.catpp.design_patterns.adapter_pattern.MediaPlayer;
import com.catpp.design_patterns.adapter_pattern.adapter.MediaAdapter;

/**
 * com.catpp.design_patterns.adapter_pattern.impl
 *
 * @Author cat_pp
 * @Date 2019/1/17
 * @Description
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        // 播放MP3格式文件
        if (audioType.equalsIgnoreCase("mp3")) {
            System.err.println("Playing mp3 file. Name: "+ fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.err.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
