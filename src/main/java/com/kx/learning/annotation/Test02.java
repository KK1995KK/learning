package com.kx.learning.annotation;

import java.lang.annotation.*;

@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test() {
    }
}

// 定义一个注解
// Target 表示我们地注解可以用在哪些地方。
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// Retention 表示我们地注解在什么地方有效
// runtime > class > source
@Retention(value = RetentionPolicy.RUNTIME)
// Documented 表示是否将我们地注解生成在JAVAdoc中
@Documented
// Inherited 子类可以继承父类地注解
@Inherited
@interface MyAnnotation {

}
