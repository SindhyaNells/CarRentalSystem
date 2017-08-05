package com.car.rental.model.car;

import com.car.rental.model.enums.*;
import com.car.rental.model.enums.Location;
import com.car.rental.model.user.Owner;

/**
 * Created by sindhya on 7/28/17.
 */
public abstract class Car extends Vehicle {


    private CarMake carMake;
    private CarType carType;
    private FuelType fuelType;
    private TransmissionType transmissionType;


    public Car(){
        super();
    }

    public Car(String vehicleColor, String registrationNumber, int passengerCapacity, Location location, CarType carType, CarMake carMake, FuelType fuelType, TransmissionType transmissionType,Owner owner,Float price){
        super(vehicleColor,registrationNumber,passengerCapacity,location,owner,price);
        this.carType=carType;
        this.carMake=carMake;
        this.fuelType=fuelType;
        this.transmissionType=transmissionType;
    }
    
    public void upgrade(){
    	
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



}
