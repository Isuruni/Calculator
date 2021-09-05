package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs=new CommandLineInputs(args);
        String operator= inputs.getOperator();

        FileReader file= new FileReader();
        Double[] numbers= file.getNumbers();


        OperationFactory operation_factory= new OperationFactory();
        Operation operation = operation_factory.getInstance(operator);
        Double result= operation.execute(numbers);
        UI ui =new UI();
        ui.showMessage("The result: "+ result);

    }
}
