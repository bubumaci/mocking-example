package com.codecool.mockingexample.businesslogic;

import java.util.List;

public interface DataSourceInterface {

    List<Integer> getAll();

    void addElement(Integer element);
}
