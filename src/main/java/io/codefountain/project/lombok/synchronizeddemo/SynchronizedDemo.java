package io.codefountain.project.lombok.synchronizeddemo;

import lombok.Synchronized;

public class SynchronizedDemo {

    private Object myOwnLock = new Object();

    @Synchronized
    public static void staticMethod(){
        System.out.println("This is a static method");
    }

    @Synchronized
    public void instanceMethod(){
        System.out.println("This is a instance method");
    }

    @Synchronized("myOwnLock")
    public void methodLockedWithCustomLock(){
        System.out.println("This method is locked with custom lock");
    }
}
