package com.kwai.login;

/**
 * Date    : 2021/3/8
 * Author  : shibowen@kuaishou.com
 **/
public class ServiceFactory {
  private static volatile ServiceFactory serviceFactory;
  private IAccountService accountService;

  private ServiceFactory() {
  }

  public static ServiceFactory getInstance() {
    if (serviceFactory == null) {
      synchronized (ServiceFactory.class) {
        if (serviceFactory == null) {
          serviceFactory = new ServiceFactory();
        }
      }
    }
    return serviceFactory;
  }

  public void setAccountService(IAccountService accountService) {
    this.accountService = accountService;
  }

  public IAccountService getAccountService() {
    if (accountService == null) {
      return new EmptyAccountServiceImpl();
    } else {
      return accountService;
    }
  }
}
