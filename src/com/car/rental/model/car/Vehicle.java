package com.car.rental.model.car;

import com.car.rental.model.rent.Location;

/**
 * Created by sindhya on 7/30/17.
 */
public class Vehicle {

    private CarColor vehicleColor;
    private String registrationNumber;
    private String licenseNumber;
    private int passengerCapacity;
    private InsurancePolicy policy;
    private Location location;


    public Vehicle(){
    	
    }


    public Vehicle(CarColor vehicleColor,String registrationNumber,String licenseNumber,int passengerCapacity,InsurancePolicy policy,Location location){
        this.vehicleColor=vehicleColor;
        this.registrationNumber=registrationNumber;
        this.licenseNumber=licenseNumber;
        this.passengerCapacity=passengerCapacity;
        this.policy=policy;
        this.location=location;
    }

    public CarColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(CarColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
