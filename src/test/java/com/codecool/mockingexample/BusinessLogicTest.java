package com.codecool.mockingexample;

import com.codecool.mockingexample.businesslogic.BusinessLogic;
import com.codecool.mockingexample.businesslogic.DataSourceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BusinessLogicTest {

    DataSourceInterface dataSource = mock(DataSourceInterface.class);
    BusinessLogic businessLogic;

    @BeforeEach
    void init() {
        businessLogic = new BusinessLogic(dataSource);
    }

    @Test
    void getMaxTestForPositives() {
//        when - mocking the necessary methods
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(2);
        when(dataSource.getAll()).thenReturn(expected);

//        then - call the function we want to test
        Integer result = businessLogic.getMax();

//        assert - check if the result is the expected
        assertEquals(3, result);
    }

    @Test
    void getMaxTestForEmptyList() {
//        when - mocking the necessary methods
        List<Integer> expected = new ArrayList<>();
        when(dataSource.getAll()).thenReturn(expected);

//        then - call the function we want to test
        Integer result = businessLogic.getMax();

//        assert - check if the result is the expected
        assertEquals(0, result);
    }

    @Test
    void getMaxTestForEquals() {
//        when - mocking the necessary methods
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        when(dataSource.getAll()).thenReturn(expected);

//        then - call the function we want to test
        Integer result = businessLogic.getMax();

//        assert - check if the result is the expected
        assertEquals(3, result);
    }
}