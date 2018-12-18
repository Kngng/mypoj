package com.pinyougou.staticdata;

/**
 * @BelongsProject: ssm-view
 * @BelongsPackage: com.pinyougou.staticdata
 * @Author: mlxgdxh
 * @CreateTime: 2018-12-13 22:13
 * @Version:1.0
 */
public class StaticDemo {
    static int i=1;
    String name = "lisi";
    public static void sayHello(){
        System.out.println("hello");
        System.out.println("I"+i);
        //System.out.println("name"+name);
    }
    static {
        System.out.println("SSSSSSSS");
    }
}
