package com.example.mybuilder;

/**
 * builder模式:将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 1：定义一个静态builder类，内部属性跟外部类一样
 * 2：builder的一系列方法用于赋值，并返回this
 * 3：定义build方法，返回外部类（外部类需要一个私有构造，参数为内部类builder，初始化取builder中对象的值）
 * */
public class MyBuilder {
     private String name;
     private int age;
     private MyBuilder(Builder builder) {
       this.name=builder.name;
       this.age=builder.age;
    }
     
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
    
    
    static class Builder{
      private String name;
      private int age;
      
      public Builder name(String name){
        this.name=name;
        return this;
      }
      
      public Builder age(int age){
        this.age=age;
        return this;
      }
      
      public MyBuilder build(){
        return new MyBuilder(this);
      }
      
    }
     
}
