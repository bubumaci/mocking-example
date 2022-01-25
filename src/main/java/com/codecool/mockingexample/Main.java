package com.codecool.mockingexample;

import com.codecool.mockingexample.businesslogic.BusinessLogic;
import com.codecool.mockingexample.businesslogic.DataSourceInterface;
import com.codecool.mockingexample.businesslogic.InMemoryDB;
import com.codecool.mockingexample.inheritance.GrandChild;
import com.codecool.mockingexample.pangram.Database;
import com.codecool.mockingexample.pangram.PangramChecker;

public class Main {
    public static void main(String[] args) {
        runPangramChecker();
        runBusinessLogic();
        runInheritanceExample();
    }

    public static void runPangramChecker() {
        System.out.println("-----------run Pangram Checker-----------");
        Database database = new Database();
        PangramChecker pangramChecker = new PangramChecker(database);
        boolean isPangram = pangramChecker.check("the quick brown fox jumps over a lazy dog");
        System.out.println(isPangram);
    }

    public static void runBusinessLogic() {
        System.out.println("-----------run Business Logic-----------");
        DataSourceInterface dataSource = new InMemoryDB();
        dataSource.addElement(4567);
        dataSource.addElement(12);
        BusinessLogic businessLogic = new BusinessLogic(dataSource);
        businessLogic.run();
    }

    public static void runInheritanceExample() {
        System.out.println("-----------run Inheritance Example-----------");
        System.out.println(new GrandChild(2,3));
    }
}
