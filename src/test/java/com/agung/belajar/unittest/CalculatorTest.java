package com.agung.belajar.unittest;

import com.agung.belajar.unittest.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
@Tag("integration-test")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("run before all test");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("run after all test");
    }

    @BeforeEach
    public void setupTest(){
        System.out.println("run before test method");
    }

    @AfterEach
    public void tearDownAfterTest(){
        System.out.println("run after test method");
    }

    @Test
    public void testAddSucces(){
        Integer result =  calculator.add(10,10);
        assertEquals(20,result);
    }

    @Test
    public void testAddFail(){
        assertNotEquals(20, calculator.add(10,5));
    }

    @Test
    public void divideSucces(){
        Integer result = calculator.divide(100,10);
        assertEquals(10, result);
    }

    @Test
//    @DisplayName("Skenario test gagal menghasilkan exception ArithmeticException divide(100/0)")
    public void divideFailed(){
       assertThrows(ArithmeticException.class,() -> {
          calculator.divide(100,0);
       });
    }

    @Test
    @Disabled //nonaktifkan test
    public void testCommingSoon(){

    }

    @Test
    public void testAborted(){
        String profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            //membatalkan unit test karena kondisi tertentu
            throw new TestAbortedException("membatalkan test karena bukan profile dev");
        }
    }

    @Test
    public void testAsumption(){
        //tidak perlu manual throw TestAbortedException secara manual
        //sudah diganti Assumtion
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }



}
