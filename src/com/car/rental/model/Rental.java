package com.car.rental.model;

import java.util.Date;

/**
 * Created by sindhya on 7/30/17.
 */
public class Rental {
    private Date availabilityDate;
    private float rentPerDay;
    private float penaltyFeePerDay;
    private String pickUpAddress; //same as dropoff address
    private float totalAmountPayable;

}
