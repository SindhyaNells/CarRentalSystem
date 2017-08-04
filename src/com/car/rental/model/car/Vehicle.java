package com.car.rental.model.car;

import com.car.rental.model.rent.Location;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.User;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by sindhya on 7/30/17.
 */
public class Vehicle {

    private CarColor vehicleColor;
    private String registrationNumber;
    private int passengerCapacity;
    private ArrayList<Policy> policy;
    private Location location;
    private Owner owner;
    private Float price;


    public Vehicle(){
    	
    }


    public Vehicle(CarColor vehicleColor,String registrationNumber,int passengerCapacity,Location location,Owner owner,Float price){
        this.vehicleColor=vehicleColor;
        this.registrationNumber=registrationNumber;
        this.passengerCapacity=passengerCapacity;
        this.location=location;
        this.owner=owner;
        this.price=price;
    }

    public CarColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(CarColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
