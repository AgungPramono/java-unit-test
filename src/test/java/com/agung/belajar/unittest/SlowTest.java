package com.agung.belajar.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)//jika berjalan lebih dari 5 detik maka akan dianggap gagal
    void testSlow1() throws InterruptedException {
        Thread.sleep(4_000);//berjalan selama 10 detik
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)//jika berjalan lebih dari 5 detik maka akan dianggap gagal
    void testSlow2() throws InterruptedException {
        Thread.sleep(4_000);//berjalan selama 10 detik
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)//jika berjalan lebih dari 5 detik maka akan dianggap gagal
    void testSlow3() throws InterruptedException {
        Thread.sleep(4_000);//berjalan selama 10 detik
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)//jika berjalan lebih dari 5 detik maka akan dianggap gagal
    void testSlow4() throws InterruptedException {
        Thread.sleep(4_000);//berjalan selama 10 detik
    }
}
