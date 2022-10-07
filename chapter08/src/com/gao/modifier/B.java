package com.gao.modifier;



public class B {


    public void say(){
        //A和B是在同一个包下，可以直接引用
        A a = new A();

        //在同一个包下，可以访问public , protected 和默认，不能访问private
        int b = a.n1;
        int c = a.n2;
        int d = a.n3;
        System.out.println("n1 = "+a.n1 + "n2= "+a.n2+"n3= "+a.n3);

        /*'n4' has private access in 'com.gao.modifier.A'
        private只能访问本类的
        int e = a.n4;*/

        //在同一个包下，可以访问public , protected 和默认，不能访问private
        a.m1();
        a.m2();
        a.m3();
        //a.m4();'m4()' has private access in 'com.gao.modifier.A'

    }
}
