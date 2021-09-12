package com.kelaniya.uni.v5.operation;

public class OperationFactory {
    public Operation getInstance(String operator){

        Operation operation=null;

        switch(operator){
            case "add":
                operation= new AddOperation();
                break;
            case "sub":
                operation=new SubOperation();
                break;
            case "mul":
                operation=new MulOperation();
                break;
            case "div":
                operation=new DivOperation();
                break;
        }
        return operation;
    }
}
