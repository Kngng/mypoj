package com.pinyougou.account.service.impl;

import com.pinyougou.account.dao.AccountDao;
import com.pinyougou.account.dao.impl.AccountDaoImpl;
import com.pinyougou.account.service.AccountService;

import java.util.Date;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.service.impl
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:40
 * @Version:1.0
 */
public class AccountServiceImpl implements AccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println(name+","+age+","+birthday);
    }
}
