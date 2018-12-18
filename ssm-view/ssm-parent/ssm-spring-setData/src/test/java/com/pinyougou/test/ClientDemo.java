package com.pinyougou.test;

import com.pinyougou.account.service.AccountService;
import com.pinyougou.account.service.impl.AccountServiceImpl;
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
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.saveAccount();
    }
}
