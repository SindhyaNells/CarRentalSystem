package com.car.rental.model.car.decorator;

import com.car.rental.model.car.Car;


/**
 * Created by SaiRajee on 8/2/17.
 */

public abstract class CarDecorator extends Car{
	
	private Car car;


	
	public CarDecorator(Car car){
		this.car = car;
	}
	
	@Override
	public void upgrade(){
		car.upgrade();
	}


}


