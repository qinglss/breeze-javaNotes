package com.gupao.fanshe.demo1;

import sun.applet.Main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        Class clazz = Dog.class;
        Dog dog = (Dog)clazz.newInstance();
        Method[] methods = clazz.getMethods();//获取类中所有的公有方法 包涵继承
        Method[] declaredMethods = clazz.getDeclaredMethods(); //获取类中定义的方法
        Method method = clazz.getMethod("", String.class);//获取类中指定名称和参数的公有方法
//        Method declaredMethod = clazz.getDeclaredMethod(, );//获取类中定义指定名称和参数的方法
        int modifiers = method.getModifiers(); //获取方法的修饰符
        method.invoke(dog, ""); //指定对象进行成员方法的调用
        declaredMethod.setAccessible(true);

    }
}
