package dxg.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther 丁溪贵
 * @date 2020/4/25
 */
public class Test1 {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }
}
