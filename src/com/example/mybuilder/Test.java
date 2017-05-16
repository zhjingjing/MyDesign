package com.example.mybuilder;

public class Test {
  public static void main(String[] arg){
      MyBuilder.Builder builder=new MyBuilder.Builder();
      
      MyBuilder myBuilder=builder.age(10).name("xxxxx").build();
      System.out.println(myBuilder.getName()+"---"+myBuilder.getAge());
  }
}
