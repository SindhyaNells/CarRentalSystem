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

        do {

            System.out.println("Choose User");
            System.out.println("1.Owner 2.Renter");
            scanner=new Scanner(System.in);
            int user_type = scanner.nextInt();

            System.out.println("Choose operation");
            System.out.println("1.Register 2.Login ");
            scanner = new Scanner(System.in);
            int option=scanner.nextInt();

            if(option==1) {
                registerUser(user_type);
            }else if(user_type==2) {

                break;
            }

            /*if (user_type == 1) {
                listCar(user);
            } else {
                //TODO:rent car
                //searchCar();
                //sortCar();

                rentCar();
            }*/
        }while(1!=0);



    }

    private static User registerUser(int user_type){
        UserController userController=new UserController();

        User user=userController.register(user_type);

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

        CarController carController=new CarController();

        List<Car> carList=carController.getCarList();

        for(int i=0;i<carList.size();i++){
            System.out.println(i+" CarType:"+carList.get(i).getCarType()+" CarColor:"+carList.get(i).getVehicleColor()+" CarMake:"+carList.get(i).getCarMake()+" Price:"+carList.get(i).getPrice()+" Location:"+carList.get(i).getLocation());
        }

    }
}
