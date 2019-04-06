package top.daoyang.aqs;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AQSTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);

        lock.lock();

        lock.unlock();
    }
}
