package com.car.rental;

/**
 * Created by sindhya on 7/28/17.
 */
public enum CarTypeEnum {

    BMW("BMW"),
    AUDI("AUDI"),
    FERRARI("FERRARI"),
    FIAT("FIAT"),
    NISSAN("NISSAN");


    private String carModelName;

    CarTypeEnum(String modelName){
        this.carModelName=modelName;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }
}
