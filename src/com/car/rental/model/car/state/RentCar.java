package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public interface RentCar {

    public void requestCar(Car car);
    public void denyCarRequest(Car car);
    public void activateCarListing(Car car);
    public void inactivateCarListing(Car car);
    public void rentCar(Car car);

    public CarState getState();
    public void setState(CarState carState);
}
