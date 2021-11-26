package com.yeahbutstill.lombok;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CounterTest {

    private Counter counter = new Counter();

    @Test
    @SneakyThrows
    void testSynchronized() {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }
            }).start();
        }

        Thread.sleep(5_000L);
        log.info(counter.getCounter().toString());

    }
}
