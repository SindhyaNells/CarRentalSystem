package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public class NotAvailableState implements CarState {

    RentCar rentCar;

    public NotAvailableState(RentCar rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar(Car car) {
        return "This car is not available";
    }

    @Override
    public String denyCarRequest(Car car) {
        return "This car is not requested";
    }

    @Override
    public String activateCarListing(Car car) {
        rentCar.setState(new AvailableState(car));
        return "Car listing Activated. This car is in available state now.";
    }

    @Override
    public String inactivateCarListing(Car car) {
        return "This car is not available";
    }

    @Override
    public String rentCar(Car car) {
        return "This car is not available for renting";
    }
}
