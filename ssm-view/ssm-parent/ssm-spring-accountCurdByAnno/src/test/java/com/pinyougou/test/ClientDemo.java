package com.pinyougou.test;

import com.pinyougou.account.dao.AccountDao;
import com.pinyougou.account.pojo.Account;
import com.pinyougou.account.service.AccountService;
import com.pinyougou.account.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.test.ClientDemo
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:48
 * @Version:1.0
 */
public class ClientDemo {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    AccountService accountService = ac.getBean(AccountService.class);
    @Before
    public void init(){

        AccountDao accountDao = ac.getBean(AccountDao.class);
        System.out.println(accountService);
        System.out.println(accountDao);
    }


    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("dami");
        account.setMoney(999f);
        accountService.saveAccount(account);
    }
}
