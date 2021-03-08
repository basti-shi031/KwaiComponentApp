package com.kwai.login;

/**
 * 空实现类
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class EmptyAccountServiceImpl implements IAccountService{
  @Override
  public boolean isLogin() {
    return false;
  }

  @Override
  public int getUserId() {
    return 0;
  }
}
