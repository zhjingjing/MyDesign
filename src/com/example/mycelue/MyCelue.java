package com.example.mycelue;
/**
 * ����ģʽ������ģʽ������һЩ�е��㷨������ÿһ���㷨��װ����������ʹ���ǻ������໥�滻
 * ����:�����㷨��ѡ��ʵ�֣�
 * 1:������Գ���ӿ�
 * 2:����ʵ����
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
