package com.kx.learning.annotation;

import java.util.ArrayList;
import java.util.List;

// What is annotation

//@SuppressWarnings("all")
public class Test01 {
    @Override
    public String toString() {
        return super.toString();
    }

    // It is not recommended, but can be used.
    @Deprecated
    public void test01() {
        System.out.println("com.kx.learning.annotation.Test01.test01");
    }

    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList();
    }

    public void test03() {
        System.out.println("com.kx.learning.annotation.Test01.test03");
    }
}
