package org.example;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MainMenu obj1 = new MainMenu();
        obj1.menu();
    }
    /**********Menu Of EMS********/
}

class MainMenu {
    public void menu() {
        System.out.println("\t\t*********");
        System.out.println("Employee Management System");
        System.out.println("\t\t*********");
        System.out.println("\t\t---------");
        System.out.println("\t\t");
        System.out.println("\t\t~$ Cansu Altuner");
        System.out.println("\t\t\t -----------------");
        System.out.println("\n Press 1: To Add an Employee Details");
        System.out.println("\n Press 2: To See an Employee Details");
        System.out.println("\n Press 3: To Remove an Employee Details");
        System.out.println("\n Press 4: To Update an Employee Details");
        System.out.println("\n Press 4: Exit to EMS Portal");


    }
}

