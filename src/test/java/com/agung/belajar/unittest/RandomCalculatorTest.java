package com.agung.belajar.unittest;

import com.agung.belajar.unittest.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testRandom(Random random){

        Integer a = random.nextInt();
        Integer b = random.nextInt();
        Integer result = calculator.add(a,b);

        Integer expected = a + b;

        Assertions.assertEquals(expected,result);

    }
}
