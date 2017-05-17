package com.example.myshipei;

public class Huawei extends Phone implements Usb{

  @Override
  public void store() {
    // TODO Auto-generated method stub
    System.out.println("huawei implements store");
  }
  
  public static void main(String[] arg0){
    Huawei huawei=new Huawei();
    huawei.call();
    huawei.sms();
    huawei.takelong();
    huawei.store();
  }
}
