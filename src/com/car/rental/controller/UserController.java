package com.car.rental.controller;

import com.car.rental.model.user.Address;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.Renter;
import com.car.rental.model.user.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sindhya on 7/30/17.
 */
public class UserController {


    private static Scanner scanner;
    private ArrayList<User> userList=new ArrayList<>();

    public ArrayList<User> getUserList() {
        return userList;
    }


    public User register(int user_type){
        User user=null;

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

        if(user_type==1){
            user=new Owner(userList.size()+1,user_name,user_email,user_pwd,address,contact);
            user.getOwnerRating();
            userList.add(user);

        }else if(user_type==2){
            user=new Renter(userList.size()+1,user_name,user_email,user_pwd,address,contact);
            userList.add(user);
        }
        return user;
    }


//    public User loginUser(String user_email,String password){
//
//        for(int i=0;i<userList.size();i++){
//            User user=userList.get(i);
//            if(user.getEmailId().equals(user_email)){
//
//            }
//        }
//    }




}
