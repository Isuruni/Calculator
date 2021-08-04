package com.kelaniya.uni;

import java.io.FileNotFoundException;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        Calculator cal= new Calculator();//Creating an object from Calculator class
        cal.user_input();
        cal.calculating();
    }
}

