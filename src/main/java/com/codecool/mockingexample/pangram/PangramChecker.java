package com.codecool.mockingexample.pangram;

public class PangramChecker {

    Database database;

    public PangramChecker(Database database) {
        this.database = database;
    }

    public boolean check(String sentence) {
        String[] letterArray = database.getRequiredLetters();
        for (String letter : letterArray) {
            if (!sentence.contains(letter)) {
                System.out.println("missing: " + letter);
                return false;
            }
        }
        return true;
    }
}
