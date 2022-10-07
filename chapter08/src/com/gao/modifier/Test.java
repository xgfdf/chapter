package com.gao.modifier;

public class Test {

    public static void main(String[] args) {

        //这里Test类是通过访问A类的public方法来实现本类访问四种属性
        //Test类直接访问A类属性，private修饰的属性访问不了
        //m1是public  所以都能访问
        A a =new  A();
        a.m1();

/*
*   （1）public：可以被所有其他类所访问。
    （2）private：只能被自己访问和修改。
    （3）protected：自身，子类及同一个包中类可以访问。
    （4）default（默认）：同一包中的类可以访问，声明时没有加修饰符，
* */    B b = new B();;
        b.say();


    }


}
