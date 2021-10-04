package com.kelaniya.uni.v5.operation;

public class SubOperation implements Operation {

    //Subtract two numbers from the file
    public Double execute (Double[] numbers){
        return numbers[0] - numbers[1]  ;
    }
}
