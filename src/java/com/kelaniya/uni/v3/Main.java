package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operation.AddOperation;
import com.kelaniya.uni.v3.operation.DivOperation;
import com.kelaniya.uni.v3.operation.MulOperation;
import com.kelaniya.uni.v3.operation.SubOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs=new CommandLineInputs(args);
        String operator= inputs.getOperator();

        FileReader file= new FileReader();
        Double[] numbers= file.getNumbers();


        double result= 0;

        switch(operator){
            case "add":
                AddOperation add=new AddOperation();
                result=add.execute(numbers);
                break;
            case "sub":
                SubOperation sub=new SubOperation();
                result=sub.execute(numbers);
                break;
            case "mul":
                MulOperation mul=new MulOperation();
                result=mul.execute(numbers);
                break;
            case "div":
                DivOperation div=new DivOperation();
                result=div.execute(numbers);
                break;
        }
        System.out.println(result);
    }
}
