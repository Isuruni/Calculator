package com.kelaniya.uni.v5.operation;

public class MulOperation implements Operation {

    //Multiply two numbers obtained from the file
    public Double execute (Double[] numbers){
        return numbers[0] * numbers[1]  ;
    }
}

