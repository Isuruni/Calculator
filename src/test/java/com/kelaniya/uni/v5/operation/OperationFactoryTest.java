package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class OperationFactoryTest {

    @Test
    public void should_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory= new OperationFactory();
        Operation operation= operationFactory.getInstance("add");
        //verify that operation is an object of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));

    }
    @Test
    public void should_return_SubOperation_object_when_operator_is_sub(){
        OperationFactory operationFactory= new OperationFactory();
        Operation operation= operationFactory.getInstance("sub");

        assertThat(operation, instanceOf(SubOperation.class));

    }
    @Test
    public void should_return_MulOperation_object_when_operator_is_mul(){
        OperationFactory operationFactory= new OperationFactory();
        Operation operation= operationFactory.getInstance("mul");

        assertThat(operation, instanceOf(MulOperation.class));

    }
    @Test
    public void should_return_DivOperation_object_when_operator_is_div(){
        OperationFactory operationFactory= new OperationFactory();
        Operation operation= operationFactory.getInstance("div");

        assertThat(operation, instanceOf(DivOperation.class));

    }

}