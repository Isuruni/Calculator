package com.kelaniya.uni.v5.repository;

public  class SqlNumberRepository implements NumberRepository {

    //If values are to be obtained from a database

    @Override
    public Double[] getNumbers(String path) throws NumberRepositoryException {
        return new Double[0];
    }
}
