package com.gupao.fanshe.demo1;

import sun.applet.Main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Dog.class;
        Dog o = (Dog)clazz.newInstance();
//        Field[] fields = clazz.getFields(); //获取勒种的所有的公有字段 包含继承关系的公有字段
//        Field[] declaredFields = clazz.getDeclaredFields(); //获取类中自定义的字段 内部
//        Field naneField = clazz.getField("id"); //获取指定名称的公有字段
        Field nameId = clazz.getDeclaredField("id"); //获取指定名称类中定义的字段 包涵私有
//        int modifiers = nameId.getModifiers(); //获取字段的修饰符
        nameId.setAccessible(true); //指定私有字段强制访问

        nameId.set(o, 2); //成员字段赋值(需指定对象)

        System.out.println(o.getId());

    }
}
