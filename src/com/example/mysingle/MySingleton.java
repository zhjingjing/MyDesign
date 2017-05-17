package com.example.mysingle;


/**
 * 懒汉式
 * 单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * 1：确保私有化的构造函数
 * 2：必须定义一个静态的方法获取该单例
 * */
public class MySingleton {
    private static MySingleton mySingleton=new MySingleton();
    private MySingleton(){
    }
    public static MySingleton getInstance(){
      return mySingleton;
    }
}
