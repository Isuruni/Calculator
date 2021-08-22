package com.kelaniya.uni.v2;

public class Main {
    public static void main(String[] args) {

        //Make sure to validate arguments before using
        if (args.length==0){
            System.out.println("Please provide an argument before hand");
            return;
        }

        //Second validation
        String operator= args[0];

        if(!(operator.equals("add"))||(operator.equals("sub"))||(operator.equals("mul"))||(operator.equals("div"))){
            System.out.println("Please enter add/su/mul/div");
            return;
        }
        System.out.println(args[0]);
    }
}
