package com.facetofront.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryTest {

       @Test
       public void testTry(){
           //jdk8以前
           InputStreamReader reader = null;
           try {
               reader= new InputStreamReader(System.in);
               //读取数据的过程。
               reader.read();
           }catch (Exception e){
               e.printStackTrace();
           }finally {
               //资源的关闭
               if(reader!=null){
                   try {
                       reader.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           }
       }

    @Test
    public void testTry1(){
             //jdk8          要求资源对象的实例化，必须放在try的一对()内完成

            try (InputStreamReader reader = new InputStreamReader(System.in)){  //声明的资源会自动的关闭
                reader.read();
            }catch (Exception e){
                e.printStackTrace();
            }
    }

    //jdk9中，可以在try()中调用已经实例化的资源对象
    @Test
    public void testTry2(){
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader;writer){  //声明的资源会自动的关闭
            //此时的reader是final，不可再被赋值。
            reader.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //jdk8中，下划线的测试
    @Test
    public void testTry12(){
        /* String  _hello = "北京";*/
        /* System.out.println(_hello);*/
        /* String  _ = "北京";
         System.out.println(_);  jdk8以前是允许的，但是jdk9是不允许的*/
    }

}
