package com.itheima;

import com.itheima.Dao.AccountDao;
import com.itheima.Service.AccountService;
import com.itheima.Service.Impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
   // private AccountService accountService= new AccountServiceImpl();
    @Test
    public void saveUser(){
        //accountService.saveAccount();
        //获取容器
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("bean.xml");
        //根据bean的id取出对象
        AccountService accountService = (AccountService) ac1.getBean("accountService");
        //System.out.println(accountService);
        accountService.saveAccount();


    }
}
