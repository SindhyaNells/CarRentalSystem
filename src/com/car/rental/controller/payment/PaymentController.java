package com.car.rental.controller.payment;

import java.util.Date;

/**
 * Created by sindhya on 8/5/17.
 */
public class PaymentController {


    public float calculateRent(Date startDate,Date endDate, float amt){

        int numDays=(int)( (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        return numDays*amt;
    }

    public void payRent(PaymentStrategy paymentStrategy,float amount){
        paymentStrategy.pay(amount);
    }

}
