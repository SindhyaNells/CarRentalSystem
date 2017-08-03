package com.car.rental.controller;

import com.car.rental.model.car.*;
import com.car.rental.model.car.carType.CoupeCar;
import com.car.rental.model.car.carType.LuxuryCar;
import com.car.rental.model.car.carType.SUVCar;
import com.car.rental.model.car.carType.SedanCar;
import com.car.rental.model.rent.InsurancePolicy;

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

    public Car buildCar(String vehicleColor, String registrationNumber, String licenseNumber, int passengerCapacity, InsurancePolicy policy, String location, String carType, String carMake, String fuelType, String transmissionType){

        Car car=null;
        CarColor carColorEnum=CarColor.fromCarColor(vehicleColor);
        CarType carTypeEnum=CarType.fromCarType(carType);
        CarMake carMakeEnum=CarMake.fromFuelMake(carMake);
        FuelType fuelTypeEnum=FuelType.fromFuelType(fuelType);
        TransmissionType transmissionTypeEnum=TransmissionType.fromTransmissionType(transmissionType);
        switch (carTypeEnum){

            case COUPE:
                car=new CoupeCar(carColorEnum,registrationNumber,licenseNumber,passengerCapacity,policy,location,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum);
                break;
            case SEDAN:
                car=new SedanCar(carColorEnum,registrationNumber,licenseNumber,passengerCapacity,policy,location,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum);
                break;
            case SUV:
                car=new SUVCar(carColorEnum,registrationNumber,licenseNumber,passengerCapacity,policy,location,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum);
                break;
            case LUXURY:
                car=new LuxuryCar(carColorEnum,registrationNumber,licenseNumber,passengerCapacity,policy,location,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum);
                break;
        }
       

        carList.add(car);

        return car;

    }
}
