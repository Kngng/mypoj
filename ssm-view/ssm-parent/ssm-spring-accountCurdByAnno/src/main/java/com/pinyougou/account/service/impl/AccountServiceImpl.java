package com.pinyougou.account.service.impl;

import com.pinyougou.account.dao.AccountDao;
import com.pinyougou.account.dao.impl.AccountDaoImpl;
import com.pinyougou.account.pojo.Account;
import com.pinyougou.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.service.impl
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:40
 * @Version:1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        accountDao.save(account);
    }


}
