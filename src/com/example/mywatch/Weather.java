package com.example.mywatch;
/**
 * �۲���ģʽ������һ��һ�Զ�Ĺ�ϵ����һ���������ı䣬�������Ķ�������ܵõ�֪ͨ��
 * ��Ҫ��ɣ��۲����뱻�۲���
 * 
 * */
//����������Ԥ������һ���㶩�ĸ÷�����ֻ�谴�¸��ѣ�����Ѻ�ÿ��һ����������Ϣ���£����ͻἰʱ���㷢�����µ�������Ϣ


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
