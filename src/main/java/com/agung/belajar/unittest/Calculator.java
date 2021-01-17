package com.agung.belajar.unittest;

public class Calculator {

    public Integer divide(Integer a, Integer b){
        if (b ==0 ){
            throw new ArithmeticException("terjadi pembagian dengan nol");
        }
        return a /b;
    }

    public Integer add(Integer a, Integer b){
        return a + b;
    }
}
