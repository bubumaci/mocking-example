package com.codecool.mockingexample.businesslogic;

import java.util.ArrayList;
import java.util.List;

public class TestDatasource implements DataSourceInterface {

    List<Integer> list;

    public TestDatasource() {
        this.list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
    }

    @Override
    public List<Integer> getAll() {
        return list;
    }

    @Override
    public void addElement(Integer element) {
        list.add(element);
    }
}
