package com.car.rental.model.enums;

/**
 * Created by sindhya on 7/30/17.
 */
public enum Location {
    SANFRANCISCO("San Francisco", "CALIFORNIA"),
    DALLAS("Dallas", "TEXAS"),
    SEATTLE("Seattle", "WASHINGTON"),
    PORTLAND("Portland", "OREGON"),
    LOSANGELES("Los Angeles", "CALIFORNIA"),
    NEWYORK("New York", "NEW YORK");

    private String city;
    private String state;

    Location(String city,String state){
        this.state=state;
        this.city=city;
    }

    public static Location fromLocation(String loc){
        for(Location location:values()){
            if(location.city.equals(loc)){
                return location;
            }
        }
        return null;
    }
}
