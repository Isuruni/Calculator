package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private String[] args;

    public CommandLineInputs(String[] argument){
        this.args=argument;
    }

    public String getOperator() throws InvalidInputException {
        //Make sure to validate arguments before using
        if (args.length == 0) {
            throw new InvalidInputException("Please provide an argument before hand");
        }

        //Second validation
        String operator = args[0];


        if (!((operator.equals("add")) || (operator.equals("sub")) || (operator.equals("mul")) || (operator.equals("div")))) {
            throw new InvalidInputException("Please provide an argument before hand");
        }
        return operator;
    }


}
