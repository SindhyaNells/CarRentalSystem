package com.car.rental.model.car;

import com.car.rental.model.car.state.CarState;
import com.car.rental.model.car.state.RentCar;
import com.car.rental.model.rent.InsurancePolicy;

/**
 * Created by sindhya on 7/28/17.
 */
public class Car extends Vehicle implements RentCar {


    private CarMake carMake;
    private CarType carType;
    private FuelType fuelType;
    private TransmissionType transmissionType;


    public Car(CarColor vehicleColor, String registrationNumber, String licenseNumber, int passengerCapacity, InsurancePolicy policy, String location,CarType carType,CarMake carMake,FuelType fuelType,TransmissionType transmissionType){
        super(vehicleColor,registrationNumber,licenseNumber,passengerCapacity,policy,location);
        this.carType=carType;
        this.carMake=carMake;
        this.fuelType=fuelType;
        this.transmissionType=transmissionType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

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
