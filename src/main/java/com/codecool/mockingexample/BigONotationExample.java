package com.codecool.mockingexample;

import java.util.Arrays;

public class BigONotationExample {

    public static void runBigONotationExamples() {
        System.out.println("-----------run Big O Notation Examples-----------");
        String[] array = new String[]{"abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi"};
        System.out.println("-----find Constant-----");
        findConstant(array);
        System.out.println("-----find N-----");
        findN(array);
        System.out.println("-----find N2-----");
        findN2(array);
        System.out.println("-----find N Different Version-----");
        findNDifferentVersion(array);
    }


    private static void findConstant(String[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }

    private static void findN(String[] array) {
        System.out.println(System.nanoTime());
        for (String word : array) {
            System.out.print(word + ", ");
        }
        System.out.println(System.nanoTime());
    }

    private static void findN2(String[] array) {
        System.out.println(System.nanoTime());
        for (String word : array) {
            for (String anotherWord : array) {
                if (word.length() > 2) {
                    System.out.print(word + ", ");
                }
            }
        }
        System.out.println(System.nanoTime());
    }

    private static void findNDifferentVersion(String[] array) {
        System.out.println(System.nanoTime());
        for (String word : array) {
            for (String anotherWord : word.split("")) {
                System.out.print(anotherWord + ", ");
            }
        }

        long start = System.nanoTime();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        long end = System.nanoTime();
        System.out.println("delta: " + (end - start));
    }
}
