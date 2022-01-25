package com.codecool.mockingexample.businesslogic;

import java.util.Comparator;
import java.util.Optional;

public class BusinessLogic {

    DataSourceInterface dataSource;

    public BusinessLogic(DataSourceInterface dataSource) {
        this.dataSource = dataSource;
    }

    public void run() {
        for (Integer integer : dataSource.getAll()) {
            System.out.println(integer);
        }
    }

    public Integer getMax() {
        Optional<Integer> max = dataSource.getAll().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;
                if (o1.equals(o2)) return 0;
                return 1;
            }
        });

        return max.orElse(0);
    }
}
