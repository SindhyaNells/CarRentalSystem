package com.car.rental.controller.sort;

import com.car.rental.model.car.Car;
import com.car.rental.model.user.Owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sindhya on 8/3/17.
 */
public class SortByPrice implements SortingStrategy {

    @Override
    public List<Car> sortCar(List<Car> carList) {
        List<Car> carResultList=new ArrayList<>();

        if(carList.size()!=0) {

            Collections.sort(carList,(c1, c2)->Float.compare(c1.getPrice() ,c2.getPrice()));
        }

        return carResultList;
    }
}
