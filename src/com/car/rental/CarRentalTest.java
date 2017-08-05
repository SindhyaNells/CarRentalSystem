package com.car.rental;

import com.car.rental.controller.CarController;
import com.car.rental.controller.UserController;
import com.car.rental.controller.sort.PriceSortingStrategy;
import com.car.rental.controller.sort.RateSortingStrategy;
import com.car.rental.model.car.Car;
import com.car.rental.model.car.Vehicle;
import com.car.rental.model.user.User;

import java.util.List;
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
                System.out.println("1.Create User 2.List Car 3.Search Car 4.Sort Car 5.Rent Car 6.Return Car");
                scanner=new Scanner(System.in);
                int option=scanner.nextInt();

                if(option==1){
                    registerUser();
                }else if(option==2){
                    listCar();
                }else if(option==3){
                    CarController carController=new CarController();
                    carController.searchCar();
                }else if(option == 4){
                    CarController carController=new CarController();
                    carController.sortCars();
                }else if(option == 5){
                    CarController carController=new CarController();

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

        UserController userController=new UserController();

        User user=userController.register(user_type);

        return user;
    }

    private static void listCar(){


        System.out.println("Enter the username");
        scanner=new Scanner(System.in);
        String user_name=scanner.nextLine();
        UserController userController=new UserController();
        CarController carController=new CarController();
        if(userController.isValidUser(user_name)){
            User user=userController.getUserByUserName(user_name);
            carController.addCar(user);
        }else{
            System.out.println("Please enter a valid user name");
        }

    }

    public static void rentCar(){

        System.out.println("Rent Car");

        CarController carController=new CarController();

        List<Car> carList=carController.getCarList().getCarList();

        for(int i=0;i<carList.size();i++){
            System.out.println(i+" CarType:"+carList.get(i).getCarType()+" CarColor:"+carList.get(i).getVehicleColor()+" CarMake:"+carList.get(i).getCarMake()+" Price:"+carList.get(i).getPrice()+" Location:"+carList.get(i).getLocation());
        }

        System.out.println("Select car:");
        scanner=new Scanner(System.in);
        int car_id=scanner.nextInt();

        Vehicle car= (Vehicle) carList.get(car_id);



    }
}
