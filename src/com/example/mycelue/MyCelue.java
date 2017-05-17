package com.example.mycelue;
/**
 * 策略模式：策略模式定义了一些列的算法，并将每一个算法封装起来，而且使它们还可以相互替换
 * 本质:分离算法，选择实现；
 * 1:定义策略抽象接口
 * 2:具体实现类
 * 3:
 * */
public class MyCelue {
    private DaZhe daZhe;
    
    public void setmode(DaZhe daZhe2){
      daZhe=daZhe2;
    }
    
    public int execalPrice(int price){
      return daZhe.setPrice(price);
    }
}
