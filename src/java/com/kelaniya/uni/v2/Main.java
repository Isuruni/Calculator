package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {

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
        System.out.println(args[0]);

        try {
            Files.readAllLines(Paths.get("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
