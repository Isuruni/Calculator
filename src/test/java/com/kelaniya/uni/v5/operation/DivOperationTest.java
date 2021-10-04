package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidCalOperationException {
        DivOperation divOperation= new DivOperation();

        Double result = divOperation.execute(new Double[]{6.0,3.0});

        assertThat(result, is(2.0));
    }

    @Test
    public void should_not_divide_by_zero(){
        DivOperation divOperation= new DivOperation();

        assertThrows(InvalidCalOperationException.class,() ->{divOperation.execute(new Double[] {6.0,0.0});});
    }

    @Test
    public void should_divide_negative_values() throws InvalidCalOperationException {
        DivOperation divOperation= new DivOperation();

        Double result = divOperation.execute(new Double[]{-6.0,-3.0});

        assertThat(result, is(2.0));
    }

    @Test
    public void should_divide_negative_and_positive_values() throws InvalidCalOperationException {
        DivOperation divOperation= new DivOperation();

        Double result = divOperation.execute(new Double[]{-6.0,3.0});

        assertThat(result, is(-2.0));
    }

}