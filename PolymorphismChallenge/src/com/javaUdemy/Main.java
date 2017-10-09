package com.javaUdemy;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitshubushi extends Car {
    public Mitshubushi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubushi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshubushi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshubushi -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitshubushi mitshubushi = new Mitshubushi(8,"Base Car");
        System.out.println(mitshubushi.startEngine());
        System.out.println(mitshubushi.accelerate());
        System.out.println(mitshubushi.brake());

        //creating Inline Class
        Car ford = new Car(8, "Base Car") {
            @Override
            public String startEngine() {
                return getClass().getSimpleName() + " -> startEngine()";
            }

            @Override
            public String accelerate() {
                return "Ford -> accelerate()";
            }

            @Override
            public String brake() {
                return "Ford -> brake()";
            }
        };
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Toyota toyota = new Toyota(8,"Base Car");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Holden holden = new Holden(8,"Base Car");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

    static class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Holden -> accelerate()";
        }

        @Override
        public String brake() {
            return "Holden -> brake()";
        }
    }
}
