package com.car.rental;

import com.car.rental.controller.car.CarController;
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
        CarController carController = CarController.getInstance();


        Address address=new Address("141S","San Jose","12345");
        Owner owner = new Owner(1,"Jack","sind@gmail.com","12345",address,"12345");

        Owner owner1 = new Owner(2,"Tom","sind@gmail.com","12345",address,"12345");

        Owner owner2 = new Owner(3,"Harry","sind@gmail.com","12345",address,"12345");

        List<Car> carResultList=new ArrayList<>();
        Car a = new CoupeCar("blue", "1234", 4, Location.LOSANGELES, CarType.COUPE, CarMake.AUDI, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner,15.0f);
        carResultList.add(a);
        Car b = new LuxuryCar("red", "2345", 4, Location.DALLAS, CarType.LUXURY, CarMake.BMW, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner1,14f);
        carResultList.add(b);
        Car c = new LuxuryCar("black", "3456", 4, Location.NEWYORK, CarType.LUXURY, CarMake.BMW, FuelType.ELECTRIC, TransmissionType.AUTOMATIC,owner2,20f);
        carResultList.add(c);

        carController.setCarList(new CarList(carResultList));

        //carController.searchCar();
        carController.sortCars();
    }

}
