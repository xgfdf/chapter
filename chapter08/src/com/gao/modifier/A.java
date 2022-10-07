package com.gao.modifier;

public class A {

    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public void m1(){
        System.out.println(n1+n2+n3+n4);
    }
    protected void m2(){ }
    void m3(){ }
    private  void m4(){ }

    public void hi(){
        //在同一类中，可以访问public protected 默认private 修饰属性和方法
        m1();
        m2();
        m3();
        m4();

    }



}
