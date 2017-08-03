package com.car.rental.model.car.carType;

import com.car.rental.model.car.*;
import com.car.rental.model.car.InsurancePolicy;
import com.car.rental.model.rent.Location;

/**
 * Created by sindhya on 8/1/17.
 */
public class CoupeCar extends Car {

    public CoupeCar(CarColor vehicleColor, String registrationNumber, String licenseNumber, int passengerCapacity, InsurancePolicy policy, Location location, CarType carType, CarMake carMake, FuelType fuelType, TransmissionType transmissionType) {
        super(vehicleColor,registrationNumber,licenseNumber,passengerCapacity,policy,location,carType,carMake,fuelType,transmissionType);
    }
}
