package org.launchcode;

import java.util.Scanner;

public class Driver {

    public Driver() {
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Array array = new Array();
        array.loadArray();
        array.printArray();


        Menu menu = new Menu();
        menu.displayMenu();

    }
}
