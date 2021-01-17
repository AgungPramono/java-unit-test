package com.agung.belajar.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)//jika berjalan lebih dari 5 detik maka akan dianggap gagal
    void testSlow() throws InterruptedException {
        Thread.sleep(10_000);//berjalan selama 10 detik
    }
}
