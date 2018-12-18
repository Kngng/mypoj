package com.pinyougou.account.service.impl;

import com.pinyougou.account.dao.AccountDao;
import com.pinyougou.account.dao.impl.AccountDaoImpl;
import com.pinyougou.account.service.AccountService;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.service.impl
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:40
 * @Version:1.0
 */
public class AccountServiceImpl implements AccountService {
    //依赖问题待解决
    private AccountDao accountDao = new AccountDaoImpl();
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
