package com.facetofront.java;

public class String {

    /**
     *
     *   String 底层的变化   原来是char型数组，进行存储的。  jdk9中改成字节数组byte
     *   openjdk.java.net/jeps/254
     *
     *   jdk8及之前，String和Stringbuffer和Stringbuilders三者之间的异同。
     *
     *   string： jdk8及之前 底层使用char[]数组存储  jdk9中使用的 byte []+ encoding flag数组存储
     *  Stringbuffer  ：jdk8及之前 底层使用char[]数组存储  jdk9中使用的 byte []+ encoding flag数组存储
     *  Stringbuilder ：jdk8及之前 底层使用char[]数组存储  jdk9中使用的 byte []+ encoding flag数组存储
     *
     *   区别：string   不可变的字符序列
     *       Stringbuffer  ：可变的字符序列，线程安全的，效率低
     *       Stringbuilder  ：可变的字符序列，线程不安全的，效率高（jdk1.5中增加的）
     */



}
