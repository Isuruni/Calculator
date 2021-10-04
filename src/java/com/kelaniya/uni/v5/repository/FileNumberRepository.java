package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{


    public Double[] getNumbers(String path) throws NumberRepositoryException {


        //read from numbers.txt file and return them in a Double array

        List<String> numberString= null;
        try {
            numberString = Files.readAllLines(
                    Paths.get(path)
            );
        } catch (IOException e) {

            throw new NumberRepositoryException(e,"Couldn't read the text file");
        }

        double num1= Double.parseDouble(numberString.get(0));
        double num2= Double.parseDouble(numberString.get(1));

        return new Double[]{num1,num2};
    }
}
