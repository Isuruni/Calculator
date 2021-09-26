package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{


    public Double[] getNumbers() throws NumberRepositoryException {
//read from numbers.txt file
        List<String> numberString= null;
        try {
            numberString = Files.readAllLines(
                    Paths.get("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff")
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new NumberRepositoryException(e,"Couldn't read the text file");
        }

        double num1= Double.parseDouble(numberString.get(0));
        double num2= Double.parseDouble(numberString.get(1));

        return new Double[]{num1,num2};
    }
}
