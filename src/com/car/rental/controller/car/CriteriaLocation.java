package com.car.rental.controller.car;

import com.car.rental.model.car.Car;

import java.util.ArrayList;
import java.util.Iterator;
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

        Iterator<Car> carIterator=carList.iterator();
        while(carIterator.hasNext()){
            Car car=carIterator.next();
            if(car.getLocation().getCity().equalsIgnoreCase(carLocation)){
                carResultList.add(car);
            }
        }
        return carResultList;
    }
}
