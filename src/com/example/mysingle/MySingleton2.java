package com.example.mysingle;

/**
 * 饿汉
 * 同步代码块,两次判空
 * */
public class MySingleton2 {
  private static MySingleton2 singleton2=null;
  private MySingleton2(){
    
  }
  public static MySingleton2 getInstance(){
    if (singleton2==null) {
      synchronized (MySingleton2.class) {
        //二次判空是因为当一个线程进来后，另一个线程处于等待状态,
        //前一个出来后，实例已经存在，当第二个进来时判断
        if (singleton2==null) {
           singleton2=new MySingleton2();
        }
      }
    }
    return singleton2;
  }
}
