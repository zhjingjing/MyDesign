package com.example.mysingle;

/**
 * ����
 * ͬ�������,�����п�
 * */
public class MySingleton2 {
  private static MySingleton2 singleton2=null;
  private MySingleton2(){
    
  }
  public static MySingleton2 getInstance(){
    if (singleton2==null) {
      synchronized (MySingleton2.class) {
        //�����п�����Ϊ��һ���߳̽�������һ���̴߳��ڵȴ�״̬,
        //ǰһ��������ʵ���Ѿ����ڣ����ڶ�������ʱ�ж�
        if (singleton2==null) {
           singleton2=new MySingleton2();
        }
      }
    }
    return singleton2;
  }
}
