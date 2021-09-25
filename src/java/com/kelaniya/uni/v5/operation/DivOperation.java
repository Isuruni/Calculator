package com.kelaniya.uni.v5.operation;

public class DivOperation implements Operation {
    public Double execute (Double[] numbers) throws InvalidCalOperationException {

        if(numbers[1]==0.0){
            throw new InvalidCalOperationException("Do not divide by zero");
        }

        return numbers[0] / numbers[1]  ;
    }
}
