package com.car.rental;

import com.car.rental.controller.CarController;
import com.car.rental.model.car.Car;
import com.car.rental.model.car.CarList;
import com.car.rental.model.car.carType.CoupeCar;
import com.car.rental.model.car.carType.LuxuryCar;
import com.car.rental.model.enums.*;
import com.car.rental.model.user.Address;
import com.car.rental.model.user.Owner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sindhya on 8/4/17.
 */
public class Tester {

    private static Scanner scanner;

    public static void main(String args[]){
        CarController carController=new CarController();


        Address address=new Address("we","ca","12345");
        Owner owner = new Owner(1,"sindhya","sind@gmail.com","12345",address,"12345");

        Owner owner1 = new Owner(2,"vidhya","sind@gmail.com","12345",address,"12345");

        Owner owner2 = new Owner(3,"surya","sind@gmail.com","12345",address,"12345");

        List<Car> carResultList=new ArrayList<>();
        Car a = new CoupeCar(CarColor.BLUE, "ssgas", 4, Location.LOSANGELES, CarType.COUPE, CarMake.AUDI, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner,10.0f);
        carResultList.add(a);
        Car b = new LuxuryCar(CarColor.RED, "ssgas", 4, Location.DALLAS, CarType.LUXURY, CarMake.BMW, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner1,12f);
        carResultList.add(b);
        Car c = new LuxuryCar(CarColor.BLACK, "ssgas", 4, Location.NEWYORK, CarType.LUXURY, CarMake.BMW, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner2,12f);
        carResultList.add(c);

        carController.setCarList(new CarList(carResultList));

        carController.searchCar();
    }

}
