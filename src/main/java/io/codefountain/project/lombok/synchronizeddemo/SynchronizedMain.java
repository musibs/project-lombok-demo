package io.codefountain.project.lombok.synchronizeddemo;


public class SynchronizedMain {
    public static void main(String[] args) {

        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        SynchronizedDemo.staticMethod();
        synchronizedDemo.instanceMethod();
        synchronizedDemo.methodLockedWithCustomLock();
    }
}
