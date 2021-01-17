package com.agung.belajar.unittest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest {

    @Override
    @DisplayName("Test Random Kalkulator")
    @RepeatedTest(
            value = 10,
            name = "{display name} ke {currentRepetition} dari {totalRepetition}"
    )
    public void testRandom(Random random) {
        super.testRandom(random);
    }
}
