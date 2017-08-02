package com.car.rental.model.car;

/**
 * Created by sindhya on 7/30/17.
 */
public enum CarType {

    SEDAN("Sedan"),
    COUPE("Coupe"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    CONVETIBLE("Convertible"),
    LUXURY("Luxury");

    private String car_type;

    CarType(String carType){
        this.car_type=carType;
    }

}
