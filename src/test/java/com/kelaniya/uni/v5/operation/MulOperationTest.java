package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MulOperationTest {

    @Test
    public void should_multiply_positive_values(){
        MulOperation mulOperation= new MulOperation();

        Double result = mulOperation.execute(new Double[]{5.0,6.0});

        assertThat(result, is(30.0));
    }

    @Test
    public void should_multiply_negative_values(){
        MulOperation mulOperation= new MulOperation();

        Double result = mulOperation.execute(new Double[]{-5.0,-6.0});

        assertThat(result, is(30.0));
    }

    @Test
    public void should_multiply_negative_and_positive_values(){
        MulOperation mulOperation= new MulOperation();

        Double result = mulOperation.execute(new Double[]{-5.0,6.0});

        assertThat(result, is(-30.0));
    }

    @Test
    public void should_multiply_by_zero(){
        MulOperation mulOperation= new MulOperation();

        Double result = mulOperation.execute(new Double[]{5.0,0.0});

        assertThat(result, is(0.0));
    }

}