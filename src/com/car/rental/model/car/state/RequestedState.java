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
        return "The car is already in requested state";
    }

    @Override
    public String denyCarRequest(Car car) {
        rentCar.setState(new AvailableState(car));
        return "The car request is denied.";
    }

    @Override
    public String activateCarListing(Car car) {
        return "The car is active already";
    }

    @Override
    public String inactivateCarListing(Car car) {
        return "The car cannot be made inactive. It is in requested state.";
    }

    @Override
    public String rentCar(Car car) {
        rentCar.setState(new RentedState(car));
        return "The car is rented.";
    }

    @Override
    public String returnCar(Car car) {
        return "The car is not rented";
    }
}
