package com.facetofront.java;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {


        //1、takeWhile()的使用
        @Test
        public void test1(){
             List<Integer>  list = Arrays.asList(45,454,4456,454,51,778,4555);
             Stream<Integer>  stream = list.stream();//当取到不满足条件的就不再取，返回
             stream.takeWhile(x->x<70).forEach(System.out::println);
        }
        //2、dropWhile()的使用 ,与takeWhile（）刚好相反
        @Test
        public void test2(){
            List<Integer>  list = Arrays.asList(45,454,4456,454,51,778,4555);
            Stream<Integer>  stream = list.stream();//当取到不满足条件的就不再取，返回
            stream.dropWhile(x->x<70).forEach(System.out::println);
        }
        //ofNullable的使用    java8中stream不能完全为null，否则会报空指针异常，而java9中的ofNullable方法允许我们创建一个单元素stream
        //可以包含一个非空元素，也可以创建一个空stream。
        @Test
        public void test3(){
             Stream<Integer> stream1 = Stream.of(1,2,1,null);
             stream1.forEach(System.out::println);
             System.out.println("================================================");
             //如果只有单个元素，此元素不能为nuull，否则报nullPointerException
             //Stream<Object> objectStream = Stream.of(null);
            List<Integer> list = Arrays.asList(12312, 123, 123123, 1231, null);
            System.out.println(list.stream().count());

            //jdk9：新增ofnullable(T t);的方法
            Stream<java.lang.String> tom = Stream.ofNullable("Tom");
            System.out.println(tom.count());

            Stream<java.lang.String> tom1 = Stream.ofNullable(null);
            System.out.println(tom1.count());//0
        }
       //4 iterator()重载的方法
       @Test
       public void test4(){
              //stream 的实例化，①通过集合的stream(),②通过数组工具类，Arrays ③stream中的静态方法  of() ④iterator()/generate()
              Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println);
              System.out.println("====================================");
              Stream.iterate(0,x->x<10,x->x+1).forEach(System.out::println);
       }


}
