package com.facetofront.java;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {

          //Optional类中提供了转换为stream的方法
          @Test
          public void test(){
              List<Integer> list = Arrays.asList(234, 234234, 23, 42, 34, 23, 4, 23, 423423, 42);
              Optional<List<Integer>> list1 = Optional.ofNullable(list);
              Stream<List<Integer>> stream = list1.stream();
              System.out.println(stream.count());
              //stream.forEach(System.out::println);
              System.out.println("==================================================");
              List<Integer> asa = Arrays.asList(234, 234234, 23, 42, 34, 23, 4, 23, 423423, 42);
              Optional<List<Integer>> list2 = Optional.ofNullable(list);
              Stream<Integer> integerStream = list2.stream().flatMap(x -> x.stream());
              System.out.println(integerStream.count());
          }
}
