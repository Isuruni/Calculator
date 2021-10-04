package com.kelaniya.uni.v5.input;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandLineInputsTest {

    @Test
    public void argument_array_length_should_not_be_zero() {
        CommandLineInputs commandLineInputs = new CommandLineInputs(new String[]{});
        assertThrows(InvalidInputException.class,() ->{commandLineInputs.getOperator();});
    }

    @Test
    public void argument_should_be_add_sub_mul_or_div() {
        CommandLineInputs commandLineInputs = new CommandLineInputs(new String[]{"hi"});
        assertThrows(InvalidInputException.class,() ->{commandLineInputs.getOperator();});
    }

}