package com.example.mysingle;


/**
 * ����ʽ
 * ����ģʽ��ȷ��ĳһ����ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ����
 * 1��ȷ��˽�л��Ĺ��캯��
 * 2�����붨��һ����̬�ķ�����ȡ�õ���
 * */
public class MySingleton {
    private static MySingleton mySingleton=new MySingleton();
    private MySingleton(){
    }
    public static MySingleton getInstance(){
      return mySingleton;
    }
}
