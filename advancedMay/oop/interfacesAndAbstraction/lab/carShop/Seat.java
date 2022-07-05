package SoftUni.advancedMay.oop.interfacesAndAbstraction.lab.carShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {

    private String model;
    private String color;
    private Integer getHorsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer getHorsePower, String produced) {
        this.model = model;
        this.color = color;
        this.getHorsePower = getHorsePower;
        this.countryProduced = produced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced, Car.TIRES);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.getHorsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }
}
