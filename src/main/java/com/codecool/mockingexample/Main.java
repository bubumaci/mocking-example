package com.codecool.mockingexample;

public class Main {
    public static void main(String[] args) {
        runPangramChecker();
    }

    public static void runPangramChecker() {
        System.out.println("-----------run Pangram Checker-----------");
        Database database = new Database();
        PangramChecker pangramChecker = new PangramChecker(database);
        boolean isPangram = pangramChecker.check("the quick brown fox jumps over a lazy dog");
        System.out.println(isPangram);
    }
}
