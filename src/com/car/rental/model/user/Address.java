package com.car.rental.model.user;

/**
 * Created by sindhya on 7/30/17.
 */
public class Address {

    private String doorNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String door_number,String street,String city,String state,String zip_code){
        this.doorNumber=door_number;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zip_code;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

}
