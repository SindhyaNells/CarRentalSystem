package com.car.rental.model.car.state;

import com.car.rental.model.car.Car;
import com.car.rental.model.car.Vehicle;

/**
 * Created by sindhya on 7/31/17.
 */
public class RentedState implements CarState {
    Vehicle rentCar;

    public RentedState(Vehicle rentObj){
        this.rentCar=rentObj;
    }

    @Override
    public String requestCar() {
        return "Your request cannot be processed. The car is rented.";
    }

    @Override
    public String denyCarRequest() {
        return "This car is rented.";
    }

    @Override
    public String activateCarListing() {
        rentCar.setState(new AvailableState(rentCar));
        return "This car is active already and the car is rented.";
    }

    @Override
    public String inactivateCarListing() {
        return "This car cannot be inactivated.";
    }

    @Override
    public String rentCar() {
        return "This car is rented already.";
    }

    @Override
    public String returnCar() {
        rentCar.setState(new AvailableState(rentCar));
        return "The car is returned";
    }
}
