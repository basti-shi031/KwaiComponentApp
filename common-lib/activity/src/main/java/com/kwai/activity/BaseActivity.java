package com.kwai.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kwai.logger.Logger;

/**
 * Activity基类
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class BaseActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Logger.log("BaseActivity","onCreate");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Logger.log("BaseActivity","onDestory");
  }
}
