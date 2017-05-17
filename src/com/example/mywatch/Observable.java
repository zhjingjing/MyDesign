package com.example.mywatch;

import java.util.ArrayList;
import java.util.List;


/**
 * 被观察者
 * 观察者模式：注册，反注册，发送事件（通知）；
 * */
public class Observable<T> {
  List<Observe<T>> list=new ArrayList<>();
  
  public void onregister(Observe<T> observe){
    if (observe == null) {
      throw new NullPointerException("观察者observe == null");
      }
        synchronized (this) {
          if (!list.contains(observe)) {
            list.add(observe);
          }
        }
    }
    public synchronized void unregister(Observe<T> observe){
        list.remove(observe);
    }
  
    public void notifyall(T daT){
      for (Observe<T> observe : list) {
        observe.onUpdate(this, daT);
      }
    }
  
}
