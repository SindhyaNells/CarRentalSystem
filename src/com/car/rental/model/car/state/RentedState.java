package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public class RentedState implements CarState {
    RentCar rentCar;

    public RentedState(RentCar rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar(Car car ) {
        return "Your request cannot be processed. The car is rented.";
    }

    @Override
    public String denyCarRequest(Car car) {
        return "This car is rented.";
    }

    @Override
    public String activateCarListing(Car car) {
        rentCar.setState(new AvailableState(car));
        return "This car is in active already and the car is rented.";
    }

    @Override
    public String inactivateCarListing(Car car) {
        return "This car cannot be inactivated.";
    }

    @Override
    public String rentCar(Car car) {
        return "This car is rented already.";
    }
}
