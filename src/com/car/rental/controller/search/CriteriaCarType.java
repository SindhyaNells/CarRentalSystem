package com.car.rental.controller.search;

import com.car.rental.model.car.Car;
import com.car.rental.model.car.CarType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sindhya on 8/1/17.
 */
public class CriteriaCarType implements CarSearchCriteria {

    private String carType;

    public CriteriaCarType(String carType){
        this.carType=carType;
    }

    @Override
    public List<Car> meetCriteria(List<Car> carList) {
        List<Car> carResultList=new ArrayList<>();

        for(Car car: carList){
            if(car.getCarType().name().equalsIgnoreCase(carType)){
                carResultList.add(car);
            }
        }
        return carResultList;
    }

}
