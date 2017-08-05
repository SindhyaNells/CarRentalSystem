package com.car.rental.controller.car;

import com.car.rental.model.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sindhya on 8/4/17.
 */
public class CriteriaLocation implements CarSearchCriteria {

    private String carLocation;

    public CriteriaLocation(String location){
        this.carLocation=location;
    }

    @Override
    public List<Car> meetCriteria(List<Car> carList) {
        List<Car> carResultList=new ArrayList<>();

        for(Car car: carList){
            if(car.getCarType().name().equalsIgnoreCase(carLocation)){
                carResultList.add(car);
            }
        }
        return carResultList;
    }
}
