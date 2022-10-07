package com.gao.pkg;

import com.gao.modifier.A;

public class Test {
    public static void main(String[] args) {

        A a = new A();

        //在不同包下，可以访问public 修饰的属性或方法
        //但是不能访问 protected、默认、private修饰的属性或方法
        System.out.println(a.n1);
      /*  System.out.println(a.n2);
        'n2' has protected access in 'com.gao.modifier.A'
*/
        //直接访问属性只能访问到n1，但是可以访问公开方法m1(),输出n1-4
        // 不同包之间只能访问public
        a.m1();
        //a.m2(); 'm2()' has protected access in 'com.gao.modifier.A'
    }
}
