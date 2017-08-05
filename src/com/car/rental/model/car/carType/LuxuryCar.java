package com.car.rental.model.car.carType;

import com.car.rental.model.car.*;
import com.car.rental.model.enums.*;
import com.car.rental.model.enums.Location;
import com.car.rental.model.user.Owner;

/**
 * Created by sindhya on 8/1/17.
 */
public class LuxuryCar extends Car {

    public LuxuryCar(String vehicleColor, String registrationNumber, int passengerCapacity, Location location, CarType carType, CarMake carMake, FuelType fuelType, TransmissionType transmissionType, Owner owner, Float price) {
        super(vehicleColor,registrationNumber,passengerCapacity,location,carType,carMake,fuelType,transmissionType,owner,price);
    }
}
