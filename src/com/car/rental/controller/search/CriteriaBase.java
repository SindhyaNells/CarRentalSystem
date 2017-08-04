package com.car.rental.controller.search;

import com.car.rental.model.car.Car;

import java.util.List;

/**
 * Created by sindhya on 8/4/17.
 */
public class CriteriaBase implements CarSearchCriteria{

    public List<Car> meetCriteria(List<Car> carList){
        //TODO code here to filter based on car state

        return carList;
    }
}
