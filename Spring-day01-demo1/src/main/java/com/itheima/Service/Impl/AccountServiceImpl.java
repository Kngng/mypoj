package com.itheima.Service.Impl;

import com.itheima.Dao.AccountDao;
import com.itheima.Dao.Impl.AccountDaoImpl;
import com.itheima.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImpl implements AccountService {
    //private AccountDao accountDao ;


  //
 //
    //System.out.println(accountDao);




    public AccountServiceImpl() {
        System.out.println("创建AccountServiceImpl...");
    }

    public void saveAccount(){
        //根据bean的id取出对象
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao accountDao = (AccountDao) ac2.getBean("accountDao");
        System.out.println("xiaohei");
        accountDao.saveAccount();
    }

}
