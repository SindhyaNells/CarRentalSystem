package com.car.rental;

import com.car.rental.controller.car.CarController;
import com.car.rental.controller.user.UserController;
import com.car.rental.model.user.User;

import java.util.Scanner;

/**
 * Created by sindhya on 7/30/17.
 */
public class CarRentalTest {


    private static Scanner scanner;
    public static void main(String args[]){

        System.out.println("Car Rental Management System");

        do {
            try{

                System.out.println("Choose an option");
                System.out.println("1.Create User 2.List Car 3.Search Car 4.Sort Car 5.Rent Car 6.Return Car 7.Exit");
                scanner=new Scanner(System.in);
                int option=scanner.nextInt();

                if(option==1){
                    registerUser();
                }else if(option==2){
                    listCar();
                }else if(option==3){
                    CarController carController = CarController.getInstance();
                    carController.searchCar();
                }else if(option == 4){
                    CarController carController = CarController.getInstance();
                    carController.sortCars();
                }else if(option == 5){
                    rentCar();
                }else if(option == 6){
                    returnCar();
                }else if(option == 7){
                    break;
                }


            } catch(Exception e) {
                continue;
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

    private static User registerUser(){

        System.out.println("Choose User");
        System.out.println("1.Owner 2.Renter");
        scanner=new Scanner(System.in);
        int user_type = scanner.nextInt();

        UserController userController=UserController.getInstance();

        User user=userController.register(user_type);

        return user;
    }

    private static void listCar(){


        System.out.println("Enter the username:");
        scanner=new Scanner(System.in);
        String user_name=scanner.nextLine();
        UserController userController=UserController.getInstance();
        CarController carController = CarController.getInstance();
        if(userController.isValidUser(user_name)){
            User user=userController.getUserByUserName(user_name);
            carController.addCar(user);
        }else{
            System.out.println("Please enter a valid user name");
        }

    }

    public static void rentCar(){

        System.out.println("Enter the username:");
        scanner=new Scanner(System.in);
        String user_name=scanner.nextLine();
        UserController userController=UserController.getInstance();
        CarController carController = CarController.getInstance();
        if(userController.isValidUser(user_name)){
            User user=userController.getUserByUserName(user_name);
            carController.rentCar(user);
        }else{
            System.out.println("Please enter a valid user name");
        }

    }

    public static void returnCar(){
        System.out.println("Return car");

    }
}
