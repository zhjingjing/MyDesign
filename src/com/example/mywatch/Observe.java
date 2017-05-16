package com.example.mywatch;
/**
 * 观察者接口
 * */
public interface Observe<T> {
  void onUpdate(Observable<T> observable,T data);
}
