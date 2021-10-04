package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.*;
import com.kelaniya.uni.v5.repository.FileNumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepositoryException;
import com.kelaniya.uni.v5.ui.CmdLineUI;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertThrows;


public class CalculatorAppTest {

    CommandLineInputs inputs = new CommandLineInputs(new String[]{"add"});
    FileNumberRepository numberRepository = new FileNumberRepository() ;
    OperationFactory operation_factory = new OperationFactory();
    CmdLineUI ui = new CmdLineUI();
    InvalidInputException e;

    @Test
    public void should_print_the_message_if_argument_array_is_empty() throws Exception {

        CommandLineInputs commandLineInputs = new CommandLineInputs(new String[]{});
        CalculatorApp calculatorApp = new CalculatorApp(commandLineInputs,numberRepository,operation_factory,ui);

        String text = tapSystemOut(() -> {
            calculatorApp.execute();
        });

        Assert.assertEquals("Error Occurred!Please provide an argument before hand", text.trim());
    }

    @Test
    public void should_print_the_message_if_argument_is_not_add_sub_mul_or_div() throws Exception {

        CommandLineInputs commandLineInputs = new CommandLineInputs(new String[]{"hi"});
        CalculatorApp calculatorApp = new CalculatorApp(commandLineInputs,numberRepository,operation_factory,ui);

        String text = tapSystemOut(() -> {
            calculatorApp.execute();
        });

        Assert.assertEquals("Error Occurred!Please provide a valid argument add,sub,mul or div", text.trim());
    }


    @Test
    public void should_show_the_message_if_all_functionalities_are_correct() throws Exception {

        CalculatorApp calculatorApp = new CalculatorApp(inputs,numberRepository,operation_factory,ui);

        String text = tapSystemOut(() -> {
            calculatorApp.execute();
        });

        Assert.assertEquals("The result: 15.0", text.trim());

    }

}