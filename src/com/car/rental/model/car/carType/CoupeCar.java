package com.car.rental.model.car.carType;

import com.car.rental.model.car.*;
import com.car.rental.model.car.InsurancePolicy;
import com.car.rental.model.rent.Location;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.User;

import java.math.BigDecimal;

/**
 * Created by sindhya on 8/1/17.
 */
public class CoupeCar extends Car {

    public CoupeCar(CarColor vehicleColor, String registrationNumber, int passengerCapacity, Location location, CarType carType, CarMake carMake, FuelType fuelType, TransmissionType transmissionType, Owner owner, Float price) {
        super(vehicleColor,registrationNumber,passengerCapacity,location,carType,carMake,fuelType,transmissionType,owner,price);
    }
}
