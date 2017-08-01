package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public class RequestedState implements CarState {

    RentCar rentCar;

    public RequestedState(RentCar rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar(Car car) {
        return null;
    }

    @Override
    public String denyCarRequest(Car car) {
        return null;
    }

    @Override
    public String activateCarListing(Car car) {
        return null;
    }

    @Override
    public String inactivateCarListing(Car car) {
        return null;
    }

    @Override
    public String rentCar(Car car) {
        return null;
    }
}
