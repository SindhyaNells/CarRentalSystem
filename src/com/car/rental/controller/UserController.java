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


    public User register(int user_type,int user_id,String user_name,String email_id,String password,Address address,String contact){
        User user=null;
        if(user_type==1){
            user=new Owner(user_id,user_name,email_id,password,address,contact);
            userList.add(user);

        }else if(user_type==2){
            user=new Renter(user_id,user_name,email_id,password,address,contact);
            userList.add(user);
        }
        return user;
    }



}
