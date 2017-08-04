package com.car.rental;

import com.car.rental.controller.CarController;
import com.car.rental.controller.UserController;
import com.car.rental.controller.search.CriteriaCarColor;
import com.car.rental.controller.search.CriteriaCarMake;
import com.car.rental.controller.search.CriteriaCarType;
import com.car.rental.controller.sort.SortByPrice;
import com.car.rental.controller.sort.SortByRating;
import com.car.rental.model.car.Car;
import com.car.rental.model.car.InsurancePolicy;
import com.car.rental.model.user.Address;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sindhya on 7/30/17.
 */
public class CarRentalTest {


    private static Scanner scanner;
    public static void main(String args[]){

        System.out.println("Car Rental Management System");
        System.out.println("Select option:");
        /*System.out.println("1.Login 2.Register");
        scanner=new Scanner(System.in);
        if(scanner.nextInt()==1){

        }*/

        System.out.println("Choose user type to register");
        System.out.println("1.Owner 2. Renter");
        scanner=new Scanner(System.in);

        int user_type=scanner.nextInt();
        User user=registerUser(user_type);

        if(user_type==1){
            listCar(user);
        }else{
            //TODO:rent car
            searchCar();
            sortCar();
        }

    }

    private static User registerUser(int user_type){
        UserController userController=new UserController();

        System.out.println("Enter the user name");
        scanner=new Scanner(System.in);
        String user_name=scanner.nextLine();

        System.out.println("Enter the user email");
        scanner=new Scanner(System.in);
        String user_email=scanner.nextLine();

        System.out.println("Enter the user password");
        scanner=new Scanner(System.in);
        String user_pwd=scanner.nextLine();

        System.out.println("Enter the user address(street,city,zipcode)");
        scanner=new Scanner(System.in);
        String user_addr=scanner.nextLine();
        String[] arr=user_addr.split(",");
        Address address=new Address(arr[0],arr[1],arr[2]);

        System.out.println("Enter the contact");
        scanner=new Scanner(System.in);
        String contact=scanner.nextLine();

        User user=userController.register(user_type,userController.getUserList().size()+1,user_name,user_email,user_pwd,address,contact);

        return user;
    }

    private static void listCar(User user){
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


        CarController carController=new CarController();
        carController.buildCar(color,regisNumber,passengerCapacity,location,carType,carMake,fuelType,transmissionType,(Owner) user,price);

    }

    private static void searchCar(){

        CarController carController=new CarController();

        System.out.println("Search Cars");
        System.out.println("Search By 1.Car Type 2.Car Make 3:Car Color");
        scanner=new Scanner(System.in);
        int searchType=scanner.nextInt();

        List<Car> carResultList=new ArrayList<>();

        if(searchType==1) {
            System.out.println("Enter the car type:");
            scanner=new Scanner(System.in);
            String carType=scanner.nextLine();
            carController.displayCar(carController.searchByCarType(carType));

        }else if(searchType==2){
            System.out.println("Enter the car make:");
            scanner=new Scanner(System.in);
            String carMake=scanner.nextLine();
            carController.displayCar(carController.searchByCarMake(carMake));

        }else if(searchType == 3){
            System.out.println("Enter the car color:");
            scanner=new Scanner(System.in);
            String carColor=scanner.nextLine();
            carController.displayCar(carController.searchByCarColor(carColor));

        }


    }

    private static void sortCar() {

        CarController carController=new CarController();
        System.out.println("Sort Cars");
        System.out.println("Sort By 1.Owner Rating 2.Price");
        scanner=new Scanner(System.in);
        int sortOption=scanner.nextInt();

        if(sortOption==1){
            carController.displayCar(carController.sortCars(new SortByRating()));
        }else if(sortOption==2){
            carController.displayCar(carController.sortCars(new SortByPrice()));
        }

    }

    public static void rentCar(){

        System.out.println("Rent Car");


    }
}
