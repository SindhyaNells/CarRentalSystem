package com.car.rental.controller.search;

import com.car.rental.model.car.Car;

import java.util.List;

/**
 * Created by sindhya on 8/1/17.
 */
public interface CarSearchCriteria {

    public List<Car> meetCriteria(List<Car> carList);

}
