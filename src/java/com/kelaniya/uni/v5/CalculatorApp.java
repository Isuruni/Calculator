package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.InvalidCalOperationException;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepositoryException;
import com.kelaniya.uni.v5.ui.UI;

import java.io.IOException;

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
            Double[] numbers= numberRepository.getNumbers();
            Operation operation = operation_factory.getInstance(operator);
            Double result = operation.execute(numbers);
            ui.showMessage("The result: "+ result);

        } catch (InvalidCalOperationException | InvalidInputException |NumberRepositoryException e ) {
            ui.showMessage("Error Occurred!" + e.getMessage());
        }


    }
}
