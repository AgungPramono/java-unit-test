package com.agung.belajar.unittest.mocking;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockExample {


    @Test
    void testMock(){
        //membuat Mock Object
        List<String> list = Mockito.mock(List.class);

        //tambah behaviour mock object
        Mockito.when(list.get(0)).thenReturn("Agung");
        Mockito.when(list.get(20)).thenReturn("Budi");

        System.out.println(list.get(0));
        System.out.println(list.get(0));

        //verfikasi berapa kali mock dipanggil
        Mockito.verify(list, Mockito.times(1)).get(0);//object hanya boleh dipanggil sekali

    }

}
