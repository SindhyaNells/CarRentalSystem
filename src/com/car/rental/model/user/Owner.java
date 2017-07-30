package com.car.rental.model.user;

/**
 * Created by sindhya on 7/28/17.
 */
public class Owner extends User{


    private String ownerRating;
    private String ownerComments;

    public Owner(String user_id,String user_name,String user_email,String user_password,Address user_address,String user_contact){
        super(user_id,user_name,user_email,user_password,user_address,user_contact);
    }

    public String getOwnerRating() {
        return ownerRating;
    }

    public void setOwnerRating(String ownerRating) {
        this.ownerRating = ownerRating;
    }

    public String getOwnerComments() {
        return ownerComments;
    }

    public void setOwnerComments(String ownerComments) {
        this.ownerComments = ownerComments;
    }
}
