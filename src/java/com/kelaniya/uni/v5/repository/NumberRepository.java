package com.kelaniya.uni.v5.repository;

public interface NumberRepository {

    Double[] getNumbers(String path) throws NumberRepositoryException;
}
