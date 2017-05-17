package com.example.mybuilder;

/**
 * builderģʽ:��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
 * 1������һ����̬builder�࣬�ڲ����Ը��ⲿ��һ��
 * 2��builder��һϵ�з������ڸ�ֵ��������this
 * 3������build�����������ⲿ�ࣨ�ⲿ����Ҫһ��˽�й��죬����Ϊ�ڲ���builder����ʼ��ȡbuilder�ж����ֵ��
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
