package com.kwai.video_player;

import android.util.Log;

import com.kwai.net.Net;

/**
 * 视频播放器
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class VideoPlayer {
  public static void play(String url){
    //下载视频
    String video = Net.get(url);
    //播放视频
    playVideo(video);
  }

  private static void playVideo(String video) {
    Log.i("VideoPlayer","play");
  }
}
