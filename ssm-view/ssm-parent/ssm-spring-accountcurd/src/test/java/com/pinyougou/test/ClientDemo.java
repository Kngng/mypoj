package com.pinyougou.test;

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
    private AccountService accountService;
    @Before
    public void init(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        accountService = ac.getBean(AccountService.class);
        System.out.println(accountService);
    }


    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("Xiaomi");
        account.setMoney(998f);
        accountService.saveAccount(account);
    }
}
