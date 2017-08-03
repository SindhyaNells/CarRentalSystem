package com.car.rental.controller.search;

import com.car.rental.model.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sindhya on 8/2/17.
 */
public class CriteriaCarMake implements CarSearchCriteria {

    private String carMake;

    public CriteriaCarMake(String carMake){
        this.carMake=carMake;
    }

    @Override
    public List<Car> meetCriteria(List<Car> carList) {
        List<Car> carResultList=new ArrayList<>();

        for(Car car: carList){
            if(car.getCarMake().name().equalsIgnoreCase(carMake)){
                carResultList.add(car);
            }
        }
        return carResultList;
    }
}