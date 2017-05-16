package com.example.mywatch;
/**
 * 观察者模式：定义一个一对多的关系；当一个对象发生改变，依赖他的多个对象都能得到通知；
 * 重要组成：观察者与被观察者
 * 
 * */
//比如你天气预报服务，一旦你订阅该服务，你只需按月付费，付完费后，每天一旦有天气信息更新，它就会及时向你发送最新的天气信息


public class Weather {
    private String myprint;
    
    public Weather(String myprint){
      this.myprint=myprint;
    }

    public String getMyprint() {
      return myprint;
    }

    public void setMyprint(String myprint) {
      this.myprint = myprint;
    }
    
    @Override
    public String toString() {
    // TODO Auto-generated method stub
        return "Weather{myprint="+myprint+"}";
    }
}
