package com.javaUdemy;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car(); // created an object porche of type car.
        Car holden = new Car(); // created an object holden of type car.

        //System.out.println("Model is "+porche.getModel());
        porche.setModel("911");
        System.out.println("Model is "+porche.getModel());
    }
}
