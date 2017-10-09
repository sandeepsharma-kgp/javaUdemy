package com.javaUdemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, true);
        System.out.println("Initial pages count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted +
                " new total print count: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed was: " + pagesPrinted +
                " new total print count: " + printer.getPagesPrinted());
    }
}
