package com.car.rental.controller;

import com.car.rental.model.user.Address;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.Renter;
import com.car.rental.model.user.User;

import java.util.ArrayList;

/**
 * Created by sindhya on 7/30/17.
 */
public class UserController {


    private ArrayList<User> userList=new ArrayList<>();


    public ArrayList<User> getUserList() {
        return userList;
    }

    public Owner registerOwner(int user_id, String user_name, String email_id, String password, Address address, String contact) {
        Owner owner=new Owner(user_id,user_name,email_id,password,address,contact);

        userList.add(owner);

        return owner;
    }

    public Renter registerRenter(int user_id,String user_name,String email_id,String password,Address address,String contact) {
        Renter renter=new Renter(user_id,user_name,email_id,password,address,contact);

        userList.add(renter);

        return renter;
    }



}
