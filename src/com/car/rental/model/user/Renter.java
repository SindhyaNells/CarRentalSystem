package com.car.rental.model.user;

import java.util.ArrayList;

/**
 * Created by sindhya on 7/29/17.
 */
public class Renter extends User{


    private String renterRating;
    private int numOfRatings;
    private int totalPoints;
    private ArrayList<String> renterComments;

    public Renter(int user_id,String user_name,String user_email,String user_password,Address user_address,String user_contact){
        super(user_id,user_name,user_email,user_password,user_address,user_contact);
    }

    public String getRenterRating() {
        return renterRating;
    }

    public void setRenterRating(String renterRating) {
        this.renterRating = renterRating;
    }

    public ArrayList<String> getRenterComments() {
        return renterComments;
    }

    public void setRenterComments(ArrayList<String> renterComments) {
        this.renterComments = renterComments;
    }
}
