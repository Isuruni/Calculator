package com.kelaniya.uni.v5.repository;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class FileNumberRepositoryTest {

    @Test
    public void if_cannot_read_from_a_file_throws_an_exception()  {

        FileNumberRepository fileNumberRepositoryTest = new FileNumberRepository();
        assertThrows(NumberRepositoryException.class,() ->{fileNumberRepositoryTest.getNumbers("D:\\1");});

    }

    @Test
    public void should_return_a_Double_array() throws NumberRepositoryException {

        FileNumberRepository fileNumberRepository = new FileNumberRepository();
        Double[] outputNumbers= fileNumberRepository.getNumbers("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff");
        Double[] numbers= {12.0,3.0};
        assertTrue(Arrays.equals(numbers, outputNumbers));

    }

}