package com.javaUdemy;

public class Vehicle {
    private String name;
    private int size;

    private int currentSpeed;
    private int currentDir;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDir = 0;
    }

    public void steer(int dir) {
        this.currentDir += dir;
        System.out.println("Vehicle.steer(): Steering at " + currentDir + " degrees.");
    }

    public void move(int speed, int dir) {
        this.currentDir = dir;
        this.currentSpeed = speed;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction "
                            + currentDir);
    }

    public void stop() {
        System.out.println("Vehicle.stop() called");
        this.currentSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDir() {
        return currentDir;
    }
}
