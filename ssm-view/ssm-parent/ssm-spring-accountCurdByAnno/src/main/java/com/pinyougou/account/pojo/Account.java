package com.pinyougou.account.pojo;

import java.io.Serializable;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.account.pojo
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-09 20:06
 * @Version:1.0
 */
public class Account implements Serializable{
    private Integer id;
    private String name;
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

}
