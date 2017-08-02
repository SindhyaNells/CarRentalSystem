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
    public void requestCar(Car car) {

    }

    @Override
    public void denyCarRequest(Car car) {

    }

    @Override
    public void activateCarListing(Car car) {

    }

    @Override
    public void inactivateCarListing(Car car) {

    }

    @Override
    public void rentCar(Car car) {

    }

    @Override
    public CarState getState() {
        return null;
    }

    @Override
    public void setState(CarState carState) {

    }
}
