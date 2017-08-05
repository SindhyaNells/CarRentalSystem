package com.car.rental.controller;

import com.car.rental.controller.search.CriteriaCarColor;
import com.car.rental.controller.search.CriteriaCarMake;
import com.car.rental.controller.search.CriteriaCarType;
import com.car.rental.controller.sort.PriceSortingStrategy;
import com.car.rental.controller.sort.RateSortingStrategy;
import com.car.rental.controller.sort.SortingStrategy;
import com.car.rental.model.car.*;
import com.car.rental.model.car.carType.CoupeCar;
import com.car.rental.model.car.carType.LuxuryCar;
import com.car.rental.model.car.carType.SUVCar;
import com.car.rental.model.car.carType.SedanCar;
import com.car.rental.model.enums.*;
import com.car.rental.model.enums.Location;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sindhya on 8/2/17.
 */
public class CarController {

    private static Scanner scanner;
    //List<Car> carList=new ArrayList<>();
    CarList carList=new CarList();

    public CarList getCarList() {
        return carList;
    }

    public void setCarList(CarList carList) {
        this.carList = carList;
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

    public void addCar(User user){

        System.out.println("List you car");

        System.out.println("Enter the location(city):");
        scanner=new Scanner(System.in);
        String location=scanner.nextLine();

        System.out.println("Enter the Car Type (Luxury,Sedan,SUV,Coupe):");
        scanner=new Scanner(System.in);
        String carType=scanner.nextLine();

        System.out.println("Enter the Car Make (Audi,Fiat,Nissan,Honda):");
        scanner=new Scanner(System.in);
        String carMake=scanner.nextLine();

        System.out.println("Enter the Fuel Type (Electric,Gas):");
        scanner=new Scanner(System.in);
        String fuelType=scanner.nextLine();

        System.out.println("Enter the Transmission Type (Automatic,Manual)");
        scanner=new Scanner(System.in);
        String transmissionType=scanner.nextLine();

        System.out.println("Enter the price");
        scanner=new Scanner(System.in);
        Float price=scanner.nextFloat();

        System.out.println("Enter the car color:");
        scanner=new Scanner(System.in);
        String color=scanner.nextLine();

        System.out.println("Enter the registation number:");
        scanner=new Scanner(System.in);
        String regisNumber=scanner.nextLine();

        System.out.println("Enter the passenger capacity:");
        scanner=new Scanner(System.in);
        int passengerCapacity=scanner.nextInt();

        buildCar(color,regisNumber,passengerCapacity,location,carType,carMake,fuelType,transmissionType,(Owner) user,price);

    }

    public void displayCar(List<Car> carList){

        for(Car car:carList)
            System.out.println("User:"+car.getOwner().getUserName() +" CarLocation:"+car.getLocation()+" Color: "+car.getVehicleColor()+" CarMake: "+car.getCarMake()+" CarType:"+car.getCarType());
    }

    public List<Car> sortingStrategy(SortingStrategy sortingStrategy){

        return sortingStrategy.sortCar(carList.getCarList());
    }

    public void sortCars(){

        System.out.println("Sort Cars");
        System.out.println("Sort By 1.Owner Rating 2.Price");
        scanner=new Scanner(System.in);
        int sortOption=scanner.nextInt();

        if(sortOption==1){
            displayCar(sortingStrategy(new RateSortingStrategy()));
        }else if(sortOption==2){
            displayCar(sortingStrategy(new PriceSortingStrategy()));
        }

    }


    public void searchCar(){

        if(carList.getCarList().size()==0){
            System.out.println("No cars to search");

        }else {

            System.out.println("Search Cars");
            System.out.println("Search By 1.Car Type 2.Car Make 3:Car Color");
            scanner = new Scanner(System.in);
            int searchType = scanner.nextInt();


            if (searchType == 1) {
                System.out.println("Enter the car type:");
                scanner = new Scanner(System.in);
                String carType = scanner.nextLine();
                this.displayCar(this.searchByCarType(carType));

            } else if (searchType == 2) {
                System.out.println("Enter the car make:");
                scanner = new Scanner(System.in);
                String carMake = scanner.nextLine();
                this.displayCar(this.searchByCarMake(carMake));

            } else if (searchType == 3) {
                System.out.println("Enter the car color:");
                scanner = new Scanner(System.in);
                String carColor = scanner.nextLine();
                this.displayCar(this.searchByCarColor(carColor));

            }
        }


    }

    public List<Car> searchByCarType(String carType){

        System.out.println("Searching by Car Type");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarType carTypeCriteria = new CriteriaCarType(carType);
        carResultList = carTypeCriteria.meetCriteria(carList.getCarList());
        return carResultList;
    }

    public List<Car> searchByCarMake(String carMake){

        System.out.println("Searching by Car Make");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarMake carMakeCriteria=new CriteriaCarMake(carMake);
        carResultList = carMakeCriteria.meetCriteria(carList.getCarList());
        return carResultList;
    }

    public List<Car> searchByCarColor(String carColor){

        System.out.println("Searching by Car Color");
        List<Car> carResultList=new ArrayList<>();
        CriteriaCarColor carColorCriteria=new CriteriaCarColor(carColor);
        carResultList=carColorCriteria.meetCriteria(carList.getCarList());
        return carResultList;
    }

}
