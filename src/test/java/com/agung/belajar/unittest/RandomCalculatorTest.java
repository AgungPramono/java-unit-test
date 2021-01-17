package com.agung.belajar.unittest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

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

    @DisplayName("Test Random Kalkulator dengan info")
    @RepeatedTest(
            value = 10,
            name = "{displayName}"
    )
    public void testRandomRepeatInfo(Random random, TestInfo info, RepetitionInfo repInfo) {
        System.out.println(info.getDisplayName()+" ke "+repInfo.getCurrentRepetition()+" dari "+repInfo.getTotalRepetitions());
        super.testRandom(random);
    }
}
