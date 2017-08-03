package com.car.rental.model.car.decorator;

import com.car.rental.model.car.Car;


/**
 * Created by SaiRajee on 8/2/17.
 */



public class CarNavigationDecorator extends CarDecorator{

	public CarNavigationDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void upgrade(){
		super.upgrade();
		System.out.println("ADD UPGRADE: GPS NAVIGATION");
	}
	
}