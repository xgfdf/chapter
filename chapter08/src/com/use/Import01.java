
//package的作用是声明当前类所在的包，需要放在类的最上面，
// 一个类中最多只有一句package
package com.use;

//最好是需要哪个类就导入哪个类
/*
import指令位置放在package的下面
在类定义前面，可以有多句且没有顺序要求。

import 包 引用包的目的就是使用包里面的类
import java.util.Scanner;//表示只引入 java.util 包下的Scanner;
import java.util.*;// 表示将 java.util 下的所有类都引入
*/

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供Arrays 完成数组排序
        int[] arr = {-1,4,745,3,63,23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
