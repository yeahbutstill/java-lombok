package com.yeahbutstill.lombok;

import lombok.Synchronized;

public class Counter {

    // lock
    private final Object counterLock = new Object();

    private Long counter = 0L;

    @Synchronized(value = "counterLock")
    public void increment() {
        counter = counter + 1;
    }

    @Synchronized(value = "counterLock")
    public Long getCounter() {
        return counter;
    }

}
