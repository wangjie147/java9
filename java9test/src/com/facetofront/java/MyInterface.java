package com.facetofront.java;

/**
 *  抽象类和接口的异同：面试题
 *
 *  二者定义：声明方式   内部结构（抽象类一致没有变化，接口：jdk7，jdk8，jdk9）
 *  共同点：不能实例化，以多态的方式使用
 *  不同点：单继承，多实现。
 *
 */

interface MyInterfaceTest{
          //jdk7 :只能声明全局常量（public static final）和抽象方法（public abstract）
         void method1();

         //jdk8:声明静态方法和默认方法
         public static void method2(){
             System.out.println("method2方法");
         }

         default void method3(){
             System.out.println("default methods方法");
             method4();
         }

         //jdk9:声明私有方法
         private void method4(){
             System.out.println("私有方法");
         }

}

class  MyInterfaceImpl implements MyInterfaceTest{

    @Override
    public void method1() {
        System.out.println("实现接口中的抽象方法method1（）");
    }
}

public class MyInterface {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method3();
    }

}


























