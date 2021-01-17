package com.agung.belajar.unittest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

/**
 * jalankan di maven dengan command
 * mvn test -Dgroups= nama-tag
 */
@Tag("condition-os")
public class ConditionOS {

    /**
     * Unit test berdasarkan kondisi OS
     */
    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testRunOnlyOnWindows() {
        System.out.println("run only on windows");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void testDisableOnlyOnWindows() {
        System.out.println("only run on linux");
    }


    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testEnableJava8() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testDisableJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    public void testEnableJava8To15() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    public void testDisableJava8To15() {

    }


}
