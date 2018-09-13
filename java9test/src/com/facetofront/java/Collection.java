package com.facetofront.java;

import org.junit.Test;

import java.util.*;

public class Collection {

        /**
         *
         *   只读、不可变的集合
         *
         *   创建一个只读特点的集合
         *
         */


        //jdk1.8及之前
        @Test
        public void test2(){
            List<java.lang.String> list = new ArrayList<>();
            list.add("111");
            list.add("Tom");
            list.add("Tom");
            //调用collection中的方法,将list变成只读的，
            List<java.lang.String> newList = Collections.unmodifiableList(list);
            //newList.add("jjjjj");不能执行，否则报异常。
            newList.forEach(System.out::println);
        }
    //jdk1.8及之前
    @Test
    public void test5(){
        //list
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6));//数组跟list有一一对应的关系并且有序
         // list.add(1);
        //Set
        Set<Integer> listInteger = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
       //listInteger.add(4);
        listInteger.forEach(System.out::println);

        //Map  数据是无序的
        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("tom", 78);
                put("2222", 78);
                put("99999", 78);
            }
        });
        map.forEach((k,v)->System.out.println(k+":"+v));

    }
    //jdk1.9
    @Test
    public void test05(){
        List<Integer> integers = List.of(1, 2, 3);//此时的list就是只读的。
       // integers.add(2);//bukeyi
        integers.forEach(System.out::println);
        Set<Integer> integers1 = Set.of(1, 1, 1, 1);
        Map<java.lang.String, Integer> stringIntegerMap = Map.of("22", 22);
        Map<java.lang.String, Integer> stringIntegerMap1 = Map.ofEntries(Map.entry("111", 222), Map.entry("111", 222));

    }
























}
