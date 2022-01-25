package com.codecool.mockingexample;

import com.codecool.mockingexample.businesslogic.BusinessLogic;
import com.codecool.mockingexample.businesslogic.DataSourceInterface;
import com.codecool.mockingexample.businesslogic.TestDatasource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessLogicTestWithoutMocking {
    DataSourceInterface dataSource;
    BusinessLogic businessLogic;

    @Test
    void getMaxTestForPositives() {
//        when - mocking the necessary methods
        dataSource = new TestDatasource();
        businessLogic = new BusinessLogic(dataSource);

//        then - call the function we want to test
        Integer result = businessLogic.getMax();

//        assert - check if the result is the expected
        assertEquals(3, result);
    }
}