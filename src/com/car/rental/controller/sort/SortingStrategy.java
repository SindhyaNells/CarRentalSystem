package com.car.rental.controller.sort;

import com.car.rental.model.car.Car;

import java.util.List;

/**
 * Created by sindhya on 8/3/17.
 */
public interface SortingStrategy {

    public List<Car> sortCar(List<Car> carList);
}
