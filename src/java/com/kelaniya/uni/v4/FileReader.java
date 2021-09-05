package com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {


    public Double[] getNumbers() throws IOException {
//read from numbers.txt file
        List<String> numberString= Files.readAllLines(
                Paths.get("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff")
        );

        double num1= Double.parseDouble(numberString.get(0));
        double num2= Double.parseDouble(numberString.get(1));

        return new Double[]{num1,num2};
    }
}
