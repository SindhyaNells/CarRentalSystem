package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;
import com.car.rental.model.car.Vehicle;

/**
 * Created by sindhya on 7/31/17.
 */
public class RequestedState implements CarState {

    Vehicle rentCar;

    public RequestedState(Vehicle rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar() {
        return "The car is already in requested state";
    }

    @Override
    public String denyCarRequest() {
        rentCar.setState(new AvailableState(rentCar));
        return "The car request is denied.";
    }

    @Override
    public String activateCarListing() {
        return "The car is active already";
    }

    @Override
    public String inactivateCarListing() {
        return "The car cannot be made inactive. It is in requested state.";
    }

    @Override
    public String rentCar() {
        rentCar.setState(new RentedState(rentCar));
        return "The car is rented.";
    }

    @Override
    public String returnCar() {
        return "The car is not rented";
    }
}
