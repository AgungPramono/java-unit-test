package com.agung.belajar.unittest;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("Queue")
public class InnerUnitTest {

    private Queue<String>queue;

    @Nested
    @DisplayName("when new")
    public class WhenNew{

        @BeforeEach
        void setup(){
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer, size must be 1")
        void offerNewData(){
            queue.offer("Agung");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("when more offer data")
        void offerMoreData(){
            queue.offer("Agung");
            queue.offer("Dani");
            Assertions.assertEquals(2, queue.size());

        }
    }
}
