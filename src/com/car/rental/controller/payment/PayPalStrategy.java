package com.car.rental.controller.payment;

/**
 * Created by sindhya on 8/5/17.
 */
public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String paypal_pwd;

    public PayPalStrategy(String email, String pwd){
        this.email=email;
        this.paypal_pwd=pwd;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid using Paypal");
        System.out.println("Amount"+amount);
    }
}
