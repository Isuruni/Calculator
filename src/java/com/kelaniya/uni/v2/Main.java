package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //Make sure to validate arguments before using
        if (args.length==0){
            System.out.println("Please provide an argument before hand");
            return;
        }

        //Second validation
        String operator= args[0];

        if(!(operator.equals("add"))||(operator.equals("sub"))||(operator.equals("mul"))||(operator.equals("div"))){
            System.out.println("Please enter add/su/mul/div");
            return;
        }

        //read from numbers.txt file
        List<String> numberString=Files.readAllLines(
                Paths.get("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff")
        );

        double num1= Double.parseDouble(numberString.get(0));
        double num2= Double.parseDouble(numberString.get(1));
        System.out.println(num1);
        System.out.println(num2);

        double result= 0;

        switch(operator){
            case "add":
                result=num1+num2;
                break;
            case "sub":
                result=num1-num2;
                break;
            case "mul":
                result=num1*num2;
                break;
            case "div":
                result=num1/num2;
                break;
        }
        System.out.println(result);
    }
}
