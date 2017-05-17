package com.example.mywatch;

import java.util.ArrayList;
import java.util.List;


/**
 * ���۲���
 * �۲���ģʽ��ע�ᣬ��ע�ᣬ�����¼���֪ͨ����
 * */
public class Observable<T> {
  List<Observe<T>> list=new ArrayList<>();
  
  public void onregister(Observe<T> observe){
    if (observe == null) {
      throw new NullPointerException("�۲���observe == null");
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
