package com.kwai.account;

import com.kwai.login.IAccountService;

/**
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class AccountService implements IAccountService {
  @Override
  public boolean isLogin() {
    return true;
  }

  @Override
  public int getUserId() {
    return 100;
  }
}
