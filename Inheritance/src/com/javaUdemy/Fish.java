package com.javaUdemy;

public class Fish extends Animal{

    private int gills;
    private int fins;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int fins, int fins1) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.fins = fins1;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }
}
