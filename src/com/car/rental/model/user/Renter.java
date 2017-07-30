package com.car.rental.model.user;

/**
 * Created by sindhya on 7/29/17.
 */
public class Renter extends User{


    private String renterRating;
    private String renterComments;

    public Renter(String user_id,String user_name,String user_email,String user_password,Address user_address){
        super(user_id,user_name,user_email,user_password,user_address);
    }

    public String getRenterRating() {
        return renterRating;
    }

    public void setRenterRating(String renterRating) {
        this.renterRating = renterRating;
    }

    public String getRenterComments() {
        return renterComments;
    }

    public void setRenterComments(String renterComments) {
        this.renterComments = renterComments;
    }
}
