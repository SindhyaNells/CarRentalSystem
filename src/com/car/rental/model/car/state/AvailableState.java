package com.car.rental.model.car.state;


import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public class AvailableState implements CarState {

    RentCar rentCar;

    public AvailableState(RentCar rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar(Car car) {

        rentCar.setState(new RequestedState(car));
        return "Car is requested";
    }

    @Override
    public String denyCarRequest(Car car) {
        return "This car is not requested";
    }

    @Override
    public String activateCarListing(Car car) {
        return "This car is already in available state";
    }

    @Override
    public String inactivateCarListing(Car car) {

        rentCar.setState(new NotAvailableState(car));
        return "The car is inactivated";
    }

    @Override
    public String rentCar(Car car) {
        rentCar.setState(new RentedState(car));
        return "The car rented";
    }
}
