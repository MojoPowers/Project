package com.step.tourist_agency.service;

import java.util.List;

public interface CrudOperationService<T> {

    List<T> all();

    T findById(String id);

    void add(T t);

    void delete(String id);
}