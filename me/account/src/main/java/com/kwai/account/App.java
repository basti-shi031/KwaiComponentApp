package com.kwai.account;

import android.app.Application;

import com.kwai.login.ServiceFactory;

/**
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    ServiceFactory.getInstance().setAccountService(new AccountService());
  }
}
