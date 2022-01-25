package com.codecool.mockingexample;

import com.codecool.mockingexample.businesslogic.BusinessLogic;
import com.codecool.mockingexample.businesslogic.DataSourceInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessLogicPrintTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    DataSourceInterface dataSource = mock(DataSourceInterface.class);
    BusinessLogic businessLogic;

    @BeforeEach
    public void setUp() {
        businessLogic = new BusinessLogic(dataSource);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void runTest() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        when(dataSource.getAll()).thenReturn(expected);

//        then - call the function we want to test
        businessLogic.run();

//        assert - check if the result is the expected
        assertEquals("1\n" +
                "2\n" +
                "3", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
