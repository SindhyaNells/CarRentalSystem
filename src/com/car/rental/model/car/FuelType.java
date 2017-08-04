package com.car.rental.model.car;

/**
 * Created by sindhya on 7/30/17.
 */
public enum FuelType {

    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");

    private String fuel_type;

    FuelType(String fuel_type){
        this.fuel_type=fuel_type;
    }

    public static FuelType fromFuelType(String fuel_type){
        for(FuelType fuelType:values()){
            if(fuelType.fuel_type.equals(fuel_type)){
                return fuelType;
            }
        }
        return null;
    }
}

