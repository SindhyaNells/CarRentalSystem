package com.car.rental.model.car;

import com.car.rental.model.car.state.CarState;
import com.car.rental.model.car.state.RentCar;

/**
 * Created by sindhya on 7/28/17.
 */
public class Car extends Vehicle implements RentCar {


    private CarMake carMake;
    private CarType carType;
    private FuelType fuelType;
    private TransmissionType transmissionType;

    @Override
    public void requestCar() {

    }

    @Override
    public void denyCarRequest() {

    }

    @Override
    public void activateCarListing() {

    }

    @Override
    public void inactivateCarListing() {

    }

    @Override
    public void rentCar() {

    }

    @Override
    public CarState getState() {
        return null;
    }

    @Override
    public void setState(CarState carState) {

    }
}
