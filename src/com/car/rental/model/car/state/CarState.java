package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public interface CarState {

    public String requestCar(Car car);
    public String denyCarRequest(Car car);
    public String activateCarListing(Car car);
    public String inactivateCarListing(Car car);
    public String rentCar(Car car);

}
