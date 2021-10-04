package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubOperationTest {

    @Test
    public void should_subtract_positive_values(){
        SubOperation subOperation= new SubOperation();

        Double result = subOperation.execute(new Double[]{5.0,6.0});

        assertThat(result, is(-1.0));
    }

    @Test
    public void should_subtract_zeroes(){
        SubOperation subOperation =  new SubOperation();

        Double result = subOperation.execute(new Double[]{0.0,0.0});

        assertThat(result, is(0.0));
    }

    @Test
    public void should_subtract_negative_values(){
        SubOperation subOperation= new SubOperation();

        Double result = subOperation.execute(new Double[]{-10.0,-2.0});

        assertThat(result, is(-8.0));
    }

    @Test
    public void should_subtract_negative_and_positive_values_when_largest_is_negative(){
        SubOperation subOperation= new SubOperation();

        Double result = subOperation.execute(new Double[]{-10.0,2.0});

        assertThat(result, is(-12.0));
    }

    @Test
    public void should_subtract_negative_and_positive_values_when_largest_is_positive(){
        SubOperation subOperation= new SubOperation();

        Double result = subOperation.execute(new Double[]{10.0,-2.0});

        assertThat(result, is(12.0));
    }
}