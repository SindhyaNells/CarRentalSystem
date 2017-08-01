package com.car.rental.model.car;

/**
 * Created by sindhya on 7/30/17.
 */
public enum CarType {

    SEDAN("SEDAN"),
    COUPE("COUPE"),
    SUV("SUV"),
    CROSSOVER("CROSSOVER"),
    CONVETIBLE("CONVERTIBLE"),
    LUXURY("LUXURY");

    private String car_type;

    CarType(String carType){
        this.car_type=carType;
    }

}
