package com.kx.learning.thread.demo01;

public class TestThread extends Thread {
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("I'm watching code~~~" + i);
        }
    }

    public static void main(String[] args) {
        // main thread

        // create a Thread object
        TestThread testThread01 = new TestThread();

        // call start method to start thread
        testThread01.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("I'm studying multi-thread~~~" + i);
        }
    }
}
