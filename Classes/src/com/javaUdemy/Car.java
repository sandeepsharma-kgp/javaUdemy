package com.javaUdemy;

public class Car {

    private int doors;
    private int wheels;
    //public String model; // only this variable is accessible outside this class.
    private String model;
    private String engine;
    private String colour;

    //setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore"))
            this.model = model;
        else
            this.model = "Unknown";
    }

    //getter
    public String getModel(){
        return this.model;
    }
}
