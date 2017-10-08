package com.javaUdemy;

public class Main {

    public static void main(String[] args) {

        Toyota t = new Toyota(36);
        t.steer(45);
        t.accelerate(30);
        t.accelerate(20);
        t.accelerate(-40);
        t.stop();
    }
}
