package com.car.rental;

import com.car.rental.controller.CarController;
import com.car.rental.controller.UserController;
import com.car.rental.controller.search.CriteriaCarType;
import com.car.rental.model.car.Car;
import com.car.rental.model.rent.InsurancePolicy;
import com.car.rental.model.user.Address;

import java.math.BigDecimal;
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
        registerUser(user_type);

        if(user_type==1){
            listCar();
        }else{
            rentCar();
        }

    }

    private static void registerUser(int user_type){
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

        /*if(user_type==1){

            userController.registerOwner(userController.getUserList().size()+1,user_name,user_email,user_pwd,address,contact);

        }else if(user_type==2){

            userController.registerRenter(userController.getUserList().size()+1,user_name,user_email,user_pwd,address,contact);
        }*/

        userController.register(user_type,userController.getUserList().size()+1,user_name,user_email,user_pwd,address,contact);

    }

    private static void listCar(){
        System.out.println("List you car");

        System.out.println("Enter the car color:");
        scanner=new Scanner(System.in);
        String color=scanner.nextLine();

        System.out.println("Enter the registation number:");
        scanner=new Scanner(System.in);
        String regisNumber=scanner.nextLine();

        System.out.println("Enter the license number:");
        scanner=new Scanner(System.in);
        String licenseNumber=scanner.nextLine();

        System.out.println("Enter the passenger capacity:");
        scanner=new Scanner(System.in);
        int passengerCapacity=scanner.nextInt();

        System.out.println("Enter the location:");
        scanner=new Scanner(System.in);
        String location=scanner.nextLine();

        System.out.println("Enter the insurance policy name:");
        scanner=new Scanner(System.in);
        String policy_name=scanner.nextLine();

        System.out.println("Enter the insurance policy price:");
        scanner=new Scanner(System.in);
        BigDecimal policy_price=scanner.nextBigDecimal();

        InsurancePolicy insurancePolicy=new InsurancePolicy(policy_name,policy_price);

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

        CarController carController=new CarController();
        carController.buildCar(color,regisNumber,licenseNumber,passengerCapacity,insurancePolicy,location,carType,carMake,fuelType,transmissionType);

    }

    private static void rentCar(){

        CarController carController=new CarController();
        CriteriaCarType carTypeCriteria=new CriteriaCarType("Coupe");
        List<Car> carList = carTypeCriteria.meetCriteria(carController.getCarList());

        for (Car car:carList)
            System.out.println(car.getCarType());
    }
}
