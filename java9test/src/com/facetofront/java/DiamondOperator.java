package com.facetofront.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DiamondOperator {

       @Test
       public void testdiamondOperator(){
           diamondOperator();
       }

       public void diamondOperator(){
           Set<String> set = new HashSet<>(){
                 //钻石操作符
           };//类型推断   创建一个继承于hashSet的匿名子类的对象
           set.add("MM");
           set.add("JJ");
           set.add("GG");
           set.add("DD");
           for(String s:set){
               System.out.println(s);
           }
       }
}
