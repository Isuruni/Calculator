package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private String[] args;

    public CommandLineInputs(String[] argument){
        this.args=argument;
    }

    public String getOperator(){
        //Make sure to validate arguments before using
        if (args.length == 0) {
            System.out.println("Please provide an argument before hand");
            return " ";
        }

        //Second validation
        String operator = args[0];


        if (!((operator.equals("add")) || (operator.equals("sub")) || (operator.equals("mul")) || (operator.equals("div")))) {
            System.out.println("Please enter add/sub/mul/div");
            return " ";
        }
        return operator;
    }
}
