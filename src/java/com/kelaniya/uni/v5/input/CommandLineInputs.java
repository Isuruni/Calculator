package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private String[] args;

    public CommandLineInputs(String[] argument){
        this.args=argument;
    }

    public String getOperator() throws InvalidInputException {
        //Make sure to validate arguments before using

        //Make sure an argument is provided
        if (args.length == 0) {
            throw new InvalidInputException("Please provide an argument before hand");
        }


        String operator = args[0];

        //Make sure the argument provided is add|sub|mul|div
        if (!((operator.equals("add")) || (operator.equals("sub")) || (operator.equals("mul")) || (operator.equals("div")))) {
            throw new InvalidInputException("Please provide a valid argument add,sub,mul or div");
        }
        return operator;
    }


}
