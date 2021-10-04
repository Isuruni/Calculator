package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.InvalidCalOperationException;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepositoryException;
import com.kelaniya.uni.v5.ui.UI;

//Coordinator class

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operation_factory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operation_factory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operation_factory = operation_factory;
        this.ui = ui;
    }

    public void execute() {

        String operator= null;
        try {
            operator = inputs.getOperator();
            Double[] numbers= numberRepository.getNumbers("D:\\Dinu\\LEVEL 2\\SEM 1\\SENG 21222 - Software Construction\\Calculator\\numbers.txt~e0b470947ae7844d253813755abcff04449578ff");
            Operation operation = operation_factory.getInstance(operator);
            Double result = operation.execute(numbers);
            ui.showMessage("The result: "+ result);

        } catch (InvalidCalOperationException | InvalidInputException |NumberRepositoryException e ) {
            ui.showMessage("Error Occurred!" + e.getMessage());
        }

    }
}
