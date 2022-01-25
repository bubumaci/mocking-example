package com.codecool.mockingexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PangramCheckerTest {

    PangramChecker pangramChecker;

    @Mock
    Database database;

    @BeforeEach
    void init() {
        pangramChecker = new PangramChecker(database);
    }

    @Test
    void checkSadCase() {
        when(database.getRequiredLetters()).thenReturn("abc".split(""));

        boolean result = pangramChecker.check("im batman");
        assertEquals(false, result);
    }

    @Test
    void checkHappyCase() {
        when(database.getRequiredLetters()).thenReturn("abc".split(""));

        boolean result = pangramChecker.check("all about the cats");
        assertTrue(result);
    }

    @Test
    void checkNullCase() {
        when(database.getRequiredLetters()).thenReturn(null);

        assertThrows(Exception.class, () -> {
            pangramChecker.check("im batman");
        });
    }
}