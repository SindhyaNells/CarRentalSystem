package com.car.rental.model.car.decorator;

import com.car.rental.model.car.Car;
import com.car.rental.model.car.CarColor;
import com.car.rental.model.car.CarMake;
import com.car.rental.model.car.CarType;
import com.car.rental.model.car.FuelType;
import com.car.rental.model.car.TransmissionType;
import com.car.rental.model.rent.InsurancePolicy;

/**
 * Created by SaiRajee on 8/2/17.
 */

public abstract class CarDecorator extends Car{
	
	private Car car;

	public CarDecorator(CarColor vehicleColor, String registrationNumber, String licenseNumber, int passengerCapacity,
			InsurancePolicy policy, String location, CarType carType, CarMake carMake, FuelType fuelType,
			TransmissionType transmissionType) {
		super(vehicleColor, registrationNumber, licenseNumber, passengerCapacity, policy, location, carType, carMake, fuelType,
				transmissionType);
		// TODO Auto-generated constructor stub
	}
	
	public CarDecorator(Car car){
		this.car = car;
	}
	
	@Override
	public void upgrade(){
		car.upgrade();
	}


}


