package com.car.rental.controller;

import com.car.rental.controller.search.CriteriaCarColor;
import com.car.rental.controller.search.CriteriaCarMake;
import com.car.rental.controller.search.CriteriaCarType;
import com.car.rental.controller.sort.SortingStrategy;
import com.car.rental.model.car.*;
import com.car.rental.model.car.carType.CoupeCar;
import com.car.rental.model.car.carType.LuxuryCar;
import com.car.rental.model.car.carType.SUVCar;
import com.car.rental.model.car.carType.SedanCar;
import com.car.rental.model.enums.*;
import com.car.rental.model.enums.Location;
import com.car.rental.model.user.Owner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sindhya on 8/2/17.
 */
public class CarController {

    List<Car> carList=new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public Car buildCar(String vehicleColor, String registrationNumber, int passengerCapacity, String location, String carType, String carMake, String fuelType, String transmissionType, Owner owner, Float price){

        Car car=null;
        CarColor carColorEnum=CarColor.fromCarColor(vehicleColor);
        CarType carTypeEnum=CarType.fromCarType(carType);
        CarMake carMakeEnum=CarMake.fromFuelMake(carMake);
        FuelType fuelTypeEnum=FuelType.fromFuelType(fuelType);
        TransmissionType transmissionTypeEnum=TransmissionType.fromTransmissionType(transmissionType);
        Location locationEnum=Location.fromLocation(location);
        switch (carTypeEnum){

            case COUPE:
                car=new CoupeCar(carColorEnum,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case SEDAN:
                car=new SedanCar(carColorEnum,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case SUV:
                car=new SUVCar(carColorEnum,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case LUXURY:
                car=new LuxuryCar(carColorEnum,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
        }
       

        carList.add(car);

        return car;

    }

    public void displayCar(List<Car> carList){

        for(Car car:carList)
            System.out.println("User:"+car.getOwner().getUserName() +" CarLocation:"+car.getLocation()+" Color: "+car.getVehicleColor()+" CarMake: "+car.getCarMake()+" CarType:"+car.getCarType());
    }

    public List<Car> sortCars(SortingStrategy sortingStrategy){

        return sortingStrategy.sortCar(carList);
    }

    public List<Car> searchByCarType(String carType){

        System.out.println("Sorting by Car Type");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarType carTypeCriteria = new CriteriaCarType(carType);
        carResultList = carTypeCriteria.meetCriteria(carList);

        return carResultList;
    }

    public List<Car> searchByCarMake(String carMake){

        System.out.println("Sorting by Car Make");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarMake carMakeCriteria=new CriteriaCarMake(carMake);
        carResultList = carMakeCriteria.meetCriteria(carList);

        return carResultList;
    }

    public List<Car> searchByCarColor(String carColor){

        System.out.println("Sorting by Car Color");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarColor carColorCriteria=new CriteriaCarColor(carColor);
        carResultList=carColorCriteria.meetCriteria(carList);

        return carResultList;
    }

}
