package com.car.rental.controller;

import com.car.rental.model.user.Address;
import com.car.rental.model.user.Owner;
import com.car.rental.model.user.Renter;

/**
 * Created by sindhya on 7/30/17.
 */
public class UserController {


    public Owner registerOwner(String user_id,String user_name,String email_id,String password,Address address,String contact) {
        Owner owner=new Owner(user_id,user_name,email_id,password,address,contact);

        return owner;
    }

    public Renter registerRenter(String user_id,String user_name,String email_id,String password,Address address,String contact) {
        Renter renter=new Renter(user_id,user_name,email_id,password,address,contact);
        return renter;
    }
}
