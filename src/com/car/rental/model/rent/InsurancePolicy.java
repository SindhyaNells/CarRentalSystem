package com.car.rental.model.rent;

import java.math.BigDecimal;

/**
 * Created by sindhya on 7/30/17.
 */
public class InsurancePolicy{
    private String policyName;
    private BigDecimal price;

    public InsurancePolicy(String policy_name,BigDecimal price){

        this.policyName=policy_name;
        this.price=price;

    }

}
