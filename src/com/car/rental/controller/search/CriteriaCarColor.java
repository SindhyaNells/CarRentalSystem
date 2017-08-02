package com.car.rental.controller.search;

import com.car.rental.model.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sindhya on 8/2/17.
 */
public class CriteriaCarColor implements CarSearchCriteria {

    String carColor;
    public CriteriaCarColor(String carColor){
        this.carColor=carColor;
    }

    @Override
    public List<Car> meetCriteria(List<Car> carList) {
        List<Car> carResultList=new ArrayList<>();

        for(Car car: carList){
            if(car.getVehicleColor().name().equalsIgnoreCase(carColor)){
                carResultList.add(car);
            }
        }
        return carResultList;
    }
}
