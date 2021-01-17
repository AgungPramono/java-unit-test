package com.agung.belajar.unittest;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
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

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,100,400,324})
    void restWithParameter(int value){
        int expected = value + value;
        int result = calculator.add(value,value);

        Assertions.assertEquals(expected,result);
    }

    public static List<Integer> parameterSource(){
        return Arrays.asList(1,2,3,4,5,6,7,8,9,100,400,500);
    }

    @DisplayName("Test Calculator dengan parameter method")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource(value = {"parameterSource"})
    void restWithMethodSourcer(int value){
        int expected = value + value;
        int result = calculator.add(value,value);

        Assertions.assertEquals(expected,result);
    }
}
