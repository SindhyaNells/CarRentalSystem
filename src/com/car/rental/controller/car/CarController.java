package com.car.rental.controller.car;

import com.car.rental.model.car.*;
import com.car.rental.model.car.carType.CoupeCar;
import com.car.rental.model.car.carType.LuxuryCar;
import com.car.rental.model.car.carType.SUVCar;
import com.car.rental.model.car.carType.SedanCar;
import com.car.rental.model.enums.*;
import com.car.rental.model.enums.Location;
import com.car.rental.model.rent.Rental;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.Renter;
import com.car.rental.model.user.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sindhya on 8/2/17.
 */
public class CarController {

    private static Scanner scanner;
    //List<Car> carList=new ArrayList<>();
    private CarList carList=new CarList();
    private static CarController carController = new CarController();

    private CarController() {

    }

    public static CarController getInstance() {
        return carController;
    }

    public CarList getCarList() {
        return carList;
    }

    public void setCarList(CarList carList) {
        this.carList = carList;
    }

    public Car buildCar(String vehicleColor, String registrationNumber, int passengerCapacity, String location, String carType, String carMake, String fuelType, String transmissionType, Owner owner, Float price){

        Car car=null;

        CarType carTypeEnum=CarType.fromCarType(carType);
        CarMake carMakeEnum=CarMake.fromFuelMake(carMake);
        FuelType fuelTypeEnum=FuelType.fromFuelType(fuelType);
        TransmissionType transmissionTypeEnum=TransmissionType.fromTransmissionType(transmissionType);
        Location locationEnum=Location.fromLocation(location);
        switch (carTypeEnum){

            case COUPE:
                car=new CoupeCar(vehicleColor,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case SEDAN:
                car=new SedanCar(vehicleColor,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case SUV:
                car=new SUVCar(vehicleColor,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
            case LUXURY:
                car=new LuxuryCar(vehicleColor,registrationNumber,passengerCapacity,locationEnum,carTypeEnum,carMakeEnum,fuelTypeEnum,transmissionTypeEnum,owner,price);
                break;
        }
       

        carList.add(car);

        return car;

    }

    public void addCar(User user){

        System.out.println("List your car");

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

        System.out.println("Your Car is listed successfully");

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

    public void rentCar(User user){


        System.out.println("Rent Car");

        CriteriaLocation criteriaLocation=new CriteriaLocation(user.getAddress().getCity());
        List<Car> carResultList=criteriaLocation.meetCriteria(carList.getCarList());

        for(int i=0;i<carResultList.size();i++){
            System.out.println(i+" CarType:"+carList.getCarList().get(i).getCarType()+" CarColor:"+carList.getCarList().get(i).getVehicleColor()+" CarMake:"+carList.getCarList().get(i).getCarMake()+" Price:"+carList.getCarList().get(i).getPrice()+" Location:"+carList.getCarList().get(i).getLocation());
        }

        System.out.println("Select car:");
        scanner=new Scanner(System.in);
        int car_id=scanner.nextInt();

        Vehicle car= (Vehicle) carList.getCarList().get(car_id);

        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the start date(dd-MM-yyyy):");
        scanner=new Scanner(System.in);
        String start_date=scanner.nextLine();
        Date startDate=null;
        try {
            startDate = format.parse(start_date);

        }catch (ParseException e){
            System.out.println("Parse exception");
        }

        System.out.println("Enter the end date(dd-MM-yyyy)");
        scanner=new Scanner(System.in);
        String end_date=scanner.nextLine();
        Date endDate=null;
        try {
            endDate = format.parse(end_date);

        }catch (ParseException e){
            System.out.println("Parse exception");
        }

        int numDays=(int)( (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));

        Float totalAmountPayable=numDays*car.getPrice();


        Rental rental=new Rental(startDate,endDate,(Renter)user,car,totalAmountPayable);

        car.getRentalList().add(rental);

        System.out.println("Num of Days:"+numDays+" TotalAmount:"+totalAmountPayable);

        System.out.println("Car is booked successfully");

    }

}
