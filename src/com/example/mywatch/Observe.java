package com.example.mywatch;
/**
 * �۲��߽ӿ�
 * */
public interface Observe<T> {
  void onUpdate(Observable<T> observable,T data);
}
