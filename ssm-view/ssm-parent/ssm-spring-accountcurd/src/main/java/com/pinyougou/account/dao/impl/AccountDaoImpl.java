package com.pinyougou.account.dao.impl;

import com.pinyougou.account.dao.AccountDao;
import com.pinyougou.account.pojo.Account;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.dao.impl
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-01 12:43
 * @Version:1.0
 */
public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;
    @Override
    public void save(Account account) {
        try {
            runner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }
}
