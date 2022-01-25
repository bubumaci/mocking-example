package com.codecool.mockingexample.businesslogic;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB implements DataSourceInterface {

    List<Integer> list;

    public InMemoryDB() {
        this.list = new ArrayList<>();
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
