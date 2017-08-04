package com.car.rental.model.enums;

/**
 * Created by sindhya on 8/1/17.
 */
public enum CarColor {

    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");

    private String carColor;

    CarColor(String color){
        this.carColor=color;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public static CarColor fromCarColor(String cal_color){
        for(CarColor carColor:values()){
            if(carColor.carColor.equals(cal_color)){
                return carColor;
            }
        }
        return null;
    }

}
