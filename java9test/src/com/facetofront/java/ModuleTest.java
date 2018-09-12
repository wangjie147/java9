package com.facetofront.java;


import com.facetofront.bean.Person;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 *  测试java9的模块化特性
 *
 */
public class ModuleTest {

        private static final Logger LOGGER = Logger.getLogger("facetofront");

        public static void main(String[] args) {
            Person person = new Person("tom",12);
            System.out.println(person.getAge());
            //User user = new User();没有暴露不能引用
            LOGGER.info("执行结束程序");
        }

        @Test
        public void test(){
            try {
                URL url= new URL("http://atguigu.com");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
}
