package com.pinyougou.account.dao.impl;

import com.pinyougou.account.dao.AccountDao;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.dao.impl
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:43
 * @Version:1.0
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账号");
    }
}
