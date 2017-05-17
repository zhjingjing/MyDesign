package com.example.mywatch;

public class Test {
  public static void main(String[] arg0){
      
     Observable<Weather> observable=new Observable<>();
     
     Observe<Weather> observe1=new Observe<Weather>() {
      
      @Override
      public void onUpdate(Observable<Weather> observable, Weather data) {
        // TODO Auto-generated method stub
        System.out.println("�۲���1��"+data.getMyprint());
      }
    };
    
    Observe<Weather> observe2=new Observe<Weather>() {
      
      @Override
      public void onUpdate(Observable<Weather> observable, Weather data) {
        // TODO Auto-generated method stub
        System.out.println("�۲���2��"+data.getMyprint());
      }
    };
     
    observable.onregister(observe1);
    observable.onregister(observe2);
    
    Weather weather=new Weather("��������");
    observable.notifyall(weather);
    
    observable.unregister(observe2);
    Weather weather2=new Weather("---��������");
    observable.notifyall(weather2);
    
  }
}
